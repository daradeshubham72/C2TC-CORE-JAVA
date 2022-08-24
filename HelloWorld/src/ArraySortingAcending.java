package com.cg.Arrays;
import java.util.Arrays;

public class ArraySortingAcending {

	public static void main(String[] args) {
		
		int[] arr= {10,58,75,68,12,96,38,74,18,96};
		
		System.out.println("ENTERED ARRAY IS=");
		
		for (int num:arr)
		{
			System.out.println(num+" ");
		
			
		}
		Arrays.sort(arr);
		System.out.println("SORTED ARRAY IS =");
		for (int num:arr)
		{
			System.out.println(num+" ");
		}
	}

}
