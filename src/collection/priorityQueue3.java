package com.collection;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class priorityQueue3 {
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
		System.out.println("original");
		System.out.println(pq);
//		int i=pq.lastIndexOf(20);
		int i=0;
		System.out.println(i);
		pq.remove(i);
		System.out.println(pq);
		Object obj=143;
		pq.remove(obj);
		System.out.println(pq);
//		pq.removeFirst();
//		System.out.println(pq);
//		pq.removeLast();
//		System.out.println(pq);
		PriorityQueue al=new PriorityQueue();
//		al.add(true);
//		al.add(3242.3);
		al.add(423);
//		al.add('s');
		al.add(143);
//		System.out.println("Array list");
//		System.out.println(al);
	    pq.removeAll(al);
	    System.out.println(pq);
	    pq.offer(12);
	    System.out.println(pq);
	    pq.
//	    pq.offerFirst(1000);
//	    System.out.println(pq);
//	    pq.offerLast(1001);
//	    System.out.println(pq);
	    obj=pq.peek();
	    System.out.println(obj);
//	    obj=pq.peekFirst();
//	    System.out.println(obj);
//	    obj=pq.peekLast();
//	    System.out.println(obj);
	    obj=pq.poll();
	    System.out.println(pq+""+obj);// remove from first index
//	    pq.pollFirst();
//	    System.out.println(pq); // its also remove from first index
//	    pq.pollLast();
//	    System.out.println(pq);// its remove from last index
	    
	}
}