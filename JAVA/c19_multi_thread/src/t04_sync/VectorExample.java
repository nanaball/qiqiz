package t04_sync;

import java.lang.Thread.State;
import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		
		System.out.println("Main 시작");
		// List<String> array = new ArrayList<>(); // 데이터 손실ㅇ
		List<String> array = new Vector<>(); // 데이터의 손실x, 왜? 메소드가 싱크로나이즈드 (동기화 함수)로 되어있어서 

		Thread t1 = new Thread(()->{
			// run method
			for(int i = 0; i < 10000; i++) {
				array.add("최기근");
			}
			System.out.println("t1 종료");
		});
		t1.start();
		
		System.out.println("===========================");
		
		Thread t2 = new Thread(()->{
			for(int i = 0; i < 10000; i ++) {
				array.add("천재");
			}
			System.out.println("t2 종료");
		});
		
		t2.start();
		
		while(true) {
			if(t1.getState() == State.TERMINATED && t2.getState() == State.TERMINATED) {
				System.out.println("t1,t2 작업 완료");
				System.out.println("array size : "+array.size());
				break;
			}
		}
		
		
		System.out.println("Main 종료");

		
		
		
		
		
	} // end main

}
