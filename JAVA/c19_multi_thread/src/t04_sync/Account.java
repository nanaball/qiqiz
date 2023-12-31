package t04_sync;

public class Account {
	
	// 현재 저장된 금액
	private int balance = 10000;
	
	public int getBalance() {
		return this.balance;
	}
	
	// 출금
	// synchronized public boolean withDraw(int money) { // 스레드별로 호출
	// public synchronized boolean withDraw(int money) {
	public boolean withDraw(int money) {	
		// 출금 가능한 금액 - 출금 금액이 저장된 금액보다 크거나 같다
		if(balance >= money) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
			balance -= money;
			return true;
		}
		
		// 출금할 수 없는 금액
		return false;
		
		
	}
	
}
