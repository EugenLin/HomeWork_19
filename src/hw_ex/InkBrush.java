package hw_ex;

public class InkBrush extends Pen {

	@Override
	public int getPrice() {
		return (int) (super.getPrice() * 0.9);
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("沾墨汁再寫");
	}

}
