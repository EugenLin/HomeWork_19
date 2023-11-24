package hw3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class hw3_triangle {
//=============
	public static void main(String[] args) {

		System.out.println("請輸入任意三個整數:");
		Scanner sc = new Scanner(System.in);
		int[] numbers = getInputArray(sc);
		sc.close();

//		order the ints in array from small to large
		Arrays.sort(numbers);

////		check for input numbers in array
//		for (int num : numbers) {
//			System.out.println(num + " ");
//		}

		System.out.println(getResult(numbers));

	}

// =============
	public static int[] getInputArray(Scanner sc) {
		int[] inputArray = new int[3];

		for (int i = 0; i < 3; i++) {

//			input validation and re-entry for invalid input
			boolean validInput = false;

			while (!validInput) {
				try {
					inputArray[i] = sc.nextInt();
					validInput = true;
//					InputMismatchException e from java.until.InputMismatchException
				} catch (InputMismatchException e) {
					System.out.println("Invalid Input. Please enter a valid integer.");
					sc.next();
				}
			}

		}
		return inputArray;
	}

//   =================
	public static String getResult(int[] x) {
		int a = x[0], b = x[1], c = x[2];

		if (c < (a + b) && a > 0 && b > 0 && c > 0) {

			if ((a * a + b * b) == c * c) {
				String result = "直角三角形";
				return result;
			} else if (a == b && b != c) {
				String result = "等腰三角形";
				return result;
			} else if (a == b && b == c) {
				String result = "正三角形";
				return result;
			} else {
				String result = "其他三角形";
				return result;
			}

//			String result = "三角形";
//			return result;
		} else {
			String result = "非三角形";
			return result;
		}

	}

//	===================
}
