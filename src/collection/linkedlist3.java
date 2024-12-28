package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedlist3 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(20);
		ll.add(20);
		ll.add(150);
		ll.add("sachin");
		ll.add(true);
		ll.add(3242.3);
		ll.add(423);
		ll.add('s');
		ll.add(143);
		System.out.println("original");
		System.out.println(ll);
		int i=ll.lastIndexOf(20);
		System.out.println(i);
		ll.remove(i);
		System.out.println(ll);
		Object obj=143;
		ll.remove(obj);
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ArrayList al=new ArrayList();
		al.add(true);
		al.add(3242.3);
		al.add(423);
		al.add('s');
		al.add(143);
//		System.out.println("Array list");
//		System.out.println(al);
//	    ll.removeAll(al);
	    System.out.println(ll);
	    ll.offer(12);
	    System.out.println(ll);
	    ll.offerFirst(1000);
	    System.out.println(ll);
	    ll.offerLast(1001);
	    System.out.println(ll);
	    obj=ll.peek();
	    System.out.println(obj);
	    obj=ll.peekFirst();
	    System.out.println(obj);
	    obj=ll.peekLast();
	    System.out.println(obj);
	    obj=ll.poll();
	    System.out.println(ll+""+obj);// remove from first index
	    ll.pollFirst();
	    System.out.println(ll); // its also remove from first index
	    ll.pollLast();
	    System.out.println(ll);// its remove from last index
	    

	}

}
