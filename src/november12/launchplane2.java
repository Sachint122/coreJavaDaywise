package com.november12;

abstract class plane1 {
	abstract void takeoff();

	abstract void fly();

	abstract void land();
}

public class launchplane2 {

	public static void main(String[] args) {
//		plane p1=new plane();//cannot create the object of  abstract class directly
		plane1 p2;// References of the abstract class can be created directly
		plane1 p3 = new plane1() {

			@Override
			void takeoff() {
				System.out.println("plane is took off");
			}
			@Override
			void land() {
				System.out.println("plane is land");
			}
			@Override
			void fly() {
				System.out.println("plane is fly");
			}
		};
		System.out.println(p3);
		p3.takeoff();
		p3.fly();
		p3.land();

	}

}
