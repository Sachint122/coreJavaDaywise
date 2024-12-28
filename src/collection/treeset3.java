package com.collection;

import java.util.TreeSet;

public class treeset3 {
	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(20);
		ts.add(150);
//		ts.add("sachin");
//		ts.add(true);
//		ts.add(3242.3);
		ts.add(423);
//		ts.add('s');
		ts.add(143);
		System.out.println("original");
//		ts.addFirst(4);
		System.out.println(ts);
//		int i=ad.lastIndexOf(20);
		Object obj=143;
		ts.remove(obj);
		System.out.println("updated");
		System.out.println(ts);
		ts.removeFirst();
		System.out.println("remoeve first");
		System.out.println(ts);
		ts.removeLast();
		System.out.println("remoeve last");
		System.out.println(ts);
		TreeSet al=new TreeSet();
//		al.add(true);
//		al.add(3242.3);
		al.add(423);
//		al.add('s');
		al.add(100);
//		System.out.println("Array list");
//		System.out.println(al);
	    ts.removeAll(al);
	    System.out.println("remove all");
	    System.out.println(ts);
//	    ts.offer(12);
//	    System.out.println(ts);
//	    ts.offerFirst(1000);
//	    System.out.println(ts);
//	    ts.offerLast(1001);
//	    System.out.println(ad);
//	    obj=ts.peek();
//	    System.out.println(obj);
//	    obj=ts.peekFirst();
//	    System.out.println(obj);
//	    obj=ts.peekLast();
//	    System.out.println(obj);
//	    obj=ts.poll();
//	    System.out.println(ts+""+obj);// remove from first index
	    ts.add(300);
		ts.add(250);
		ts.add(200);
		System.out.println(ts);
	    ts.pollFirst();
	    System.out.println(ts); // its also remove from first index
	    ts.pollLast();
	    System.out.println(ts);// its remove from last index
//	    
	
	}
}
