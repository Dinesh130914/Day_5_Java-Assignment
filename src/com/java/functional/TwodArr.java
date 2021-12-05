package com.java.functional;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwodArr {
static Scanner sc;
	
	public static void main(String[] args) {
		
		System.out.println("Enter number of rows :");
		
		//int[][] twoDArr = new int[5][5];
		sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		
		System.out.println("Enter number of columns: ");
		int n = sc.nextInt();
		
//		sc.close();
		System.out.println("Rows : " + m + " columns " + n);
		
		
		if (m > 0 && n > 0) {
			TwodArr twoDArray = new TwodArr();
			twoDArray.setArrayValues(m, n);
			
		} else {
			System.out.println("Invalid Input");
		}
	}
	
	public void setArrayValues(int row, int col) {
		int[][] twoDArr = new int [row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter value of [" + i + "][" + j + "] => ");
				twoDArr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		TwodArr twoDArray = new TwodArr();
		twoDArray.printArrayValues(twoDArr, row, col);
	}
	
	public void printArrayValues(int[][] twoDArr, int row, int col) {
		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				
				writer.write(""+twoDArr[i][j]+"\t");
				writer.flush();
				
			}
			writer.write("\n");
			writer.flush();
		}
		writer.close();
	}
}
