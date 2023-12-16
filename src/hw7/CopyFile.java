package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) {
		String sourcePath = "./src/hw7/source.txt";
		String targetPath = "./src/hw7/target.txt";

		try {
			fileCopy(sourcePath, targetPath);
			System.out.println("複製成功！");
		} catch (IOException e) {
			System.out.println("複製失敗：" + e.getMessage());
		}
	}

	public static void fileCopy(String sourcePath, String targetPath) throws IOException {
		// 建立 FileReader 和 FileWriter 來讀取和寫入檔案
		try (FileReader sourceReader = new FileReader(sourcePath); FileWriter targetWriter = new FileWriter(targetPath)) {
			// 建立 BufferedReader 和 BufferedWriter 以提高效能
			try (BufferedReader sourceBuffReader = new BufferedReader(sourceReader); BufferedWriter targetBuffWriter = new BufferedWriter(targetWriter)) {
				// 讀取並寫入檔案內容
				String line;
				while ((line = sourceBuffReader.readLine()) != null) {
					targetBuffWriter.write(line);
					targetBuffWriter.newLine();
				}
			}
		}
	}
}