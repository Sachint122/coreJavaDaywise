package com.collection;

import java.util.ArrayDeque;

public class ArrayDeque2 {

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
		Object o;
//		Object o = ad.get(5);
//		System.out.println(o);
//		o=ad.get(560);
//		System.out.println(o);
		o = ad.getFirst();
		System.out.println(o);
		o = ad.getLast();
		System.out.println(o);
		Class cl = ad.getClass();
		System.out.println(cl);

		int hashcode = ad.hashCode();
		System.out.println(hashcode);
//		int indexof =ad.indexOf(150);
//		System.out.println(indexof);
//		 indexof =ad.indexOf(1500);
//		System.out.println(indexof);
		boolean empty=ad.isEmpty();
		System.out.println(empty);
		ad.clear();
		empty=ad.isEmpty();
		System.out.println(empty);
	

	}

}
