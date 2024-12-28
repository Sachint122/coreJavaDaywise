package com.collection;

import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(20);
		ts.add(20);
		ts.add(150);
//		ts.add("sachin");
//		ts.add(true);
//		ts.add(3242.3);
		ts.add(423);
//		ts.add('s');
		ts.add(143);
//		ts.add(3,300);
		Object oo=800;
//		ts.ad
//		ts.addFirst(oo);
//		ts.addLast(oo);
//		ts.addLast(oo);
		System.out.println(ts);
		System.out.println("original");
		TreeSet al1 = new TreeSet();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
	    ts.addAll(al1);
	    System.out.println(ts);
	    ts.addAll(al1);
//	    ts.push("pandey");
	    System.out.println(ts);
//	    ts.pop();
	    System.out.println(ts);

	}

}
