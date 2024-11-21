package com.october29oppsconcept;

class Dogyy {
	String name;
	String color;
	String breed;
	int age;
	int cost;

	// zero parameter
	public Dogyy() {
		super();
		System.out.println(" hi i m from zero constructor");
	}

	// single
	public Dogyy(String name) {
		this("Dacchu", "Brown");
		System.out.println("inside single constructor");
		this.name = name;
	}

	// double
	public Dogyy(String name, String color) {
		this("Faroow", "yellow", "pug");
		System.out.println("inside double constructor");
		this.name = name;
		this.color = color;
	}

	// three
	public Dogyy(String name, String color, String breed) {
		this("hima", "black", "gr", 5000);
		System.out.println("inside threee constructor");
		this.name = name;
		this.color = color;
		this.breed = breed;
	}

	// four
	public Dogyy(String name, String color, String breed, int cost) {
		this("rocky", "black", "gr_imported", 19000, 5);
		System.out.println("inside four construtor");
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.cost = cost;
	}

	// multiple
	public Dogyy(String name, String color, String breed, int cost, int age) {
		super();
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.cost = cost;
		this.age = age;
	}

	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(age);
		System.out.println(cost);
		System.out.println("-------------------------");
	}

}

public class construtor {
	public static void main(String[] args) {
		Dogyy d=new Dogyy();
		d.getData();
		Dogyy d1=new Dogyy("toomy","red","pug",3444,3);
		d1.getData();
		Dogyy d2=new Dogyy("rammu");
		d2.getData();
	}
}
