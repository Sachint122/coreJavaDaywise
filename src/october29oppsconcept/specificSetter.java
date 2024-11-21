package com.october29oppsconcept;

class Tiger {
	String name;
	String color;
	String country;
	int age;

	void setStaticName() {
		name = "Toomy";
	}

	void setStaticColor() {
		color = "red";
	}

	void setStaticCountry() {
		country = "africa";
	}

	void setStaticAge() {
		age = 34;
	}

	void setDynaName(String s1) {
		name = s1;
	}

	void setDynaColor(String s2) {
		color = s2;
	}

	void setDynaCountry(String s3) {
		country = s3;
	}

	void setDynaAge(int i) {
		age = i;

	}

	String getName() {
		return name;
	}

	String getColor() {
		return color;
	}

	String getCountry() {
		return country;
	}

	int getaAge() {
		return age;
	}

}

public class specificSetter {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		System.out.println(t.getaAge());
		System.out.println(t.getName());
		System.out.println(t.getColor());
		System.out.println(t.getCountry());
		System.out.println("======================");
		t.setStaticAge();
		t.setStaticColor();
		t.setStaticCountry();
		t.setStaticName();
		System.out.println(t.getaAge());
		System.out.println(t.getName());
		System.out.println(t.getColor());
		System.out.println(t.getCountry());
		System.out.println("======================");
		Tiger t1 = new Tiger();
		System.out.println(t1.getaAge());
		System.out.println(t1.getName());
		System.out.println(t1.getColor());
		System.out.println(t1.getCountry());
		System.out.println("======================");
		t1.setDynaAge(32);
		t1.setDynaColor("sfjj");
		t1.setDynaCountry("india");
		t1.setDynaName("ramu");
		System.out.println(t1.getaAge());
		System.out.println(t1.getName());
		System.out.println(t1.getColor());
		System.out.println(t1.getCountry());
		System.out.println("======================");
	}

}
