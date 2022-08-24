package com.cg.Strings;

public class StringFindLength {
	
	public static void main(String[] args) {
	
	String s=new String("Avantika");
	s.concat("Bhist");//String immutable(cannot be changed)
	                 //concat.used to get the string words together
	                 //in this case to make name and surname together
     System.out.println(s);

     System.out.println("LENGTH OF STRING IS =");
     System.out.println(s.length());
}
}