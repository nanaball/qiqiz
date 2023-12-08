package t03_state;

public class StateExample {

	public static void main(String[] args) {

		System.out.println("메인 시작");
		TargetThread targetThread = new TargetThread();
		
		Thread print = new StatePrintThread(targetThread);
		print.start();
		
		
		
		// main 스레드가 먼저 종료되서 일찍 나옴 
		System.out.println("메인 종료");
		
	} // end main

}
