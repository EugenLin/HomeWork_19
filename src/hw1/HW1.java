package hw1;

public class HW1 {
	public static void main(String[] args) {

		System.out.println("Q1");
		System.out.println();
		int x1 = 12, y1 = 6;
//		和
		int a1 = x1 + y1;
		System.out.println("和 = " + a1);
//		積
		int a2 = x1 * y1;
		System.out.println("積 = " + a2);

		System.out.println();
		System.out.println("===========");
		System.out.println("Q2");
		System.out.println();

		int x2, y2;
		x2 = 200 / 12;
		y2 = 200 % 12;

		System.out.println("200顆蛋 = " + x2 + "打又" + y2 + "顆蛋");

		System.out.println();
		System.out.println("===========");
		System.out.println("Q3");
		System.out.println();

		int x3 = 256559, a3, b3, c3, d3;
		a3 = x3 / (60 * 60 * 24);
		b3 = x3 / (60 * 60) - 24 * a3;
		c3 = x3 / 60 - 60 * (b3 + 24 * a3);
		d3 = x3 % 60;
		System.out.println(x3 + "秒等於" + a3 + "天" + b3 + "小時" + c3 + "分又" + d3 + "秒");

		System.out.println();
		System.out.println("===========");
		System.out.println("Q4");
		System.out.println();

		final double PI = 3.1415;
		double diameter = 5;

		double perimeter = diameter * PI;
		System.out.println("Perimeter = " + String.format("%.4f", perimeter));

		double area = Math.pow(diameter / 2, 2) * PI;
		System.out.println("Area = " + String.format("%.5f", area));

		System.out.println();
		System.out.println("===========");
		System.out.println("Q5");
		System.out.println();

		double x5 = 1_500_000, y5 = 1.02, a5 = 0;
		int count = 1;

		for (int i = 1; i <= 10; i++) {
			if (count == 1) {
				a5 += y5;
				count++;
			} else {
				a5 = a5 * y5;
			}
		}

		System.out.println("After 10 years, total money equal to $" + String.format("%.0f", a5 * x5));

		System.out.println();
		System.out.println("===========");
		System.out.println("Q6");
		System.out.println();

//		JAVA視為兩個數字5的相加, 印出來的是數字
		System.out.println(5 + 5);
		System.out.println();

//		因為char在JAVA中為 integral data type, 因此對應ASCII的數字53, 故執行5+53=58
		System.out.println(5 + '5');
		System.out.println();

//		看起來是55, 但實際上左邊是數字5而右邊是字串5, 只是擺在一起看起來是55
		System.out.println(5 + "5");
		System.out.println();

	}
}
