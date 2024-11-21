package com.october18;

import java.util.Scanner;

public class program5 {
	public static String reve(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		return result;
	}

	public static void main(String[] args) {
		String str = "";
		System.out.println("Entetr your string");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		String temp = "";
		String reverse = "";
		for (int i = 0; i < str.length(); i++) {
			temp += str.charAt(i);
			if (str.charAt(i) == ' ') {
				reverse += reve(temp);
				temp = "";
			}
		}
		reverse += ' ';
		reverse += reve(temp);
		System.out.println(reverse);
	}

}
