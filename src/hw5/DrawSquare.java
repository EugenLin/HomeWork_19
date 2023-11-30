package hw5;

import java.util.Scanner;

public class DrawSquare {

	public static void main(String[] args) {
		drow();
	}

	public static void drow() {
		System.out.println("Please enter two integers that are larger than zero.");
		Scanner sc = new Scanner(System.in);
		System.out.println("First integer:");
		int x = sc.nextInt();
		System.out.println("Second integer: ");
		int y = sc.nextInt();

		for (int i = 0; i < y; i++) {
			System.out.println();
			for (int j = 0; j < x; j++) {
				System.out.print("*");
			}
		}

	}

}
