package com.BinaryOrderTree;

public class BinaryOrderTree<T extends Comparable> {

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
			this(value, null, null);
		}
	}

	private Node<T> root;

	public void add(T value) throws Exception {
		root = add(root, value);

	}

	private Node<T> add(Node<T> node, T value) throws Exception {
		if (node == null) {
			node = new Node<T>(value);
		} else if (value.compareTo(node.value) > 0) {
			node.right = add(node.right, value);
		} else if (value.compareTo(node.value) < 0) {
			node.left = add(node.left, value);
		} else {
			throw new Exception("Duplicate value");
		}
		return node;
	}

	public boolean search(T value) {
		return search(root, value);
	}

	private boolean search(Node<T> node, T value) {
		while (node != null) {
			if (value.compareTo(node.value) > 0) {
				node = node.right;
			} else if (value.compareTo(node.value) < 0) {
				node = node.left;
			} else {
				return true;
			}
		}
		return false;
	}

	public void delete(T value) {
		delete(root, value);
	}

	private Node<T> delete(Node<T> node, T value) {
		if (node != null) {
			if (node.value.compareTo(value) == 0) {
				if (node.left != null && node.right != null) {
					Node<T> min = findMin(node.right);
					node.value = min.value;
					if (min.value.compareTo(node.right.value) != 0) {
						removeMin(node.right);
					} else{
						node.right = min.right;
					}

				} else if (node.left == null && node.right == null) {
					node = null;
				} else {
					node = (node.right != null) ? node.right : node.left;
				}
			} else if (value.compareTo(node.value) > 0) {
				node.right = delete(node.right, value);
			} else {
				node.left = delete(node.left, value);
			}
		}
		return node;
	}

	private Node<T> findMin(Node<T> node) {
		while (node.left != null) {
			node = node.left;
		}
		return node;
	}

	public void removeMin() {
		System.out.println();
	}

	

	private Node<T> removeMin(Node<T> node) {
		if (node.left != null) {
			node.left = removeMin(node.left);
			return node;
		} else {
			return node.right;
		}
	}

	private void print(Node<T> node) {
		if (node != null) {
			print(node.left);
			System.out.print(node.value + " ");

			print(node.right);
		}
	}

	public void print() {
		print(root);
	}
}