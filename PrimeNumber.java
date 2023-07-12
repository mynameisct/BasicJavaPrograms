package com.building.blocks;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number to check for Prime Number: ");
		int num = scanner.nextInt();
		
		for(int i=2; i<num; i++)
		{
			if(num%i == 0)
				count++;
		}

		if(count>0)
		{
			System.out.println("Not a Prime Number");
		}
		else
		{
			System.out.println("Prime Number");
		}

		scanner.close();
	}
}
