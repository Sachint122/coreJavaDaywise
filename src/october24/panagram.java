package com.october24;

import java.util.Scanner;

public class panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String str = sc.nextLine();
		str = str.toUpperCase();
		int arr[] = new int[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		for (int i = 0; i < str.length(); i++) {
			int temp = str.charAt(i) - 65;
			arr[temp] = 1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 1) {
				System.out.println("Not a paragram");
				System.exit(0);
			}
		}
		System.out.println("it is a panagram");
	}

}
