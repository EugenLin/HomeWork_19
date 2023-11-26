package hw4;

import java.util.StringJoiner;

public class charCounter {

	public static void main(String[] args) {
		String[] s = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

//		是可以寫for迴圈把每個詞黏在一起, 但參照chatGPT, 用StringJoiner的方式
		String concatenateStrings = concatenateStrings(s);

		int countA = countOccurrence(concatenateStrings, 'a');
		System.out.println("There is/are total " + countA + " 'a' in this array.");

		int countE = countOccurrence(concatenateStrings, 'e');
		System.out.println("There is/are total " + countE + " 'e' in this array.");

		int countI = countOccurrence(concatenateStrings, 'i');
		System.out.println("There is/are total " + countI + " 'i' in this array.");

		int countO = countOccurrence(concatenateStrings, 'o');
		System.out.println("There is/are total " + countO + " 'o' in this array.");

		int countU = countOccurrence(concatenateStrings, 'u');
		System.out.println("There is/are total " + countU + " 'u' in this array.");

	}

	private static String concatenateStrings(String[] s) {
		StringJoiner stringJoiner = new StringJoiner("");
		for (String element : s) {
			stringJoiner.add(element);
		}
		return stringJoiner.toString();
	}

	private static int countOccurrence(String input, char target) {
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == target) {
				count++;
			}
		}
		return count;
	}

}
