package com.october1;

import java.util.Scanner;

class ArrayOpration2 {
	int arr[][];
	int cls;
	int stu;

	void createArray(int n, int m) {
		cls = n;
		stu = m;
		arr = new int[cls][stu];
		System.out.println("Array is created is succesfully");
		System.out.println("===================");
	}

	void addData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("collecting array data ");
		for (int i = 0; i < cls; i++) {
			System.out.println("inside the clss room: " + (i+1));
			for (int j = 0; j < stu; j++) {
				System.out.print("Enter the marks of student no" + (j + 1) + ": ");
				arr[i][j] = sc.nextInt();
			}

		}
		System.out.println("Marks succesfully collected");
		System.out.println("_____________________");

	}

	void displayData() {
		System.out.println("displaying the data");
		for (int i = 0; i < cls; i++) {
			System.out.println("inside the clss room: " + i+1);
			for (int j = 0; j < stu; j++) {
				System.out.println("the marks of student no" + (j + 1) + "is: "+arr[i][j]);
			}

		}
	}

}

public class ArrayProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of class==");
		int n = sc.nextInt();
		System.out.print("Enter the number of student==");
		int m = sc.nextInt();

		ArrayOpration2 ao1 = new ArrayOpration2();
		ao1.createArray(n,m);
		ao1.addData();
		ao1.displayData();
		
	}

}
