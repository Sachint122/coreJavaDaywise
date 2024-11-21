package com.october23;

import java.util.Scanner;

public class replaceIndivisual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String str = sc.nextLine();
		str = str.toLowerCase();
		String str_temp = "";
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == 'a')) {
				str_temp += "❤️";

			} else if ((str.charAt(i) == 'e')) {
				str_temp += "@";
			} else if ((str.charAt(i) == 'i')) {
				str_temp += "#";
			} else if ((str.charAt(i) == 'o')) {
				str_temp += "&";
			} else if ((str.charAt(i) == 'u')) {
				str_temp += "*";
			} else {
				str_temp += str.charAt(i);
			}

		}
		str = str_temp;
		System.out.println(str);
	}
}
