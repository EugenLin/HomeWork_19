package hw6;

import java.util.Scanner;

public class Calculator {
	private int x;
	private int y;
	private int z;
	boolean success = false;

	public int result() {

		while (!success) {
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入X的值:");
			x = sc.nextInt();

			System.out.println("請輸入Y的值:");
			y = sc.nextInt();
			try {
				if (x == 0 && y == 0) {
					// 如果x和y同時為0，則拋出例外
					throw new CalException("x和y同時為0，次方沒有意義。");
				} else if (y < 0) {
					// 如果y為0，則拋出例外
					throw new CalException("Y為負值，X的次方結果不為整數。");
				} else {
					// 在這裡執行正常的邏輯
					z = x * y;
					success = true; // 設置成功標誌
				}
			} catch (CalException e) {
				// 處理CalException例外
				System.out.println("捕捉到CalException例外: " + e.getMessage());
			}

		}
		return z;
	}
}
