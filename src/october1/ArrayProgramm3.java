package com.october1;

import java.util.Scanner;

class Array {
	int arr[][];
	int cls;
	Scanner sc = new Scanner(System.in);

	void createArray(int n) {
		cls = n;
		arr = new int[cls][];
		System.out.println("Enter the student number for each class");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the number of student inside class room no: " + (i + 1) + " ");
			int stu = sc.nextInt();
			arr[i] = new int[stu];
		}
		System.out.println("Array is created is succesfully");
		System.out.println("===================");
	}

	void addData() {

		System.out.println("collecting array data ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("inside the clss room: " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Enter the marks of student no" + (j + 1) + ": ");
				arr[i][j] = sc.nextInt();
			}

		}
		System.out.println("Marks succesfully collected");
		System.out.println("_____________________");

	}

	void displayData() {
		System.out.println("displaying the data");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("inside the clss room: " + i + 1);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("the marks of student no" + (j + 1) + "is: " + arr[i][j]);
			}

		}
	}

}

public class ArrayProgramm3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of class==");
		int n = sc.nextInt();

		Array ao1 = new Array();
		ao1.createArray(n);
		ao1.addData();
		ao1.displayData();

	}

}
