package com.collection;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(20);
		al.add(20);
		al.add(150);
		al.add("sachin");
		al.add(true);
		al.add(3242.3);
		al.add(423);
		al.add('s');
		al.add(143);
//		al.clear();
		System.out.print(al);
		ArrayList al1 = (ArrayList) al.clone();
		System.out.println(al1);
		boolean res = al.contains(100);
		System.out.println(res);
		al.contains(13);
		System.out.println(res);
		al.contains("sachin");
		System.out.println(res);
		al.contains(false);
		System.out.println(res);
		ArrayList al2 = new ArrayList();
		al2.add(100);
		res = al.containsAll(al2);
		System.out.println(res);
		Object o = al.get(5);
		System.out.println(o);
//		o=al.get(560);
//		System.out.println(o);
		o = al.getFirst();
		System.out.println(o);
		o = al.getLast();
		System.out.println(o);
		Class cl = al.getClass();
		System.out.println(cl);
		System.out.println( al instanceof ArrayList);

		int hashcode = al.hashCode();
		System.out.println(hashcode);

	}

}
