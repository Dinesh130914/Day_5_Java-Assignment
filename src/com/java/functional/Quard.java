package com.java.functional;

import java.util.Scanner;

public class Quard {
	public static void main(String[] args) {
		
		double root1 = 0, root2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a ::");
		double a = sc.nextDouble();

		System.out.println("Enter the value of b ::");
		double b = sc.nextDouble();

		System.out.println("Enter the value of c ::");
		double c = sc.nextDouble();

		double delta = (b * b) - (4 * a * c);
		double sqrt = Math.sqrt(delta);
		System.out.println(sqrt);
		if (delta > 0) {
			root1 = (-b + sqrt) / (2 * a);
			root2 = (-b - sqrt) / (2 * a);
			System.out.println("Root1 of x is: " + root1 + " and Root2 of x is: " + root2);
		} else if (delta == 0) {
			System.out.println("Root is :: " + (-b + sqrt) / (2 * a));
		}
	}
}

