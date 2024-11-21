package com.november11;

class plane {
	void takeoff() {
		System.out.println("plane is take off");
	}

	void fly() {
		System.out.println("plane is  fly");
	}

	void land() {
		System.out.println("plane is land");
	}
}

class cargoPlane extends plane {
	@Override
	void fly() {
		System.out.println("cargo plane is flying low hieght");
	}

	void carryGoods() {
		System.out.println("cargo plane caary goods");
	}
}

class passengerPlane extends plane {
	@Override
	void fly() {
		System.out.println("passenger plane is flying mid hieght");
	}

	void carryGoods() {
		System.out.println("passenger plane caary passengers");
	}
}

class fighterPlane extends plane {
	@Override
	void fly() {
		System.out.println("fighter plane is flying high hieght");
	}

	void carryGoods() {
		System.out.println("fighter plane caary weepons");
	}
}

public class launchPlane {

	public static void main(String[] args) {

	}

}
