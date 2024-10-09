package com.MyProject;

import java.util.Scanner;

/*
 *  15
 *  14 13 
 *  12 11 10 
 *  9  8   7  6
    5  4   3  2  1
 */
public class pattern13 {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		for(int  m=1;m<=n;m++)
		{
			sum+=m;
		}
		System.out.println("sum ="+sum);
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i; j++) {
                  System.out.print(sum--+"	");
			}
			System.out.println();

		}
	}
}
