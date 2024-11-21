package com.november11;

class os {
	double version;
	String name;

	public os(double version, String name) {
		super();
		this.version = version;
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public String getName() {
		return name;
	}

}

class charger {
	String company;
	double volts;

	public charger(String company, double volts) {
		super();
		this.company = company;
		this.volts = volts;
	}

	public String getCompany() {
		return company;
	}

	public double getVolts() {
		return volts;
	}

}

class moblie {
	os o = new os(4.5, "lolipop");
	void hascharger(charger c) {
     System.out.println(c.getCompany());
     System.out.println(c.getVolts());
	}
}

public class has_a {

	public static void main(String[] args) {
	 moblie m=new moblie();
	 charger c= new charger("sumsung", 15);
	 System.out.println(m.o.getName());
	 System.out.println(m.o.getVersion());
	  
	 m.hascharger(c);
	 m=null;
	 System.out.println(m.o.getName());
	 System.out.println(m.o.getVersion());
	  
	 m.hascharger(c);

	}

}
