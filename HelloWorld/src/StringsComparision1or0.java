package com.cg.Strings;

public class StringsComparision1or0 {
	
	public static void main(String[]args) {
	
	String s1=new String("Avantika");
	String s2=new String("Avantika");
	String s3=new String("Avi");
	
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareTo(s3));
	System.out.println(s3.compareTo(s1));
	System.out.println(s3.compareTo(s3));

}

}



// if s1==s2 then 0
// if s1<s2  then negative
// if s1>s2 then positive