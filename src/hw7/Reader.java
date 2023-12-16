package hw7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	public static void main(String[] args) {
		// 設定相對路徑，只需提供檔案名稱
		String fileName = "./src/hw7/Sample.txt";

		try {
			// 讀取檔案
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			int byteCount = 0;
			int charCount = 0;
			int lineCount = 0;

			// 逐行讀取檔案內容
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				byteCount += line.getBytes().length; // 計算位元組數
				charCount += line.length(); // 計算字元數
				lineCount++; // 計算列數
			}

			// 關閉資源
			bufferedReader.close();

			// 輸出統計信息
			System.out.println("文字檔共有 " + byteCount + " 個位元組, " + charCount + " 個字元, " + lineCount + " 列資料。");

		} catch (IOException e) {
			// 處理IOException
			e.printStackTrace();
		}
	}
}
