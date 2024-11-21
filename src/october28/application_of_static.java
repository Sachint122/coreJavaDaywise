package com.october28;

import java.util.Scanner;

class Former {
	double principal;
	double time;
	double si;
	static double rate;
	static {
		rate = 2.768;
	}

	void collectdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount of  proincipa:");
		principal = sc.nextDouble();
		System.out.println("enter the time duration:");
		time = sc.nextDouble();
	}

	void calculate() {
		si = (principal * time * rate) / 100;
	}

	void display() {
		System.out.println("the si:" + si);
	}
}

public class application_of_static {
	public static void main(String[] args) {
		Former f1 = new Former();
		f1.collectdata();
		f1.calculate();
		f1.display();
		System.out.println("=================");
		Former f2 = new Former();
		f2.collectdata();
		f2.calculate();
		f2.display();
		System.out.println("=================");
		Former f3 = new Former();
		f3.collectdata();
		f3.calculate();
		f3.display();
	}
}
