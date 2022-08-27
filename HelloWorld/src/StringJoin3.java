package com.cg.Strings;

public class StringJoin3 {

	public static void main(String[] args) {
		
		String s1=new String("GOOD");
		String s2=new String("MORNING");
		String s3=new String("NIGHT");
		
		String sun=String.join(" ",s1,s2);//join s1 and s2
		String moon=String.join(" ",s1,s3);// join s1 and s3
		
		
		
		System.out.println(sun);//print goodmorning
		System.out.println(moon);//print goodnight
		
		

	}

}
