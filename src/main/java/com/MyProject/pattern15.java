package com.MyProject;

import java.util.Scanner;

public class pattern15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 ||i==n||j==i)
					System.out.print("# ");
				else
					System.out.print("- ");
			}
			System.out.println();
		}
	}
}
