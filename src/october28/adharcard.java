package com.october28;

import java.util.Scanner;

class aadhar {
	String name;
	long number;
	String doj;
	static String nationality;
	static {
		nationality = "INDIA";
	}

	void collectdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name :");
		name = sc.next();
		System.out.println("enter the number of addhar card: ");
		number = sc.nextLong();
		System.out.println("enter the birthdate ");
		doj = sc.next();
	}

	void display() {
		System.out.println("name:" + name);
		System.out.println("number:" + number);
		System.out.println("DOB:" + doj);
		System.out.println("nationlity:" + nationality);
	}
}

public class adharcard {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			aadhar a = new aadhar();
			a.collectdata();
			a.display();
		}

	}
}
