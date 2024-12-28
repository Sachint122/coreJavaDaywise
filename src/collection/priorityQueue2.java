package com.collection;

import java.util.PriorityQueue;

public class priorityQueue2 {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(100);
		pq.add(20);
		pq.add(20);
		pq.add(150);
//		pq.add("sachin");
//		pq.add(true);
//		pq.add(3242.3);
		pq.add(423);
//		pq.add('s');
		pq.add(143);
		Object o;
//		Object o = pq.get(5);
//		System.out.println(o);
//		o=ad.get(560);
//		System.out.println(o);
//		o = pq.getFirst();
//		System.out.println(o);
//		o = pq.getLast();
//		System.out.println(o);
		Class cl = pq.getClass();
		System.out.println(cl);

		int hashcode = pq.hashCode();
		System.out.println(hashcode);
//		int indexof =ad.indexOf(150);
//		System.out.println(indexof);
//		 indexof =ad.indexOf(1500);
//		System.out.println(indexof);
		boolean empty = pq.isEmpty();
		System.out.println(empty);
		pq.clear();
		empty = pq.isEmpty();
		System.out.println(empty);
	}
}
