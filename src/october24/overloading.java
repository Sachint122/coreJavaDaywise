package com.october24;

class calculator {
	int add(int a, int b) {
		return a + b;
	}

	float add(int a, float b) {
		return a + b;
	}

	float add(float a, float b) {
		return a + b;
	}

	float add(float a, int b) {
		return a + b;
	}

	double add(int a, double b) {
		return a + b;
	}

	double add(float a, double b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}

	double add(int a, double b, float c) {
		return a + b + c;
	}
}

public class overloading {

	public static void main(String[] args) {
		calculator c = new calculator();
		System.out.println(c.add(1, 2));
		System.out.println(c.add(2, 0.3f));
		System.out.println(c.add(0.3f, 0.3f));
		System.out.println(c.add(2, 0.3d, 0.3f));
	}

}
