package com.java.basic;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		int x,y,z;
		
		System.out.println("Enter the 2 Number");
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();
		
		System.out.println("Before Swapping :"+x+","+y );
		z=x;
		x=y;
		y=z;
		
		System.out.println("After Swapping :"+x+","+y);
	}
	
}
