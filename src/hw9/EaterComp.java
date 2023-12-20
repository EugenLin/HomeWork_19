package hw9;

public class EaterComp {

	public static void main(String[] args) {
		// 創建兩個參賽者執行續
		Thread comp1 = new Thread(new Competitor("饅頭人"));
		Thread comp2 = new Thread(new Competitor("詹姆士"));

		// 啟動執行續
		System.out.println("比賽開始");

		comp1.start();
		comp2.start();

		try {
			// 等待第一位參賽者完成
			comp1.join();
			// 等待第二位參賽者完成
			comp2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("比賽結束");
	}

	static class Competitor implements Runnable {
		private String name;

		public Competitor(String name) {
			this.name = name;
		}

		@Override
		public void run() {
			try {
				for (int i = 1; i <= 10; i++) {
					// 模擬吃飯時間
					int eatingTime = 500 + (int) (Math.random() * 2500);
					Thread.sleep(eatingTime);

					// 每吃完一碗列印一行提示
					System.out.println(name + " 吃完了第 " + i + " 碗。");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
