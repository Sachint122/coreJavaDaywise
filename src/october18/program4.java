package com.october18;

import java.util.Scanner;

public class program4 {
	public static void main(String[] args) {
		String str = "";
		System.out.println("Entetr your string");
		Scanner sc = new Scanner(System.in);
		str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			int t=str.charAt(i);
			if(t==32) {
				count++;
			}
		}
		System.out.println(++count);
	}
}
