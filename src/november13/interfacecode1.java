package com.november13;

interface calculator{
	void add();
	void sub();//rule 1,2
}
class cal1 implements calculator{//rule:4
	@Override
	public void add() {
	}
	@Override
	public void sub() {	
	}
}
class cal2 implements calculator{//rule:4
	@Override
	public void add() {
		// TODO Auto-generated method stub
	}
	@Override
	public void sub() {
		// TODO Auto-generated method stub
	}
}
public class interfacecode1 {

	public static void main(String[] args) {
		calculator  c1=new calculator();//rule:5
		calculator  c3;//rule:6
		//rule:7
         calculator c=new calculator() {
			@Override
			public void sub() {
				// TODO Auto-generated method stub
			}			
			@Override
			public void add() {
				// TODO Auto-generated method stub	
			}
		};
	}

}
