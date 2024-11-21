package com.october23;

import java.util.Scanner;

public class find {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String str = sc.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((i % 2 == 0) && ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u')) {
				System.out.println("the even position are:" + i + " :" + str.charAt(i));
				count++;
			}
		}
		System.out.println(count);

	}

}
