package hw3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		System.out.println("阿文...你這次不要哪個數字(0~9):");
		int banned = banNumber();

		int total5 = 0;

		for (int i5 = 1; i5 <= 49; i5++) {

			int a = i5 % 10;
			int b = i5 / 10;

			if (a != banned && b != banned) {
				System.out.print(i5 + "\t");
				total5 += 1;
			}
		}
		System.out.println();
		System.out.println("Total " + total5 + " numbers are accetable.");

	}

	public static int banNumber() {
		int input = 0;
		Scanner sc = new Scanner(System.in);
		boolean validInput = false;

		while (!validInput) {
			try {
				input = sc.nextInt();
				validInput = true;
//			InputMismatchException e from java.until.InputMismatchException
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input. Please enter a valid integer.");
				sc.next();
			}
		}

		return input;
	}

}
