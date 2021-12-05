package com.java.basic;

import java.util.Scanner;

public class OddrEven {
	public static void main(String[] args) {
		 
		 System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		if (num%2==0) 
		{
			System.out.println(num+" "+"is a odd number");
		}else 
		{
			System.out.println(num+"is even number");
		}
	}
}
