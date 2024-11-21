package com.october18;

import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		String str = "";
		System.out.println("Entetr your string");
		Scanner sc = new Scanner(System.in);
		str=sc.nextLine();
		String alpha = "", number = "", spacial="";
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
				alpha += str.charAt(i);
			} else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				number += str.charAt(i);
			}
			else {
				spacial+=str.charAt(i);
			}
		}
		System.out.println("aplpha bet is:"+alpha);
		System.out.println("number  is:"+number);
		System.out.println("spacial  is:"+spacial);

	}

}
