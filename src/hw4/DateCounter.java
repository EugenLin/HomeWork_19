package hw4;

import java.time.LocalDate;
import java.util.Scanner;

public class DateCounter {
	public static void main(String[] args) {
		int year, month, date;
		boolean validDate = true;

		do {
			System.out.println("Please enter year: ");
			year = dataEntry();
//		去除負西元
//		while (year < 0) {
//			year = dataEntry();
//		}
			System.out.println("Please enter month: ");
			month = dataEntry();
//		去除不正確月份
//		while (month < 1 || month > 12) {
//			month = dataEntry();
//		}
			System.out.println("Please enter date: ");
			date = dataEntry();
//		日期與月份的關係寫起來太攏長 套API
		} while (!isValidDate(year, month, date));
//		讓使用者先輸入年月日資訊, 再送驗證, 若輸入錯誤則重新輸入
//		因正確時判定方法回傳true, 前面加驚嘆號反轉, 使do...while迴圈在輸入正確時停止
		int dayOfYear = calculateDayOfYear(year, month, date);

//		也是能用餘數去計算閏年和月份 慢慢算出當年第幾天 但會很長 所以套API
		System.out.println("輸入的日期 " + year + "." + month + "." + date + ".是當年的第" + dayOfYear + "天");

	}

	private static int dataEntry() {
		int entry = 0;
		Scanner sc = new Scanner(System.in);
		entry = sc.nextInt();
		return entry;

	}

	private static boolean isValidDate(int year, int month, int date) {
		try {
			LocalDate checkedDate = LocalDate.of(year, month, date);
			return true;
		} catch (Exception e) {
//				發現意外 則無效
			return false;
		}

	}

	private static int calculateDayOfYear(int year, int month, int date) {
		LocalDate day = LocalDate.of(year, month, date);
		return day.getDayOfYear();
	}

}
