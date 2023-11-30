package hw5;

public class MyRetangle {

	double width, depth;

	void setWidth(double width) {
		this.width = width;
	}

	void setDepth(double depth) {
		this.depth = depth;
	}

	double getArea() {
		double area = depth * width;
		return area;
	}

	public MyRetangle() {
	}

	public MyRetangle(double depth, double width) {
		setDepth(depth);
		setWidth(width);
	}
}
