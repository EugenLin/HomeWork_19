package hw5;

public class MyRetangleMain {

	public static void main(String[] args) {

		MyRetangle mr1 = new MyRetangle(10, 20);
		System.out.println("Area =" + mr1.getArea());

		MyRetangle mr2 = new MyRetangle();
		mr2.setDepth(10);
		mr2.setWidth(20);
		System.out.println("Area =" + mr2.getArea());
	}

}
