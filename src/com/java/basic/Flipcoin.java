package com.java.basic;

import java.util.Scanner;

public class Flipcoin {

	static int headCounter;
	static int tailCounter;

	public static void main(String[] args) {

		System.out.println("How many times you want to flip the coin?");
		Scanner sc = new Scanner(System.in);

		int counter = sc.nextInt();
		sc.close();
		if (counter > 0) {
			Flipcoin fc = new Flipcoin();
			fc.flipCoin(counter);

			double headPercentage = ((double)headCounter / counter) * 100;
			double tailPercentage = ((double)tailCounter / counter) * 100;

			System.out.println(
					"Head count percentage : " + headPercentage + "" + "\nTail count percentage : " + tailPercentage);
		} else {
			System.out.println("Invalid input");
		}
	}

	public void flipCoin(int cnt) {
		headCounter = 0;
		tailCounter = 0;
		for (int i = 0; i <= cnt; i++) {
			double result = Math.random();

			if (result < 0.5) {
				tailCounter++;
			} else {
				headCounter++;
			}
		}
	}
}
