package com.BinaryOrderTree;

public class Test {

	public static void main(String[] args) throws Exception {
		BinaryOrderTree<Integer> t = new BinaryOrderTree<Integer>();
		t.add(8);
		t.add(3);
		t.add(12);
		t.add(20);
		t.add(2);
		t.add(9);
		t.add(10);
		t.delete(3);
		t.print();

	}

}
