package com.october18;

import java.util.Scanner;

public class programm4 {

	public static void main(String[] args) {
		String str = "";
		System.out.println("Entetr your string");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		int capital = 0, number = 0, small = 0, spacial = 0;
		if (str.length() >= 10) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
					capital++;
				}
				if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
					small++;
				}
				if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
					number++;
				}
				if (str.charAt(i) == '@' || str.charAt(i) == '#' || str.charAt(i) == '$' || str.charAt(i) == '%'
						|| str.charAt(i) == '!') {
					spacial++;
				}
			}
		} else {
			System.out.println("password is unvaild");
		}
		if (capital > 0 && number > 0 && small > 0 && spacial > 0) {
			System.out.println("password is vaild");
		} else
			System.out.println("password is unvaild");
	}

}
