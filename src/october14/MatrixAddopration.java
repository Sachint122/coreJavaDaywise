package com.october14;

import java.util.Scanner;

class matrix {
	int m1[][] = new int[2][2];
	int m2[][] = new int[2][2];
	int res[][] = new int[2][2];
	Scanner sc = new Scanner(System.in);

	void collect_data() {
		for (int k = 0; k <= 1; k++) {
			if (k == 0)
				System.out.println("enter the matrix one data");
			else
				System.out.println("enter the matrix two data");
			for (int i = 0; i < m1.length; i++) {
				for (int j = 0; j < m1[i].length; j++) {
					System.out.print("enter the data of:" + i + j + ":");
					if (k == 0)
						m1[i][j] = sc.nextInt();
					else
						m2[i][j] = sc.nextInt();
				}

			}
		}

	}

	void additon() {
		System.out.println("started addition of matrix");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				res[i][j] = m1[i][j] + m2[i][j];
			}
		}
	}

	void multiplication() {
		System.out.println("started multiplication  of matrix");
		for (int k = 0; k < 2; k++) {
			for (int i = 0; i < m1.length; i++) {
				for (int j = 0; j < m1[i].length; j++) {
					res[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}

	}

	void display() {
		System.out.println("displated the result  data in matrix form");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				System.out.print(res[i][j] + "   ");
			}
			System.out.println("");
		}

	}
}

class MatrixAddopration {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		matrix m = new matrix();
		m.collect_data();
//		m.additon();
		m.multiplication();
		m.display();

	}

}
