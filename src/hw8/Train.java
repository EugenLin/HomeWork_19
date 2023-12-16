package hw8;

import java.util.Objects;

public class Train {
	private int number;
	private String type;
	private String start;
	private String end;
	private int price;

	public Train(int number, String type, String start, String end, int price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.end = end;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Train: " + number + ", " + type + ", " + start + ", " + end + ", " + price;
	}

//	第三小題去重
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Train train = (Train) obj;
		return Objects.equals(number, train.number);
	}

//	第三小題去重
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
