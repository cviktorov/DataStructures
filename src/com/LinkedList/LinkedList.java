package com.LinkedList;



public class LinkedList<T> {
	private class Node<T> {
		private T value;
		private Node<T> link;
		
		public Node(T value, Node<T> link) {
			this.value = value;
			this.link = link;
		}
		
		public Node(T value) {
			this.value = value;
			this.link = null;
		}
		
	}

	private Node<T> start;
	private Node<T> current;
	private Node<T> end;
	private int count;

	public LinkedList() {
		start = current = end = null;
		count = 0;
	}

	public void add(int a) {
		if (start == null) {
			start = new Node(a);
			end = current = start;
			count++;
		} else {
			Node<T> node = new Node(a);
			current.link = node;
			current = end = node;
			count++;
		}
	}

	public void addAfter(int index, int a) {
		current = start;
		for (int i = 0; i < index - 1; i++) {
			current = current.link;
		}
		Node<T> node = new Node(a);
		node.link = current.link;
		current.link = node;
		count++;
	}

	public void deleteBefore(int index) {
		current = start;
		Node<T> node = start;
		for (int i = 0; i < index - 3; i++) {
			current = current.link;
		}
		for (int i = 0; i < index - 2; i++) {
			node = node.link;
		}
		current.link = node.link;
		node = null;
		count--;
	}

	public void print() {
		Node<T> node = start;
		for (int i = 0; i < count; i++) {
			System.out.print(node.value + " ");
			node = node.link;
		}
	}

	@Override
	public String toString() {
		return "LinkedList2 []";
	}

}
