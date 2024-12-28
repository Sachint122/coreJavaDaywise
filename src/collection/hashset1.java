package com.collection;

import java.util.HashSet;

public class hashset1 {

	public static void main(String[] args) {
		HashSet  hs = new HashSet();
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
//		hs.add(3,300);
		Object oo=800;
//		ts.ad
//		hs.addFirst(oo);
//		ts.addLast(oo);
//		ts.addLast(oo);
		System.out.println(hs);
		System.out.println("original");
		HashSet al1 = new HashSet();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		hs.addAll(al1);
	    System.out.println(hs);
//	    hs.push("pandey");
//	    System.out.println(hs);
//	    ts.pop();
//	    System.out.println(hs);

	}

}
