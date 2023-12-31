package t02_priority_name;

public class PriorityNameExample {

	public static void main(String[] args) {

		// priority - 우선 순위
		// 현재 실행문이 실행되는 스레드의 정보를 객체로 반환
		Thread t = Thread.currentThread();
		System.out.println(t);
		// [main,5,main]
		// 보통의 main 스레드, 우선순위 1-10 인데 5면 보통, 현재 스레드 위치

		// 스레드 이름
		System.out.println(t.getName());
		// 스레드 우선순위
		System.out.println(t.getPriority());

		System.out.println(Thread.MAX_PRIORITY); // 최대값 10
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);

		System.out.println("-------------------------------------");
		
		for (int i = 1; i <= 10; i++) {
			Thread calc = new CalcThread("CalcThread-" + i);
			if (i == 7) {
				calc.setPriority(Thread.MAX_PRIORITY);
			}
			calc.start();
		}
		
		for(int i = 0; i < 5; i++) {
			// 따로 스레드 이름을 지정하지 않으면 0 에서 부터 순번을 가짐
			Thread t2 = new Thread(()->{
				for(int j = 0; j < 2100000000; j++);
				System.out.println(Thread.currentThread());
			});
			t2.start();
		}
		
		System.out.println("MAIN 종료");

	} // end main

}
