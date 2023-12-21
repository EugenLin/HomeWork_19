package hw10;

import java.util.Random;

public class PrimeNumChecker {
	public static void main(String[] args) {
		Random random = new Random();
		int[] randomNumbers = new int[5];

		// Generating 5 random numbers
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = 1 + random.nextInt(100);
		}

		// Checking for prime numbers
		for (int num : randomNumbers) {
			if (isPrime(num)) {
				System.out.println(num + " 是質數");
			} else {
				System.out.println(num + " 不是質數");
			}
		}
	}

	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
