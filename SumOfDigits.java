package com.building.blocks;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int remainder, sum = 0;
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number to find the Sum of Digits: ");
		int num = scanner.nextInt();
		
		while(num>0)
		{
			remainder = num%10 ;
			sum = sum + remainder;
			num = num/10 ;
		}
		
		System.out.println("Sum of digits is: " + sum);
		
		scanner.close();

	}
}
