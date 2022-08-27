package com.cg.Strings;

public class StringContents {

	public static void main(String[] args) {
		String s1 = "Learn Java";
	    Boolean s;

	    // check if str1 contains "Java"
	    s = s1.contains("Java");
	    System.out.println(s);  // true

	    // check if str1 contains "Python"
	    s = s1.contains("Python");
	    System.out.println(s);  // false

	    // check if str1 contains ""
	    s = s1.contains("");

	    System.out.println(s);  // true
	  }


	}


