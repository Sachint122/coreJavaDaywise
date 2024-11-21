package com.exception;

import java.util.Scanner;

class UnderAgeException extends Exception {
	public String getMessage() {
		return "you are to young donot push your life in hell to doing marrige";
	}
}

class OverAgeException extends Exception {
	public String getMessage() {
		return "you are to much old do you want push your life into hell again";
	}
}

class Candiatez {
	int age;

	void collectdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		age = sc.nextInt();
	}

	void verify() throws UnderAgeException, OverAgeException {
		if (age < 18) {
			UnderAgeException uae = new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		} else if (age >= 60) {
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		} else {
			System.out.println("ek baar to hell me jana hi hai lets get marrige");
		}
	}
}

class mandiate {
	void verifCandidate(Candiatez c) {
	try {
		c.collectdata();
		c.verify();
	} catch (OverAgeException|UnderAgeException e) {
		try {
			c.collectdata();
			c.verify();
		} catch (OverAgeException|UnderAgeException e1) {
			try {
				c.collectdata();
				c.verify();
			} catch (OverAgeException|UnderAgeException e2) {
				  System.out.println("you have cross the limit of my patience");
				}
			}
		}
	}
}

public class customException {

	public static void main(String[] args) {
		Candiatez c=new Candiatez();
		mandiate m=new mandiate();
		m.verifCandidate(c);

	}

}
