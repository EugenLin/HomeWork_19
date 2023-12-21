package hw10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateFormatter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LocalDate date;

		while (true) {
			System.out.println("請輸入日期（格式：YYYYMMDD，例如：20120131）：");
			String input = scanner.nextLine();

			if (isValidDate(input)) {
				date = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyyMMdd"));

				while (true) {
					System.out.println("選擇輸出格式：1. 年/月/日 2. 月/日/年 3. 日/月/年");
					String choice = scanner.nextLine();

					switch (choice) {
					case "1":
						System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
						return;
					case "2":
						System.out.println(date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
						return;
					case "3":
						System.out.println(date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
						return;
					default:
						System.out.println("輸入錯誤，請重新選擇!");
					}
				}
			} else {
				System.out.println("非正確日期格式，請重新輸入");
			}
		}
	}

	private static boolean isValidDate(String dateString) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
			formatter.parse(dateString);
			return true;
		} catch (DateTimeParseException e) {
			return false;
		}
	}
}
