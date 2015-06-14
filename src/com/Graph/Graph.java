package com.Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph<T> {
	LinkedList<LinkedList<T>> graph;

	public Graph() {
		graph = new LinkedList<LinkedList<T>>();

	}

	public void addVertex(T value) {
		LinkedList<T> list = new LinkedList<T>();
		list.add(value);
		graph.add(list);
	}

	public void addEdge(T from, T to) {
		point(from).add(to);
	}

	private LinkedList<T> point(T vetex) {
		for (int i = 0; i < graph.size(); i++) {
			if (graph.get(i).get(0) == vetex) {
				return graph.get(i);
			}
		}
		System.out.println("Vertex dosnt exist!");
		return null;
	}

	private Iterator iterator(T vertex) {
		for (int i = 0; i < graph.size(); i++) {
			if (graph.get(i).get(0) == vertex) {
				return graph.get(i).iterator();
			}
		}
		System.out.println("Vertex dosnt exist!");
		return null;
	}

	public boolean way(T from, T to, ArrayList<T> path) {
		path.add(from);
		if (from == to) {
			return true;
		}
		Iterator iter = iterator(from);
		iter.next();
		while (iter.hasNext()) {
			T current = (T) iter.next();
			if (!path.contains(current)) {
				if (way(current, to, path)) {
					return true;
				}
				path.remove(path.get(path.size() - 1));

			}
		}
		return false;
	}

	private boolean allWays(T from, T to, ArrayList<T> path) {
		path.add(from);
		if (from == to) {
			System.out.println(path.toString());
		}
		Iterator iter = iterator(from);
		iter.next();
		while (iter.hasNext()) {
			T current = (T) iter.next();
			if (!path.contains(current)) {
				if (allWays(current, to, path)) {
					return true;
				}
				path.remove(path.get(path.size() - 1));
			}
		}
		return false;
	}
	
	public void allWays(T from, T to){
		ArrayList<T> list = new ArrayList<T>();
		allWays(from, to, list);
	}
	
	public void bfs(T from, T to, ArrayList<T> path){
		Queue<T> q = new LinkedList<T>();
		q.add(from);
		System.out.println(from);
		path.add(from);
		while(!q.isEmpty()){
			T current = q.poll();
			Iterator iter = iterator(current);
			iter.next();
			T t = null;
			while(iter.hasNext() && !path.contains(t = (T) iter.next())){
				
				q.add(t);
				path.add(t);
				System.out.println(t);
				
				
			}
			//System.out.println(path.toString());
		}
		
	}
	
	
}
