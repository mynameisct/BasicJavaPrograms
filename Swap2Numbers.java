package com.building.blocks;

public class Swap2Numbers {

	public static void main(String[] args) {
		
		int num1 = 10 ;
		int num2 = 20 ;
		int temp;
		
		System.out.println("Before Swapping: " + num1 + " " + num2 );
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After Swapping: " + num1 + " " + num2);
	}
}
