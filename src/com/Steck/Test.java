package com.Steck;

public class Test {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());

		System.out.println(s.pop());

		System.out.println(s.pop());
		s.print();

	}

}
