package com.Queue;

public class Queue<T> {

	private class Node<T> {
		private T value;
		private Node<T> link;

		public Node(T value) {
			this.value = value;
		}

		public Node(T value, Node<T> link) {
			this.value = value;
			this.link = link;
		}
	};

	private Node<T> start;
	private Node<T> end;
	private int length;

	public Queue() {
		start = end = null;
		length = 0;
	}

	public void put(T value) {
		if (start == null) {
			start = new Node<T>(value);
			end = start;
		} else {
			Node<T> node = new Node<T>(value);
			end.link = node;
			end = node;
		}
		length++;
	}

	public T get() {
		if (length > 0) {
			T value = start.value;
			Node<T> node = start;
			start = start.link;
			node = null;
			length--;
			return value;
		}
		System.out.println("Queue is empty");
		return null;

	}

	public void print() {
		Node<T> node = start;
		for (int i = 0; i < length; i++) {
			System.out.print(node.value + " ");
			node = node.link;
		}
	}

}
