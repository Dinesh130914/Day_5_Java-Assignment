package com.java.functional;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args)
	{
		int x1,x2,y1,y2;
		double dis;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the X1 value");
		x1 = sc.nextInt();
		
		System.out.println("Enter the Y1 value");
		y1 = sc.nextInt();
		
		System.out.println("Enter the X2 value");
		x2 = sc.nextInt();
		
		System.out.println("Enter the Y2 value");
		y2 = sc.nextInt();
		sc.close();
		
		dis = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)*1.0);
		
		System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
	}
}
