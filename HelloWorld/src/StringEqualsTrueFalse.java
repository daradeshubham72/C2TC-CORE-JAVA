package com.cg.Strings;

public class StringEqualsTrueFalse {

	public static void main(String[] args) {
		//NUMBER OF TOTAL OBJECTS 3
      // String s1= new String("Avi");   //2  OBJECTS              
       //String s2=new String("Avi");
       //String s3=new String ("AVI");      
       //String s4=new String("Avi");      
       
	String s1="avantika";  //lowercase
	String s2="avantika";//lowercase
	String s3="AVANTIKA";//uppercase
	
	System.out.println(s1==s2); //true
	System.out.println(s1.equals(s2));//true
	System.out.println(s1==s3);//false
	System.out.println(s1.equals(s3));//false     // for passwords
	System.out.println(s1.equalsIgnoreCase(s3));//true  // for emails
	}

        if(s1.equals(s3)) {  //IF S1==S3 TRUE
		System.out.println("TRUE");
	}
	
		else {
			System.out.println("FALSE"); //IF S1 NOT==S3 FALSE
			
	}


