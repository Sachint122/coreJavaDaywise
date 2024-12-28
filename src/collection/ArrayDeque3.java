package com.collection;

import java.util.ArrayList;
import java.util.ArrayDeque;

public class ArrayDeque3 {

	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(100);
		ad.add(20);
		ad.add(20);
		ad.add(150);
		ad.add("sachin");
		ad.add(true);
		ad.add(3242.3);
		ad.add(423);
		ad.add('s');
		ad.add(143);
		System.out.println("original");
		System.out.println(ad);
//		int i=ad.lastIndexOf(20);
		int i=0;
		System.out.println(i);
		ad.remove(i);
		System.out.println(ad);
		Object obj=143;
		ad.remove(obj);
		System.out.println(ad);
		ad.removeFirst();
		System.out.println(ad);
		ad.removeLast();
		System.out.println(ad);
		ArrayDeque al=new ArrayDeque();
		al.add(true);
		al.add(3242.3);
		al.add(423);
		al.add('s');
		al.add(143);
//		System.out.println("Array list");
//		System.out.println(al);
	    ad.removeAll(al);
	    System.out.println(ad);
	    ad.offer(12);
	    System.out.println(ad);
	    ad.offerFirst(1000);
	    System.out.println(ad);
	    ad.offerLast(1001);
	    System.out.println(ad);
	    obj=ad.peek();
	    System.out.println(obj);
	    obj=ad.peekFirst();
	    System.out.println(obj);
	    obj=ad.peekLast();
	    System.out.println(obj);
	    obj=ad.poll();
	    System.out.println(ad+""+obj);// remove from first index
	    ad.pollFirst();
	    System.out.println(ad); // its also remove from first index
	    ad.pollLast();
	    System.out.println(ad);// its remove from last index
	    

	}

}
