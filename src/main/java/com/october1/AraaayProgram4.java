package com.october1;

import java.util.Scanner;

class Array3d {
	int arr[][][];
	int coll;
	Scanner sc = new Scanner(System.in);

	void createArray(int n) {
		coll = n;
		arr = new int[coll][][];
		System.out.println("Enter the student number for each class");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("inside the college :" + (i + 1));
			System.out.print("Enter the number of clsses:");
			int cls = sc.nextInt();
			arr[i] = new int[cls][];
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Enter the number of student inside class room no: " + (j + 1) + " ");
				int stu = sc.nextInt();
				arr[i][j] = new int[stu];
			}
		}
		System.out.println("Array is created is succesfully");
		System.out.println("===================");
	}

	void addData() {

		System.out.println("collecting array data ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("inside the clollege : " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("insided the class room: " + (j + 1));
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print("Enter the marks of student no" + (j + 1) + ": ");
					arr[i][j][k] = sc.nextInt();
				}

			}
		}
		System.out.println("Marks succesfully collected");
		System.out.println("_____________________");

	}

	void displayData() {
		System.out.println("displaying the data");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("inside the college : " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("inside the class room: " + (j + 1));
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("the marks of student no" + (j + 1) + "is: " + arr[i][j][k]);
				}
			}

		}
	}

}

public class AraaayProgram4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of college==");
		int n = sc.nextInt();
	
		Array3d ao1 = new Array3d();
		ao1.createArray(n);
		ao1.addData();
		ao1.displayData();

	}

}
