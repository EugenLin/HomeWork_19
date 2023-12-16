package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RanNum {
	public static void main(String[] args) {
		String fileName = "./src/hw7/RanNumOutput.txt";

		try {
			FileWriter fileWriter = new FileWriter(fileName, true);
			BufferedWriter buffdWriter = new BufferedWriter(fileWriter);

			Random random = new Random();

			// 生成 10 個亂數
			for (int i = 0; i < 10; i++) {
				// 生成介於 1 到 1000 之間的亂數
				int randomNumber = random.nextInt(1000) + 1;

				System.out.println("隨機數 #" + (i + 1) + ": " + randomNumber);

				// 將資料寫入檔案 String化避免輸出亂碼
				buffdWriter.write(String.valueOf(randomNumber));
				buffdWriter.newLine();

			}

			buffdWriter.write("=======================");
			buffdWriter.newLine();

			buffdWriter.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
