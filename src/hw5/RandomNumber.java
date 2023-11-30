package hw5;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("The 10 generated random numbers: ");
		ranGenerator(sum);
		System.out.println();
		System.out.println("Avarage = " + sum);

	}

	public static int[] ranGenerator(int sum) {
		int[] ranArray = new int[10];

		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			int randomNumber = random.nextInt(101); // 生成0到100之間的亂數
			ranArray[i] = randomNumber;
			System.out.print(randomNumber + "\t");
			sum += randomNumber;
		}

		return ranArray;

	}

}
