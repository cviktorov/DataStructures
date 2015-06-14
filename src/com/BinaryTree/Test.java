package com.BinaryTree;

public class Test {

	public static void main(String[] args) {
		BinaryTree<Integer> t = new BinaryTree<Integer>(1, new BinaryTree<Integer>(2), 
				new BinaryTree<Integer>(3, new BinaryTree<Integer>(4),
						new BinaryTree<Integer>(5,new BinaryTree<Integer>(6),null)));
		
			t.print();
			System.out.println(t.depth());
			System.out.println(t.depth2());
			System.out.println(t.search(9));
	}

}
