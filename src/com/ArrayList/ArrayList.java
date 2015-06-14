package com.ArrayList;

import java.util.Arrays;


public class ArrayList {
	private Object items[];
	private int length;
	private static final int CAPACITY = 10;

	public ArrayList() {
		this(new Object[CAPACITY], 0);
	}

	public ArrayList(Object[] items, int length) {
		setItems(items);
		setLength(length);
	}

	public ArrayList(ArrayList l) {
		this(l.items, l.length);
	}

	public void add(Object item) throws Exception {
		if (length < CAPACITY) {
			items[length] = item;
			length++;
		} else {
			throw new Exception();
		}
	}

	public void delete(int index) {
		int k = index;
		for (int i = index + 1; i < items.length; i++) {
			items[k] = i;
			k++;
		}
	}

	public Object[] getItems() {
		Object arr[] = new Object[CAPACITY];
		for (int i = 0; i < CAPACITY; i++) {
			arr[i] = items[i];
		}
		return items;
	}

	public void setItems(Object items[]) {
		this.items = new Object[CAPACITY];
		for (int i = 0; i < CAPACITY; i++) {
			this.items[i] = items[i];
		}
	}

	public int getLength() {
		return length;
	}

	public void setLength(int leng1th) {
		this.length = leng1th;
	}

	@Override
	public String toString() {
		return "ArrayList [items=" + Arrays.toString(items) + ", length="
				+ length + "]";
	}

}
