package com.october23;
import java.util.Scanner;

public class sumAndProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String str=sc.next();
		int sum=0;
		long product=1;
		for (int i = 0; i < str.length(); i++) {
			sum+=str.charAt(i);
			product*=str.charAt(i);
		}
		System.out.println(sum+"  "+product);

	}

}
