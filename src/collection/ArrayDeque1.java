package com.collection;

import java.util.ArrayList;
import java.util.ArrayDeque;

public class ArrayDeque1 {

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
//		ad.add(3, 300);
		ad.addFirst(1000);
		ad.addLast(2000);
		System.out.println("original ");
		System.out.println(ad);
		ArrayList al=new ArrayList();
		al.add(true);
		al.add(3242.3);
		al.add(423);
		al.add('s');
		al.add(143);
	    ad.addAll(al);
//	    ad.addAll(2,al);
		ad.push("pandey");
		System.out.println("after the add collection");
		System.out.println(ad);
		ad.pop();
		System.out.println(ad);

	}

}
