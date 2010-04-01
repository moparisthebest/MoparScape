package com.rs2hd.util;

import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.rs2hd.model.Entity;

public class EntityList<T extends Entity> extends AbstractCollection<T> {
	private static final int DEFAULT_CAPACITY = 1600, MIN_VALUE = 1;
	public Object[] entities;
	public Set<Integer> indicies = new HashSet<Integer>();
	public int curIndex = MIN_VALUE;
	public int capacity;

	public EntityList(int capacity) {
		entities = new Object[capacity];
		this.capacity = capacity;
	}

	public EntityList() {
		this(DEFAULT_CAPACITY);
	}

	public boolean add(T entity) {
		add(entity, curIndex);
		return true;
	}

	public void remove(T entity) {
		entities[entity.getIndex()] = null;
		indicies.remove(entity.getIndex());
		decreaseIndex();
	}

	@SuppressWarnings("unchecked")
	public T remove(int index) {
		Object temp = entities[index];
		entities[index] = null;
		indicies.remove(index);
		decreaseIndex();
		return (T) temp;
	}

	@SuppressWarnings("unchecked")
	public T get(int index) {
		return (T) entities[index];
	}

	public void add(T entity, int index) {
		if (entities[curIndex] != null) {
			increaseIndex();
			add(entity, curIndex);
		} else {
			entities[curIndex] = entity;
			entity.setIndex(index);
			indicies.add(curIndex);
			increaseIndex();
		}
	}

	public Iterator<T> iterator() {
		return new EntityListIterator<T>(entities, indicies, this);
	}

	public void increaseIndex() {
		curIndex++;
		if (curIndex >= capacity) {
			curIndex = MIN_VALUE;
		}
	}

	public void decreaseIndex() {
		curIndex--;
		if (curIndex <= capacity)
			curIndex = MIN_VALUE;
	}

	public boolean contains(T entity) {
		return indexOf(entity) > -1;
	}

	public int indexOf(T entity) {
		for (int index : indicies) {
			if (entities[index].equals(entity)) {
				return index;
			}
		}
		return -1;
	}

	public int count() {
		return indicies.size();
	}

	public int size() {
		return indicies.size();
	}
}
