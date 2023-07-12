package com.building.blocks;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int remainder, cubesum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number for Armsrong Checking: ");
		int num = scanner.nextInt();
		
		int temp = num ;
		
		while(num>0)
		{
			remainder = num%10;
			cubesum = cubesum + remainder * remainder * remainder;
			num = num/10;
		}
		
		if(cubesum==temp)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
		
		scanner.close();
	}
}
