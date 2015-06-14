package com.BinaryTree;

public class BinaryTree<T extends Comparable<T>> {

	private class Node<T> {
		private T value;
		private Node<T> left;
		private Node<T> right;

		public Node(T value, Node<T> left, Node<T> right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}

		public Node(T value) {
			this.value = value;
			this.left = this.right = null;
		}
	}

	private Node<T> root;

	public BinaryTree(T value) {
		this.root = new Node(value);
	}

	public BinaryTree(T value, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
		this.root = new Node<T>(value);
		root.left = leftTree != null ? leftTree.root : null;
		root.right = rightTree != null ? rightTree.root : null;
	}

	private void print(Node<T> root) {
		if (root != null) {
			System.out.print(root.value + " ");
			print(root.left);
			print(root.right);
		}
	}

	public void print() {
		print(root);
		System.out.println();
	}

	public boolean search(T value){
		boolean[] flag={false};
		search(root, value, flag);
		return flag[0];
	}
	
	private void search(Node<T> node, T value, boolean[] flag) {
		if (node != null) {
			if (node.value == value) {
				flag[0] = true;
			} else if (value.compareTo(node.value) > 0) {
				search(node.right, value, flag);
			} else if (value.compareTo(node.value) < 0) {
				search(node.left, value, flag);
			} 
		} 
	}

	private void depth(Node<T> node, Integer[] length, Integer helper) {
		if (node != null) {
			depth(node.left, length, ++helper);
			if (helper > length[0]) {
				length[0] = helper;
			}
			helper--;
			depth(node.right, length, ++helper);
			if (helper > length[0]) {
				length[0] = helper;
			}
			helper--;
		}
	}

	public int depth2(){
		return depth(root);
	}
	
	private int depth(Node<T> node){
		if(node == null){
			return 0;
		}
		return 1 + Math.max(depth(node.left), depth(node.right));
	}
	
	public Integer depth() {
		Integer[] len = { 0 };
		Integer helper = 0;
		depth(root, len, helper);
		return len[0];
	}

}
