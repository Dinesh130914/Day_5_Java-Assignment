package com.java.functional;
import java.util.*;
public class Windchill {
	public static void main(String[] args) 
	{
		
		double temp,speed,windtemp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Temperature");
				 temp = sc.nextDouble();
		
		System.out.println("Enter the speed");
		 speed = sc.nextDouble();
		
		sc.close();
		
		if(temp>50&&speed<3&&speed>120) 
		{
		 windtemp = 35.74 + 0.6215 * temp +(0.4275 * temp - 35.75) * Math.pow(speed, 0.16);
		 System.out.println("Wind Chill : "+windtemp);
		}
		else 
		{
			System.out.println("Please enter the valid input");
		}
	}
}
