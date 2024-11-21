package com.october18;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string:  ");
		String str = sc.next();
		int n = str.length();
		int flag = 0;
		for (int i = 0; i < str.length()/2; i++) {
			if (str.charAt(i) != str.charAt((n - 1 - i))) {
				System.out.println("string are not pailendrom");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("string are pailendorm");
		}

	}

}
