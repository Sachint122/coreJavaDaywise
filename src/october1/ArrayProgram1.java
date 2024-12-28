package com.october1;

import java.util.Scanner;

class ArrayOpration1 {
	int arr[];
	int size;

	void createArray(int n) {
		size = n;
		arr = new int[size];
		System.out.println("Array is created is succesfully");
		System.out.println("===================");
	}

	void addData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("collecting array data ");
		for (int i = 0; i < size; i++) {
			System.out.print("Enter the marks of student no" + (i + 1)+": ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Marks succesfully collected");
		System.out.println("_____________________");

	}

	void displayData() {
		System.out.println("displaying the data");
		for (int i = 0; i < size; i++) {
			System.out.println("The markse of student no " + (i + 1) + "is: " + arr[i]);
		}
	}

}

public class ArrayProgram1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of student==");
		int n = sc.nextInt();

		ArrayOpration1 ao1 = new ArrayOpration1();
		ao1.createArray(n);
		ao1.addData();
		ao1.displayData();
	}

}
