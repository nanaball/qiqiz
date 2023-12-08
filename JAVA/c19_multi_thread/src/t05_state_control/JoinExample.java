package t05_state_control;

public class JoinExample {

	public static void main(String[] args) {

		// Join이 호출된 thread가 종료될때까지 다른 thread를 일시 정지 시킴 
		Thread t1 = new Thread(){
			
			private int sum;
			
			@Override
			public void run() {
				for(int i = 1; i <= 100; i++) {
					sum+=i;
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e){}
					System.out.println(getName()+" sum: "+ sum);
				} // end for
				System.out.println("sum thread 종료");
			} // end run
				
		}; // end thread
		t1.setName("SumThread");
		t1.start();
		
		
		try {
			// t1.join(); // t1의 모든 작업이 완료되면 다른 thread가 작업수행
			t1.join(1000); // 매개변수로 전달된 밀리세컨만큼 t1스레드 작업 수행
			// 시간이 지나면 다른 스레드도 작업수행
		} catch (InterruptedException e) {}

		
		System.out.println("Main 종료");

	}

}
