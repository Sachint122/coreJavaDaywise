package com.multiathread;

import java.util.Scanner;

class me1 extends Thread {
	String a = new String("snipper");
	String b = new String("awm");
//	String a="snipper";
//	String b="AWM";

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("sachin")) {
			sachin();
		} else {
			ravi();
		}
	}

	public void sachin() {
		Scanner sc = new Scanner(System.in);
		try {
			synchronized (a) {
				System.out.print("sachin");
				System.out.println(a);
				Thread.sleep(3000);
				synchronized (b) {
					System.out.print("sachin");
					System.out.println(b);
					Thread.sleep(3000);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ravi() {
		try {
			synchronized (a) {
				System.out.print("ravi");
				System.out.println(a);
				Thread.sleep(3000);
				synchronized (b) {
					System.out.print("ravi");
					System.out.println(b);
					Thread.sleep(3000);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class myThread2 {

	public static void main(String[] args) {
		me1 m = new me1();
		m.setName("sachin");
		me1 y = new me1();
		y.setName("ravi");
		m.start();
		y.start();

	}
}
