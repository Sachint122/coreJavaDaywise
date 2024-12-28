package com.collection;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class priorityQueue {

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
//		ad.add(3, 300);
//		ad.addFirst(1000);
//		ad.addLast(2000);
		System.out.println("original ");
		System.out.println(pq);
		PriorityQueue al=new PriorityQueue();
//		al.add(true);
//		al.add(3242.3);
		al.add(423);
//		al.add('s');
		al.add(300);
		al.add(400);
		al.add(143);
	    pq.addAll(al);
//		ad.push("pandey");
		System.out.println("after the add collection");
		System.out.println(pq);
//		ad.pop();
//		System.out.println(pq);

	}

}
