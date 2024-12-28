package com.multiathread;
class MsOffice extends Thread{
	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("typing")) {
			typing();
		}
		else if (Thread.currentThread().getName().equals("spellCheck")) {
			spellCheck();
			
		}else
			saving();
	}
   // primary task
	 void typing() {
		for (int i = 0; i <5; i++) {
			System.out.println("typing in progess");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	 //secondry task
	 void spellCheck() {
			for (;;) {
				System.out.println("spell check in progess");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	 //secondry task
	 void saving() {
			for (;;) {
				System.out.println("saving in progess");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	
}
public class raceCondition {

	public static void main(String[] args) {
		MsOffice m1 =new    MsOffice();
		m1.setName("typing");
		MsOffice m2 =new    MsOffice();
		m2.setName("spellCheck");
		m2.setDaemon(true);
		m2.setPriority(8);
		MsOffice m3 =new    MsOffice();
		m3.setName("saving");
		m3.setDaemon(true);
		m3.setPriority(9);
		m1.start();
		m3.start();
		m2.start();

	}

}
