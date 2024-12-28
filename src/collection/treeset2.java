package com.collection;

import java.util.TreeSet;

public class treeset2 {
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
//	    ts.add(3,300);
		Object o;
//		Object o = ts.get(5);
//		System.out.println(o);
//		o=ad.get(560);
//		System.out.println(o);
		o = ts.getFirst();
		System.out.println(o);
		o = ts.getLast();
		System.out.println(o);
		Class cl = ts.getClass();
		System.out.println(cl);

		int hashcode = ts.hashCode();
		System.out.println(hashcode);
//		int indexof =ts.indexOf(150);
//		System.out.println(indexof);
//		 indexof =ad.indexOf(1500);
//		System.out.println(indexof);
		boolean empty=ts.isEmpty();
		System.out.println(empty);
		ts.clear();
		empty=ts.isEmpty();
		System.out.println(empty);
	}
}
