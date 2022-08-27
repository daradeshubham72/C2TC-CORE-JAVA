package com.cg.Strings;

public class StringReplaceCharacters {

	public static void main(String[] args) {
		String s1=new String("AABBCCDD");
		String s2=new String("WWXXYYZZ");
		String s3=new String("123456");
		
		
		System.out.println(s1); // original string characters
		
		
		System.out.println(s1.replaceFirst("AA", "VV")); //replaced first 
		                                            //string characters
	
	   System.out.println(s1.replaceAll(s1, s2));//replaced complete 
	                                           //string s1 by s2
	   
	   System.out.println(s2.replace(s2, s3));//replace full string
	
	}

}
