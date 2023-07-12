package com.building.blocks;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int remainder, reverse = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number to Check for Palindrome: ");
		int num = scanner.nextInt();
		
		int temp = num ;
		
		while(num>0)
		{
			remainder = num%10 ;
			reverse = reverse * 10 + remainder;
			num = num/10 ;
		}
		
		if(temp==reverse)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}
		
		scanner.close();
	}
}
