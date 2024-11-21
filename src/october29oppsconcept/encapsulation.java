package com.october29oppsconcept;

import java.util.Scanner;

class Dog {
	String name;
	String color;
	String breed;
	int cost, age;

	void setDataStatic() {
		name = "Toomy";
		color = "red";
		breed = "golden";
		cost = 500;
		age = 2;
	}

	void setDataDynamic(String s1, String s2, String s3, int i, int j) {
		name = s1;
		color = s2;
		breed = s3;
		cost = i;
		age = j;
	}

	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(age);
	}

}

public class encapsulation {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Dog d=new Dog();
		d.getData();
		d.setDataStatic();
		d.getData();
		Dog d1=new Dog();
		System.out.println("enter the name of dog");
		String name=sc.next();
		System.out.println("enter the color of dog");
		String color=sc.next();
		System.out.println("enter the breed of dog");
		String breed=sc.next();
		System.out.println("enter the cost of dog");
	    int cost=sc.nextInt();
	    System.out.println("enter the age of dog");
	    int age=sc.nextInt();
	    d1.setDataDynamic(name, color, breed, cost, age);
	    d1.getData();

	}

}
