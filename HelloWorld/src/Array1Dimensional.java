package com.cg.Arrays;
import java.util.Scanner;

public class Array1Dimensional {

	public static void main(String[] args) {

        int size;
        System.out.println("ENTER THE SIZE OF YOUR ARRAY :");
       
        Scanner s=new Scanner(System.in);
        size = s.nextInt();
        
        int[] arr = new int[10]; // create Array
        
        System.out.println("ENTER THE ELEMENTS OF YOUR ARRAY :");
        
        for (int i=0; i<size;i++)
        {
  
		arr[i]=s.nextInt();// Taking input from the user
        }
        System.out.println("HERE IS YOUR ARRAY");
//printing the elements of Array
        
        	for(int i=0;i<size;i++)
        	{
        		System.out.println(arr[i]);
        	}
	}	
        
        }
