package hw3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		System.out.println("Please guess a number between 0~100: ");
		int answer = answer();
		int guessed = entryNumber();

		System.out.println("answer =" + answer);

		while (guessed != answer) {

			System.out.println("猜錯囉");
			guessed = entryNumber();

			if (guessed == answer) {
				System.out.println("猜對囉");
				break;
			}
		}

	}

//================
	public static int entryNumber() {
		System.out.println("Please enter a integar: ");

		int guessed = 0;
		Scanner sc = new Scanner(System.in);
		boolean validInput = false;

		while (!validInput) {
			try {
				guessed = sc.nextInt();
				validInput = true;
//			InputMismatchException e from java.until.InputMismatchException
			} catch (InputMismatchException e) {
				System.out.println("Invalid Input. Please enter a valid integer.");
				sc.next();
			}
		}

		return guessed;

	}

//	===========
	public static int answer() {
		Random ran = new Random();
		int answer = ran.nextInt(101);
		return answer;
	}
//	===========

//		================
}
