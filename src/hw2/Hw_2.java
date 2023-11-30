package hw2;

public class Hw2 {

	public static void main(String[] args) {

		System.out.println("Q1");
		System.out.println();

		int sum = 0;
		for (int i = 2; i <= 1000; i += 2) {
			sum += i;
		}
		System.out.println("Total = " + sum);

		System.out.println();
		System.out.println("===========");
		System.out.println();

		System.out.println("Q2");
		System.out.println();

		int product1 = 1;

		for (int i1 = 2; i1 <= 10; i1++) {
			product1 = product1 * i1;
		}
		System.out.println("Product = " + product1);

		System.out.println();
		System.out.println("===========");
		System.out.println();

		System.out.println("Q3");
		System.out.println();

		int product2 = 1;
		int i2 = 2;
		while (i2 <= 10) {
			product2 = product2 * i2;
			i2++;
		}
		System.out.println("Product = " + product2);

		System.out.println();
		System.out.println("===========");
		System.out.println();

		System.out.println("Q4");
		System.out.println();

		int result4 = 1;
		for (int i4 = 3; i4 <= 21; i4 += 2) {
			System.out.print(result4 + " ");
			result4 += i4;
		}

		System.out.println();
		System.out.println("===========");
		System.out.println();

		System.out.println("Q5");
		System.out.println();

		int total5 = 0;

		for (int i5 = 1; i5 <= 49; i5++) {

			int a = i5 % 10;
			int b = i5 / 10;

			if (a != 4 && b != 4) {
				System.out.print(i5 + " ");
				total5 += 1;
			}
		}
		System.out.println("Total " + total5 + " numbers are accetable.");

		System.out.println();
		System.out.println("===========");
		System.out.println();

		System.out.println("Q6");
		System.out.println();

		for (int i6 = 10; i6 >= 1; i6--) {
			int j6 = 1;
			while (j6 <= i6) {
				System.out.print(j6 + " ");
				j6++;
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("===========");
		System.out.println();

		System.out.println("Q7");
		System.out.println();

		for (int i7 = 1; i7 <= 6; i7++) {
			int j7 = 1;
			int k7 = i7 + 64;

			while (j7 <= i7) {
				System.out.print((char) k7 + " ");
				j7++;
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("===========");
		System.out.println();

		System.out.println("Q8");
		System.out.println();

		System.out.println();
		System.out.println("for + while" + "\n");
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.println(i + " x " + j + " = " + (i * j));
				j++;
			}
		}

		System.out.println();
		System.out.println("for + do while" + "\n");
		for (int i = 1; i <= 9; i++) {
			int j = 1;

			do {
				System.out.println(i + " x " + j + " = " + (i * j));
				j++;
			} while (j <= 9);
		}

		System.out.println();
		System.out.println("while + do while" + "\n");

		int i = 1;
		while (i <= 9) {

			int j = 1;

			do {
				System.out.println(i + " x " + j + " = " + (i * j));
				j++;
			} while (j <= 9);

			i++;
		}

		System.out.println("Finished!");

		System.out.println();
		System.out.println("===========");
		System.out.println();

	}

}
