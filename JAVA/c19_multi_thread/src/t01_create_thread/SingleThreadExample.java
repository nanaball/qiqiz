package t01_create_thread;

import java.awt.Toolkit;

public class SingleThreadExample {

	// main method
	// JVM(자바 가상기계)가 프로그램 실행 시 생성한 main thread에서 호출되는 함수 
	// 싱글 스레드 환경
	public static void main(String[] args) {
		System.out.println("Main 시작");
		// 현재 실행문이 작업 중인 thread 객체를 반환
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			
			
			try {
				// 작업스레드를 매개변수로 전달되는 millis seconds만큼 blocking하여 대기
				// 대기시간 부여
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// Interrupted : 장업을 방해하다, 가로막다, 저지하다, 도중에 방해하다, 중단시키다
				e.printStackTrace();
			}
		}
		
		// java프로그램에서 운영체제 하드웨어를 제어하는 툴킷
		Toolkit tool = Toolkit.getDefaultToolkit();
		
		System.out.println("출력 종료");
		
		for(int i = 0; i < 5; i++) {
			tool.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println("Main 종료");
	}

}
