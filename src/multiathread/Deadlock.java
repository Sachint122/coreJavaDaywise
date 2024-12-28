package com.multiathread;

class warrior1 extends Thread {
	String res1 = "AWM";
	String res2 = "AK-47";
	String res3 = "UMP45";

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("sachin")) {
			sachin();
		} else
			ravi();
	}

	public void sachin() {
		try {
			synchronized (res1) {
				System.out.println("sachin is aquired wepon:" + res1);
				Thread.sleep(3000);
				synchronized (res2) {
					System.out.println("sachin is aquired wepon:" + res2);
					Thread.sleep(3000);
					synchronized (res3) {
						System.out.println("sachin is aquired wepon:" + res3);
						Thread.sleep(3000);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ravi() {
		try {
			synchronized (res3) {
				System.out.println("ravi is aquired wepon:" + res1);
				Thread.sleep(3000);
				synchronized (res2) {
					System.out.println("ravi is aquired wepon:" + res2);
					Thread.sleep(3000);
					synchronized (res1) {
						System.out.println("ravi is aquired wepon:" + res3);
						Thread.sleep(3000);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}

public class Deadlock {

	public static void main(String[] args) {
       warrior1 w=new warrior1();
       w.setName("sachin");
       warrior1 w1=new warrior1();
       w1.setName("ravi");
       w.start();
       w1.start();
	}

}
