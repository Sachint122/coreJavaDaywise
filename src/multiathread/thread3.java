package com.multiathread;

class human extends Thread{
	@Override
	public void run() {
		try {
			 System.out.println(Thread.currentThread().getName()+"is enterd the bathroom");
			  Thread.sleep(3000);
			  System.out.println(Thread.currentThread().getName()+"is using bathroom");
			  Thread.sleep(3000);
			  System.out.println(Thread.currentThread().getName()+"has left bathroom");
			  Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
public class thread3 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method is started");
		human h1=new human();
		h1.setName("boy");
		human h2=new human();
		h2.setName("girl");
		human h3=new human();
		h3.setName("others");
		human h4=new human();
		h4.setName("boy1");
		human h5=new human();
		h5.setName("girl1");
		human h6=new human();
		h6.setName("others1");
		h1.start();
		h1.join(5000);
		h2.start();
		h2.join(5000);
		h3.start();
		h4.start();
		h4.join(5000);
		h5.start();
		h5.join(5000);
		h6.start();
		System.out.println("main method is terminated");

	}

}
