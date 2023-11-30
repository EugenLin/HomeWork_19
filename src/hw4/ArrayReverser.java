package hw4;

public class ArrayReverser {

	public static void main(String[] args) {
		String s = "Hello World";

//		將讀取順序改寫為倒敘
		for (int i = (s.length() - 1); i >= 0; i--) {
			char currentChar = s.charAt(i);
			System.out.print(currentChar);
		}

	}

}
