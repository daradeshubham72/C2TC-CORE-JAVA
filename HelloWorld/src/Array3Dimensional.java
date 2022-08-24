package com.cg.Arrays;

public class Array3Dimensional {

	public static void main(String[] args) {
		
		int[][][] x= {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
		//creating 3d Array
		
		System.out.println(x); //Address

		System.out.println(x[0][1][2]);	//Address
		
		System.out.println(x[1][0][1]);//Address
		
		System.out.println(x[1][2][0]);//Address
		
		System.out.println(x[1][1][1]);//Address
		
		System.out.println(x[2][1][0]);//Address
	}

}
