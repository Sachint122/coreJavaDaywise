package com.multiathread;

import java.util.Scanner;

class me {
	String a, b;

	me() {
		a = "1";
		b = "2";
	}

	public void add() {
		Scanner sc = new Scanner(System.in);
		try {
			for (;;) {
				synchronized (a) {
					System.out.println("first");
					System.out.println(a);
					Thread.sleep(500);
					synchronized (b) {
						System.out.println("first");
						System.out.println(b);
						Thread.sleep(500);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void calculate() {
		try {
			for (;;) {
				synchronized (a) {
					System.out.println("cjcejc");
					System.out.println(a);
					Thread.sleep(500);
					synchronized (b) {
						System.out.println("sedbec");
						System.out.println(b);
						Thread.sleep(500);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class myThread {

	public static void main(String[] args) {
		me m = new me();
		Thread th = new Thread(() -> {
			m.add();
		});
		Thread th2 = new Thread(() -> {
			m.calculate();
		});
		th.start();
		th2.start();

	}
}
