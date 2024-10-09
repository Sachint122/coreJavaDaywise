package com.MyProject;

public class pattern25 {
	public static void main(String[] args) {
		int n = 1;
		int temp = 1;
		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("_ ");
			}
			for (int j = 0; j <= 8; j++) {
				if (n <= temp)
					System.out.print(n++ + " ");

			}
			temp = n + 1;
			n = 1;
			System.out.println();
		}
		int m = 9;
		int tep = 1;
		for (int i = 0; i <5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("_ ");
			}
			for (int j = 0; j <= 8; j++) {
				if (tep <=m) 
					System.out.print(tep++ + " ");
//				} else
//					System.out.print(tep);
			}
			m = m - 2;
			tep = 1;
			System.out.println();
		}
	}
}
