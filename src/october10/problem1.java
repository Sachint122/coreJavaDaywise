package com.october10;

import java.util.Scanner;

class prob {
	int arr[][][];
	int la[];
	int total_inves;
	int privious_profit;
	int total_revenue;
	Scanner sc = new Scanner(System.in);
	String[] lang = { "kanada", "tamil", "Hindi" };

	void createArray(int n, int m, int o) {
		arr = new int[n][m][o];
		la = new int[n];
		System.out.println("Enter the total investement of 2023-24 year:");
		total_inves = sc.nextInt();
		System.out.println("Enter the total privious profit of 2022-23 year:");
		privious_profit = sc.nextInt();
		System.out.println("Array is created is succesfully");
		System.out.println("===================");
	}

	void addData() {
		int temp = 0;
		System.out.println("collecting array data ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("inside the language of: " + lang[i]);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("inside the  categaries: " + (j + 1));
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print("Enter the  movie revenue of this movie number  " + (k + 1)+":");
					arr[i][j][k] = sc.nextInt();
					temp += arr[i][j][k];
					total_revenue += arr[i][j][k];
				}
			}
			la[i] += temp;
			temp = 0;

		}
		System.out.println("Marks succesfully collected");
		System.out.println("_____________________");

	}

	void displayData() {
		System.out.println("displaying the data");
		for (int i = 0; i < la.length; i++) {
			System.out.println("displaying the each languahe of revenus: " + la[i]);
		}
		System.out.println("============================");
		if (total_revenue > total_inves) {
			System.out.println("sanjana has profit in fy 2023-24  is :" + (total_revenue - total_inves));
			System.out.println("the profit of fy 2023-24 is:" + (total_revenue - total_inves));
		} else {
			System.out.println("sanjan is loss on this fy 2023-24:" + (total_inves - total_revenue));
		}
	}

}

public class problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of laguage==");
		int n = sc.nextInt();
		System.out.print("Enter the number categaries==");
		int m = sc.nextInt();
		System.out.print("Enter the number of movie==");
		int o = sc.nextInt();

		prob ao1 = new prob();
		ao1.createArray(n, m, o);
		ao1.addData();
		ao1.displayData();

	}

}
