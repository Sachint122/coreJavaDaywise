package com.multiathread;

class warrior extends Thread {
//	String res1 = "AWM";
//	String res2 = "AK-47";
//	String res3 = "UMP45";
	String res1 = new String("AWM"); 
	String res2 = new String("Ak"); 
	String res3 = new String("pistol"); 

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
			synchronized (res1) {
				System.out.println("ravi is aquired wepon:" + res1);
				Thread.sleep(3000);
				synchronized (res2) {
					System.out.println("ravi is aquired wepon:" + res2);
					Thread.sleep(3000);
					synchronized (res3) {
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

public class synchronised {

	public static void main(String[] args) {
       warrior w=new warrior();
       w.setName("sachin");
       warrior w1=new warrior();
       w1.setName("ravi");
       w.start();
       w1.start();
	}

}
