package hw4;

import java.util.Scanner;

public class NoMoney {

	public static void main(String[] args) {
		int[][] data = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };

		int needed = 0, count = 0;
		System.out.println("請輸入想借多少錢: ");
		Scanner sc = new Scanner(System.in);
		needed = sc.nextInt();

		System.out.print("員工編號:");

		for (int i = 0; i < data.length; i++) {

			for (int j = 0; j < data[i].length; j++) {
				if (needed <= data[i][j]) {
					System.out.print(" " + data[i][0]);
					count++;
				}
			}
		}

		System.out.println(", 共 " + count + "人可供借款!");

	}
}
