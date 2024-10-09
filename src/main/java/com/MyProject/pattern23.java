package com.MyProject;

public class pattern23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(x<9) {
					System.out.print("0"+ ++x+" ");
				}
				else
					System.out.print(++x+" ");
			}
			System.out.println();
		}
	}

}
