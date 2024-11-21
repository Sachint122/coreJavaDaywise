package com.october15;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1=new String("rama");
      String s2=new String("rama");
      if(s1.length()==s2.length()) {
    	  if(s1.equals(s2)==true) {
    		  System.out.println("string are equal:");
    	  }
    	  else
    		  System.out.println("string are not equal");
      }
      if(s1==s2) {
    	  System.out.println("refrences are eual");
      }
      else
    	  System.out.println("refrences are not eual");
	}

}
