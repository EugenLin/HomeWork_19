package hw9;

import java.util.Random;

public class Bank {

	static class BankAccount {
		private int balance;

		public BankAccount() {
			balance = 0;
		}

		public synchronized void deposit(int amount) {
			balance += amount;
//			System.out.println("帳戶餘額 = " + balance);
		}

		public synchronized boolean withdraw(int amount) {
			if (balance >= amount) {
				balance -= amount;
				System.out.println("熊大提款1500, 帳戶餘額 = " + balance);
				return true;
			} else {
				System.out.println("餘額不足, 請求媽媽匯款!");
				return false;
			}
		}

		public synchronized int getBalance() {
			return balance;
		}
	}

	static class Mom implements Runnable {
		private final BankAccount account;

		public Mom(BankAccount account) {
			this.account = account;
		}

		@Override
		public void run() {
			try {
				for (int i = 0; i < 10; i++) {
					Thread.sleep(new Random().nextInt(1501) + 1000);
					if (account.getBalance() < 2000) {
						System.out.println("定期檢查發現餘額低於2000, 媽媽執行定期匯款");
						account.deposit(2000);
					} else if (account.getBalance() > 3000) {
						System.out.println("定期檢查發現餘額高於3000, 媽媽跳過此次定期會款");
					}
				}
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}

		public void emergencyDeposit() {
			System.out.println("收到緊急匯款需求!");
			account.deposit(2000);
			System.out.println("媽媽已執行緊急匯款, 目前帳戶餘額 = " + account.getBalance());
		}
	}

	static class Son implements Runnable {
		private final BankAccount account;
		private final Mom mom;

		public Son(BankAccount account, Mom mom) {
			this.account = account;
			this.mom = mom;
		}

		@Override
		public void run() {
			try {
//				因為延遲不好抓能觸發嬤嬤各種事件的狀況 將取款次數增加
				for (int i = 0; i < 30; i++) {
					Thread.sleep(new Random().nextInt(1001) + 500);
					if (!account.withdraw(1500)) {
						mom.emergencyDeposit();
						System.out.println("媽媽緊急匯款後, 熊大執行原本暫緩的提款");
						account.withdraw(1500);
					}
				}
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
	}

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		System.out.println("帳戶餘額 = " + account.getBalance());

		Mom mom = new Mom(account);
		Son son = new Son(account, mom);

		Thread momThread = new Thread(mom);
		Thread sonThread = new Thread(son);

		momThread.start();
		sonThread.start();
	}
}