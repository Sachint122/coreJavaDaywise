package com.october23;

import java.util.Scanner;

public class addPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String str = sc.next();
		String temp = "";
		String str_encode = "";
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 != 0) {
				temp += (char) ((str.charAt(i) + 5)) + "";
			}
		}
		str_encode = temp;
		temp = "";
		System.out.println(str_encode);
	}

}
