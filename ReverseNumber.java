package com.building.blocks;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int remainder, reverse = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number to Reverse: ");
		int num = scanner.nextInt();
		
		while(num>0)
		{
			remainder = num%10 ;
			reverse = reverse * 10 + remainder;
			num = num/10;
		}

		System.out.println("The Reverse Number is: " + reverse);
		
		scanner.close();
	}
}
