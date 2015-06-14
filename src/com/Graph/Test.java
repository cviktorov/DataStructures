package com.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {
		
//		Graph<Integer> g = new Graph<Integer>();
//		g.addVertex(1);
//		g.addVertex(2);
//		g.addVertex(3);
//		g.addVertex(4);
//		g.addVertex(5);
//		g.addVertex(6);
//		g.addVertex(7);
//		g.addEdge(1, 2);
//		g.addEdge(2, 3);
//		g.addEdge(3, 4);
//		g.addEdge(4, 5);
//		g.addEdge(5, 7);
//		g.addEdge(5, 6);
//		g.addEdge(3, 6);
//		g.addEdge(1, 4);
//		ArrayList<Integer> list = new ArrayList<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		
		Graph<String> g = new Graph<String>();
		g.addVertex("1");
		g.addVertex("2");
		g.addVertex("3");
		g.addVertex("4");
		g.addVertex("5");
		g.addVertex("6");
		g.addVertex("7");
		g.addEdge("1", "2");
		g.addEdge("2", "3");
		g.addEdge("3", "4");
		g.addEdge("4", "5");
		g.addEdge("5", "7");
		g.addEdge("5", "6");
		g.addEdge("3", "6");
		g.addEdge("1", "4");
		ArrayList<String> list = new ArrayList<String>();
		//g.allWays("1", "6");
		g.bfs("1", "7", list);

	}

}
