package hw10;

import java.util.Scanner;

public class NumFormatter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("請輸入一個數字：");
			if (scanner.hasNextDouble()) {
				double number = scanner.nextDouble();

				while (true) {
					System.out.println("選擇顯示格式：1. 千分位 2. 百分比 3. 科學記號");
					if (scanner.hasNextInt()) {
						int choice = scanner.nextInt();

						switch (choice) {
						case 1:
							System.out.printf("%,.2f\n", number);
							return;
						case 2:
							System.out.printf("%.2f%%\n", number * 100);
							return;
						case 3:
							System.out.printf("%e\n", number);
							return;
						default:
							System.out.println("選擇錯誤，請重新選擇指定的方案代碼!");
						}
					} else {
						System.out.println("輸入錯誤，請重新輸入數字選擇!");
						scanner.next(); // 清除錯誤的輸入
					}
				}
			} else {
				System.out.println("輸入錯誤，請重新輸入數字!");
				scanner.next(); // 清除錯誤的輸入
			}
		}
	}
}
