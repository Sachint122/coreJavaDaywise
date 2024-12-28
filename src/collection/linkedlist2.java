package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedlist2 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(20);
		ll.add(20);
		ll.add(150);
		ll.add("sachin");
		ll.add(true);
		ll.add(3242.3);
		ll.add(423);
		ll.add('s');
		ll.add(143);
		
		Object o = ll.get(5);
		System.out.println(o);
//		o=ll.get(560);
//		System.out.println(o);
		o = ll.getFirst();
		System.out.println(o);
		o = ll.getLast();
		System.out.println(o);
		Class cl = ll.getClass();
		System.out.println(cl);

		int hashcode = ll.hashCode();
		System.out.println(hashcode);
		int indexof =ll.indexOf(150);
		System.out.println(indexof);
		 indexof =ll.indexOf(1500);
		System.out.println(indexof);
		boolean empty=ll.isEmpty();
		System.out.println(empty);
		ll.clear();
		empty=ll.isEmpty();
		System.out.println(empty);
	

	}

}
