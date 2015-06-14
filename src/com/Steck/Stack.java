package com.Steck;

public class Stack<T> {

	private class Node<T> {
		private T value;
		private Node<T> link;

		public Node(T value, Node<T> link) {
			this.value = value;
			this.link = link;
		}

		public Node(T value) {
			this.value = value;
		}

	}

	private Node<T> top;
	private int length;

	public Stack() {
		top = null;
	}

	public void push(T value) {
		if(top == null){
			top = new Node<T>(value, null);
		} else{
			Node<T> node = new Node<T>(value, top);
			top = node;
			node = null;
		}
		length++;
	}
	
	public T pop(){
		if(length > 0){
			length--;
			Node<T> node = top;
			top = top.link;
			T value = node.value;
			node = null;
			return value;
			
		}
		System.out.println("Stack is empty");
		return null;
	}
	public void print(){
		Node<T> node = top;
		for (int i = 0; i < length; i++) {
			System.out.print(node.value + " ");
			node = node.link;
		}
	}

}
