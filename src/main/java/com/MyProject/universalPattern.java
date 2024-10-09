package com.MyProject;

//import java.util.Scanner;
// for a i == 0 && j != n - 1 && j != 0) || (j == 0&& i!=0) || (j == n - 1 && i != 0) || i==n/2
//for b  i == 0 && j!=n-1) || (j == 0) || (j == n - 1 && i!=0 && i!=n-1 && i!=n/2) || (i==n/2 && j!=n-1) ||(i==n-1&& j!=n-1 && i!=n/2
// for c i == 0 &&j!=0)||(j==0&&i!=0 &&i!=n-1)|| (i==n-1&&j!=0
// for d i == 0&&j!=n-1)||(j==0)|| (i==n-1&&j!=n-1) ||(j==n-1&&i!=0&&i!=n-1
//for  e i == 0)|| (i==n-1)||(i==n/2) ||(j==0
//for  f i == 0)||(i==n/2) ||(j==0
//for  g ((j == 0 && i != 0 && i != n - 1) || (i == 0 && j != 0) || (i == n / 2 && j > n / 2 && j != n - 1)
//|| (j == n - 1 && i >= n / 2 && i != n / 2) || (i == n - 1 && j < n / 2 && j != 0)
//|| (j == n / 2 && i > n / 2 && i != n - 1)) 
/*
 for h j == 0)||(i==n/2) ||(j==n-1
 for i i==0||j==n/2||i==n-1
 for j i==0||(j==n/2)|| (i-j==n/2)
 for k j==0||i-j==n/2||i+j==n/2
 for l j==0||i==n-1
 for m j==0||(i==j&& j<=n/2)||(i+j==n-1&&j>n/2)||j==n-1
 for n j==0||i==j||j==n-1
 for o (j==0&&i!=0&&i!=n-1)||(i==0&&j!=0&&j!=n-1)||(j==n-1&&i!=0&&i!=n-1)||(i==n-1&&j!=0&&j!=n-1)
// for p i == 0 && j != n - 1 && j != 0) || (j == 0&& i!=0) || (j == n - 1 && i<=n/2) || i==n/2
 * for q (j==0&&i!=0&&i<n/2)||(i==n/2&&j<n/2&&j!=0)||(j==n/2&&i<n/2&&i!=0)||(i==0&&j!=0&&j<n/2)||(i+j<=14&&i==j)&&i+j>=6
 * for r (j==0&&i!=0)|(i==0&&j!=0&&j<n/2)||(i==n/2&&j<n/2)||i-j==n/2||(j==n/2&&i<n/2)
 * for s (i==0&& j!=0)||(j==0&&i!=0&&i<n/2)||(i==n/2&&j!=0&&j!=n-1)||(j==n-1&&i>n/2&&i!=n-1)||i==n-1&&j!=0&&j!=n-1
 * for t i==0||j==n/2
 * for u (j==0&&i!=n-1)||(i==n-1&&j!=0&&j!=n-1)||(j==n-1&&i!=n-1)
 * for v (j==0&&i<n/2)||i-j==n/2||i+j==(n-1)+n/2||(j==n-1&&i<n/2)
 * for w  j==0||(i+j==n-1&&j<n/2)||(i==j&&j>=n/2)||j==n-1
 * for x  i==j||i+j==n-1
 * for y  (i==j&&j<n/2)||(j==n/2&&i>=n/2)||(i+j==n-1&&j>n/2)
 * for z  i==0||i+j==n-1||i==n-1
 */

public class universalPattern {
	public static void main(String[] args) {
//		System.out.print("Enter a number");
//		Scanner sc = new Scanner(System.in);
		int n = 11;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==0){

					System.out.print("* ");
				} else {
					System.out.print("  ");

				}

			}
			System.out.println("");
		}
	}
}
