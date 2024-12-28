package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		LinkedList al = new LinkedList();
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
		al.add(3,300);
		al.addFirst(1000);
		al.addLast(2000);
		System.out.println(al);
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
	    al.addAll(al1);
	    System.out.println(al);
	    al.addAll(3, al1);
	    al.push("pandey");
	    System.out.println(al);
	    al.pop();
	    System.out.println(al);

	}

}
