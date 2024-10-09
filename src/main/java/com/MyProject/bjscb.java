package com.MyProject;

import java.util.Scanner;

public class bjscb {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum= n*(n+1)/2;
		System.out.println(sum);
	}
}
