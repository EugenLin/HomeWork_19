package hw_ex;

public class Pencil extends Pen {

	@Override
	public int getPrice() {
		return (int) (super.getPrice() * 0.8);
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("削鉛筆再寫");
	}

}
