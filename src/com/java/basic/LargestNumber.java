package com.java.basic;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		
		int x,y,z;
		
		System.out.println("Enter the three number");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		sc.close();
		
		LargestNumber ln = new LargestNumber();
		ln.FindLargestnum(x, y, z);
		
	}
	public void FindLargestnum(int a,int b,int c) 
	{
		if(a>b && a>c) 
		{
			System.out.println(a+" "+"is a largestnumber");
		}
		else if(b>a && b>c) 
		{
			System.out.println(b+" "+"is a largest Number");
		}
		else if(c>a && c>b) 
		{
			System.out.println(c+" "+"is a largest Number");
		}
		else
		{
			System.out.println("All the numbers are same ");
		}
	}
}
