package com.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(2);
		list.add(1);
		list.add(8);
		list.add(4);
		list.addAfter(1, 100);
		list.deleteBefore(4);
		list.print();

	}

}
