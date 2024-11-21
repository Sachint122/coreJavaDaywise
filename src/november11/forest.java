package com.november11;

class forestfamily {
	void eat() {
		System.out.println(" eating food is nessory");
	}

	void sleep() {
		System.out.println("sleep is nessory");
	}

	void breed() {
		System.out.println("took oxegen for leeving");
	}
}

class tiger extends forestfamily {
	@Override
	void eat() {
		System.out.println("tiger eat non veg for foods");
	}

	void cast() {
		System.out.println("tiger belong to cat faimly");
	}
}

class elephent extends forestfamily {
	@Override
	void eat() {
		System.out.println("elephent eat non veg for foods");
	}

	void weight() {
		System.out.println("elephengt weighht is too much go to gym");
	}
}

class dear extends forestfamily {
	@Override
	void eat() {
		System.out.println("dear eat on foods like green groos");
	}

	void run() {
		System.out.println("is to much run fast");
	}
}

class zoo{
	void basic(forestfamily ref) {
		ref.eat();
		ref.sleep();
		ref.breed();
		
	}
}
public class forest {

	public static void main(String[] args) {
		tiger t = new tiger();
		elephent e = new elephent();
		dear d = new dear();
		zoo z=new zoo();
		forestfamily ref;
		// Condense of up to child
		System.out.println("condex of polyformisym of up to down parretn to child");
		System.out.println("tiger properties");
		z.basic(t);
		t.cast();
		System.out.println("======================");
		System.out.println("elephent properties");
		z.basic(e);
		e.weight();
		System.out.println("======================");
		System.out.println("dear properties");
		z.basic(d);
		d.run();
		System.out.println("======================");
		// basic of up to down
		System.out.println("basic of up to down parretn to child");
		System.out.println("tiger properties");
		ref=t;
		ref.eat();
		ref.sleep();
		ref.breed();
		t.cast();
		System.out.println("======================");
		System.out.println("elephent properties");
		ref=e;
		ref.eat();
		ref.sleep();
		ref.breed();
		e.weight();
		System.out.println("======================");
		System.out.println("dear properties");
		ref=d;
		ref.eat();
		ref.sleep();
		ref.breed();
		d.run();
		System.out.println("======================");
	}

}
