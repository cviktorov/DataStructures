package com.Queue;

public class Test {

	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>();
		q.put(2);
		q.put(22);
		q.put(23);
		q.put(24);
		q.put(25);
		q.put(26);
		System.out.println(q.get());
		System.out.println(q.get());
		System.out.println(q.get());
		
		q.print();

	}

}
