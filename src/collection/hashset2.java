package com.collection;

import java.util.HashSet;

public class hashset2 {
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
		System.out.println(hs);
		Object o;
//		Object o = hs.get(5);
//		System.out.println(o);
//		o=ad.get(560);
//		System.out.println(o);
//		o = hs.getFirst();
//		System.out.println(o);
//		o = hs.getLast();
//		System.out.println(o);
		Class cl = hs.getClass();
		System.out.println(cl);
		int hashcode = hs.hashCode();
		System.out.println(hashcode);
//		int indexof =hs.indexOf(150);
//		System.out.println(indexof);
//		 indexof =ad.indexOf(1500);
//		System.out.println(indexof);
		boolean empty=hs.isEmpty();
		System.out.println(empty);
		hs.clear();
		empty=hs.isEmpty();
		System.out.println(empty);
	}
}
