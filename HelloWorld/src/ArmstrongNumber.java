package com.cg.numbers;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		        try (Scanner Sc = new Scanner(System.in)) {
					System.out.println("Input the number to check Armstrong: ");
					int num = Sc.nextInt();
					int temp = num;
					int count = 0;
					int res = 0;
					int rem = 0;
					while(temp > 0){
					    temp = temp/10;
					    count++;
					}
					temp = num;
					while(temp > 0){
					    rem = temp % 10;
					    res = res + (int)Math.pow(rem,count);
					    temp = temp/10;
					}
					if(res == num){
					    System.out.println("Is Armstrong");
					}else{
					    System.out.println("Is not Armstrong");
					}
				}
		    }
		
	}


