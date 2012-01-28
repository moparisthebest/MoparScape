#!/bin/bash
max_processes=8
#max_processes=0
NUM=0
QUEUE=""

# if max_processes less than or equal to 1, then just wait and return
if [ $max_processes -le 1 ] ; then
	function queue {
		wait $1
	}
else
	function queue {
		QUEUE="$QUEUE $1"
		NUM=$(($NUM+1))
#		echo "QUEUE '$1': $QUEUE"
		wait_processes $max_processes
	}
fi

function wait_processes(){
	while [ $NUM -ge $1 ] # MAX PROCESSES
	do
		checkqueue
		sleep 1
	done
}

function dequeue {
	OLDDEQUEUE=$QUEUE
	QUEUE=""
	for PID in $OLDDEQUEUE
	do
		if [ ! "$PID" = "$1" ] ; then
			QUEUE="$QUEUE $PID"
		fi
	done
	NUM=$(($NUM-1))
#	echo "DEQUEUE '$1': $QUEUE"
}

function checkqueue {
	OLDCHQUEUE=$QUEUE
	for PID in $OLDCHQUEUE
	do
		if [ ! -d /proc/$PID ] ; then
			dequeue $PID
		fi
	done
	#echo "CHECKQUEUE: $QUEUE"
}

function compress_extension(){
	ext=$1
	shopt -s nullglob
	for file in $(ls *.$ext); do
		for i in {1..9}
		do
			echo "gzip -$i $file"
			gzip -c -$i $file > $file.$i.$ext.gz &
			queue $!

			echo "gzip --rsyncable -$i $file"
			gzip --rsyncable -c -$i $file > $file.$i.rsync.$ext.gz &
			queue $!

			echo "bzip2 -$i $file"
			bzip2 -c -$i $file > $file.$i.$ext.bz2 &
			queue $!

			echo "lzma -$i $file"
			lzma -c -$i $file > $file.$i.$ext.lzma &
			queue $!
		done
	done
}

rm -f *.zip *.tar
rm -f *.gz *.bz2 *.lzma
#zip -6 -j complete508.6.zip complete508/*
for file in *; do
	if [ -d $file ]; then
		for i in {0..9}
		do
			zip -q -$i -j $file.$i.zip $file/* &
			queue $!
		done
		zip -q -Z bzip2 -j $file.bzip2.zip $file/* &
		queue $!

		tar -cf $file.tar -C $file . &
		queue $!
	fi
done
echo "waiting for zip files to complete"
wait_processes 1
#exit 0
compress_extension "zip"
compress_extension "tar"
echo "waiting for remaining processes to finish"
wait_processes 1
du *.zip *.tar *.gz *.bz2 *.lzma | sort > sizes.txt
du *.zip *.gz | sort | egrep -v "bzip2.zip$" > sizes_usable.txt
exit;