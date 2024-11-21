package com.october29oppsconcept;

class Doggy {
	String name;
	String color;
	String breed;
	int age;
	int cost;

	void setData(String name, String color, String breed, int cost, int age) {
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.age = age;
		this.cost = cost;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCost(int cost) {
		this.cost = cost;
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

public class shadowProblem {

	public static void main(String[] args) {
		Doggy d = new Doggy();
		d.setData("toomy", "broewn", "pug", 6000, 5);
		d.getData();
		Doggy d1 = new Doggy();
		d1.setName("tommy");
		d1.setColor("brown");
		d1.setBreed("pug");
		d1.setCost(6000);
		d1.setAge(5);
		d1.getData();
	}

}
