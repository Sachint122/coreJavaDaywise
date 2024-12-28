package com.multiathread;

//class Mythread implements Runnable {
//	public void run() {
//		for (int i = 10; i <= 1; i++)
//			System.out.println("threded program executed " + i);
//		try {
//			Thread.sleep(2000);
//		} catch (Exception e) {
//			System.out.println("handle");
//		}
//
//	}
//}

class AnotherThread extends Thread {
	@Override
	public void run() {
		for (int i = 10; i >= 1; i--) {
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("handle");
			}
		}
	}
}

public class thread2 {

	public static void main(String[] args) {
//		Mythread t = new Mythread();
//		Thread th = new Thread(t);
		AnotherThread at = new AnotherThread();
//		th.start();
		at.run();
	}

}
