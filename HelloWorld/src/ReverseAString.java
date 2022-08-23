package com.cg.numbers;
public class ReverseAString {

	public static void main(String[] args) {

		    String stringInput = "My String Output";   

		    

		    int iStrLength=stringInput.length();    

		  

		while(iStrLength >0)

		{

		System.out.print(stringInput.charAt(iStrLength -1)); 

		iStrLength--;

		}
	}
}