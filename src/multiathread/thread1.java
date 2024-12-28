package com.multiathread;

import java.util.Scanner;

class exm extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("i:=" + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
	public static void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the secound number:");
		int b = sc.nextInt();
		System.out.println("sum:=" + (a + b));
	}

	public static void print() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("i:=" + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class thread1 {
	public static void main(String[] args) {
		exm e = new exm();
//		Thread th = new Thread();
		e.run();
	}

}
