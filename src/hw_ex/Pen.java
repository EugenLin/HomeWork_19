package hw_ex;

abstract class Pen {

	private String brand;
	private int price;

	Pen() {
	}

	Pen(String brand, int price) {
		setBrand(brand);
		setPrice(price);

	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public abstract void write();

}
