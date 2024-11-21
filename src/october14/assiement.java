package com.october14;

import java.util.Scanner;

class firstAssiement {
	int m1[][] = new int[2][2];
	Scanner sc = new Scanner(System.in);
	int arr[] = new int[5];
	int count = 0;
/// creating a array
	void collect_array_data() {
		System.out.println("Enter the element of array:");
		for (int k = 0; k < 5; k++) {
			arr[k] = sc.nextInt();
		}

	}
//creating a matrix
	void collect_matrix_data() {
		System.out.println("Enter the element of matrix: ");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				System.out.print("enter the data of:" + i + j + ":");
				m1[i][j] = sc.nextInt();
			}

		}
	}
// calculate the sum
	void sum() {
		int sum = 0;
		System.out.println("sum of aaray element of array");
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("the sum of aaray is: " + sum);
	}
// checkn for identity matrix
	void check_identity() {
		int flag = 0;
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				if (i == j && m1[i][j] == 1)
					System.out.print("");
				else if (m1[i][j] > 0)
					flag = 1;
			}
			if (flag == 1) {
				System.out.println("matrix are not identity matrix:");
				break;
			}
		}
		if (flag == 0)
			System.out.println("matrix are identity matrix:");
	}
// check max value of a array
	void check_max() {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > temp) {
				temp = arr[i];
			}
		}
		System.out.println("hieghtest value of array:" + temp);
	}
// chech duplicate value of array
	void check_duplicate() {
		int flag = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length; i++) {

				if (arr[i] == arr[j] && j != i && flag == 0) {
					System.out.println("your duplicate values is: " + arr[i] + "   position:" + j);
					count++;
					flag = 1;

				}
			}
			flag = 0;
		}
//		display_array(te);
	}

	boolean check_value(int n, int[] nn) {
		for (int i = 0; i < nn.length; i++) {
			if (nn[i] == n) {
				return true;
			}
		}
		return false;
	}
// chech the duplicate array and make unque value
	void uniue_array() {
		int n = arr.length - (count / 2);
		int urr[] = new int[n];
		for (int j = 0,i=0; j < urr.length&&i<arr.length;) {
			if (check_value(arr[i], urr)) {
				i++;
			} else {
				urr[j] = arr[i];
				i++;
				j++;
			}
		}
		display_array(urr);
	}

	void display_array(int[] mm) {
		System.out.println("your resltent array is:");
		for (int i = 0; i < mm.length; i++) {
			System.out.println(" " + mm[i]);
		}
	}
// performing shorting assending and desending
	void shorting() {
		int temp = 0;
		for (int k = 0; k < 2; k++) {
			for (int j = 0; j < arr.length; j++) {
				temp = arr[j];
				for (int i = 0; i < arr.length; i++) {
					if (k == 0) {
						if (arr[i] < temp) {
							temp = arr[j];
							arr[j] = arr[i];
							arr[i] = temp;
						}
					} else if (arr[i] > temp) {
						temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}

				}

			}
			if (k == 0)
				System.out.println("Desending order of array");
			else
				System.out.println("Assending order is");
			display_array(arr);
		}
	}
// display the matrix elements
	void display() {
		System.out.println("displated the matirx form");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				System.out.print(m1[i][j] + "   ");
			}
			System.out.println();
		}

	}
}

public class assiement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstAssiement m = new firstAssiement();
		m.collect_array_data();
		System.out.println("=======================================");
		m.sum();
		System.out.println("=======================================");
		m.check_max();
		System.out.println("=======================================");
		m.check_duplicate();
		System.out.println("=======================================");
		m.shorting();
		System.out.println("=======================================");
		m.uniue_array();
		System.out.println("=======================================");
		m.collect_matrix_data();
		System.out.println("=======================================");
		m.check_identity();
		System.out.println("=======================================");
		m.display();
		System.out.println("=======================================");

	}

}
