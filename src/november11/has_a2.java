package com.november11;
class heart {
	String type;
	int bit;

	public heart(String type, int bit) {
		super();
		this.type = type;
		this.bit = bit;
	}

	public String getType() {
		return type;
	}

	public int getBit() {
		return bit;
	}

}

class brain {
	String type;
	int weight;

	public brain(String type, int weight) {
		super();
		this.type = type;
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public int getWeight() {
		return weight;
	}
}
class human{
	heart h= new heart("pure",76);
	brain b= new brain("sharper", 900);
}
class book {
	String name, author;

	public book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
}

class bike {
	String name, model;

	public bike(String name, String model) {
		super();
		this.name = name;
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public String getModel() {
		return model;
	}

}


class student extends human{
	public void hasbook(book b) {
		System.out.println("properties of book");
		System.out.println(b.getAuthor());
		System.out.println(b.getName());
		System.out.println("===================");
	}
	public void hasbike(bike b) {
		System.out.println("properties of bike");
		System.out.println(b.getModel());
		System.out.println(b.getName());
		System.out.println("===================");
	}
}
public class has_a2 {
	public static void main(String[] args) {
      student sachin= new student();
      bike bb= new bike("thels", "pc105");
      book c=new book("c programing", "jarvis");
      System.out.println("properties of brain");
      System.out.println(sachin.b.getType());
      System.out.println(sachin.b.getWeight());
      System.out.println("===================");
      System.out.println("properties of heart");
      System.out.println(sachin.h.getType());
      System.out.println(sachin.h.getBit());
      System.out.println("===================");
      
      sachin.hasbike(bb);
      sachin.hasbook(c);
	}

}
