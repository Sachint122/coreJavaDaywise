package com.exception;

import java.util.Scanner;

class opp1{
	void function1() {
		System.out.println("enter the function1");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("enter the denometor");
		int den=sc.nextInt();
		int res=num/den;
		System.out.println(res);
		System.out.println("leave the function1");
	}
}
class opp2{
	void function2() {
		System.out.println("enter the funcrtion 2");
		opp1 p1=new opp1();
		p1.function1();
		System.out.println("leave the function 2");
		
	}
}
class opp3{
	void function3() {
		System.out.println("enter the funcrtion 3");
		opp2 p2=new opp2();
		p2.function2();
		System.out.println("leave the function 3");
		
	}
}

public class duckingException {

	public static void main(String[] args) {
		System.out.println("enter the main");
		opp3 p3=new opp3();
		p3.function3();
		System.out.println("leave the main");

	}

}
