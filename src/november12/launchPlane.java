package com.november12;

abstract class plane {
	abstract void takeoff();

	abstract void fly();

	abstract void land();
}

class cargoPlane extends plane {
	@Override
	void fly() {
		System.out.println("cargo plane is flying low hieght");
	}

	@Override
	void takeoff() {
		System.out.println("cargo plane is take off");
	}

	@Override
	void land() {
		System.out.println("cargo plane is land");
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

	@Override
	void takeoff() {
		System.out.println("passenger plane is take off");
	}

	@Override
	void land() {
		System.out.println("passenger plane is land");
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

	@Override
	void takeoff() {
		System.out.println("fighter plane is take off");
	}

	@Override
	void land() {
		System.out.println("fighter plane is land");
	}

	void carryGoods() {
		System.out.println("fighter plane caary weepons");
	}
}
class airport{
	public void all(plane p) {
		p.takeoff();
		p.fly();
		p.land();
		System.out.println("===================\n");
	}
}
public class launchPlane {

	public static void main(String[] args) {
      cargoPlane c=new cargoPlane();
      fighterPlane f=new fighterPlane();
      passengerPlane p=new passengerPlane();
      plane ref;
      airport a=new airport();
      ref=c;
      System.out.println("cargo plane properties==============");
      c.carryGoods();
      a.all(c);
      ref=p;
      System.out.println("passenger plane properties===========");
      p.carryGoods();
      a.all(p);
      ref=f;
      System.out.println("fighter plane properties============");
      f.carryGoods();
      a.all(f);
	}

}
