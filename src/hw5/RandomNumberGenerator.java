package hw5;

//import java.util.Random; ChatGPT建議使用下者更安全
import java.security.SecureRandom;

public class RandomNumberGenerator {

	public static void main(String[] args) {

		System.out.println("驗證碼: ");
		codeResult();

	}

	public static void codeResult() {

		for (int i = 0; i < 8; i++) {
			System.out.print((char) (randomNumberGenerator()));
		}

	}

	public static int randomNumberGenerator() {

		SecureRandom ran = new SecureRandom();
		int randomInt = 0;

		int min1 = 48;
		int max1 = 57;

		int min2 = 65;
		int max2 = 90;

		int min3 = 97;
		int max3 = 122;

		int randomRange = ran.nextInt(3);

		switch (randomRange) {
		case 0:
			randomInt = ran.nextInt(max1 - min1 + 1) + min1;
			break;
		case 1:
			randomInt = ran.nextInt(max2 - min2 + 1) + min2;
			break;
		case 2:
			randomInt = ran.nextInt(max3 - min3 + 1) + min3;
			break;
		}

		return randomInt;
	}

}
