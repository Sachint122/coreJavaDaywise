package com.exception;

import java.util.Scanner;

public class trycatchfinaly {
	public static void main(String[] args) {
		try {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num1");
		int num1=sc.nextInt();
		System.out.println("Enter the num2");
		int num2=sc.nextInt();
		int res=num1/num2;
		System.out.println(res);
		}
		catch(Exception e){
			System.out.println("Exception handled");
		}
		finally {
			System.out.println("hi i  m finnaly block");
		}
	}
}
