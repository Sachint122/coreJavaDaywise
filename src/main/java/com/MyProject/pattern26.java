package com.MyProject;

public class pattern26 {
 public static void main(String[] args) {
	 int n=11;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==0||j==0||i==n-1||j==n-1)
			{
				System.out.print("1 ");
			}
			else 
			   System.out.print("2 ");
		}
		System.out.println();
	}
}
}
