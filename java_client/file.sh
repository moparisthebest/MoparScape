#!/bin/sh
find bin/ -type f -perm -o+rx -exec ls -lah {} \;
find bin/ -type f -perm -o+rx -exec file {} \;