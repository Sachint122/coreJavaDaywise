package com.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class hashset3 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(20);
		hs.add(20);
		hs.add(150);
		hs.add("sachin");
		hs.add(true);
		hs.add(3242.3);
		hs.add(423);
		hs.add('s');
		hs.add(143);
		System.out.println("original");
//		hs.addFirst(4);
		System.out.println(hs);
//		int i=ad.lastIndexOf(20);
		Object obj=143;
		hs.remove(obj);
		System.out.println("updated");
		System.out.println(hs);
//		hs.removeFirst();
//		System.out.println("remoeve first");
//		System.out.println(hs);
//		hs.removeLast();
//		System.out.println("remoeve last");
//		System.out.println(hs);
		TreeSet al=new TreeSet();
//		al.add(true);
//		al.add(3242.3);
		al.add(423);
//		al.add('s');
		al.add(100);
//		System.out.println("Array list");
//		System.out.println(al);
	    hs.removeAll(al);
	    System.out.println("remove all");
	    System.out.println(hs);
//	    hs.offer(12);
//	    System.out.println(hs);
//	    hs.offerFirst(1000);
//	    System.out.println(hs);
//	    hs.offerLast(1001);
//	    System.out.println(ad);
//	    obj=hs.peek();
//	    System.out.println(obj);
//	    obj=hs.peekFirst();
//	    System.out.println(obj);
//	    obj=hs.peekLast();
//	    System.out.println(obj);
//	    obj=hs.poll();
//	    System.out.println(hs+""+obj);// remove from first index
	    hs.add(300);
		hs.add(250);
		hs.add(200);
		System.out.println(hs);
//	    hs.pollFirst();
//	    System.out.println(hs); // ihs also remove from first index
//	    hs.pollLast();
//	    System.out.println(hs);// ihs remove from last index
////	    

	}
}
