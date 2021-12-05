package com.java.basic;

import java.util.Scanner;

public class Ques_Rem {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int Ques = num/5;
		double Rem = (double)num%5;
		System.out.println("Remainder :" + Rem);
		System.out.println("Quotient : " + Ques);
	}
}
