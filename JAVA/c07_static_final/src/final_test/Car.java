package final_test;

public class Car {
	
	// KIA == KN
	static String company; 		// 제조사 이름
	final String model;			// 모델명
	final int maxSpeed; 		// 최대속도 (읽기만 가능한 readonly 메소드 내부에서만 가능)
	
	int speed;					// 현재속도
	
	static final int MIN_SPEED = 0;	// 최저속도 (상수, 어디에서나 공통된 값을 활용 가능)
	
	
	Car(){
		this.model = "k3";
		this.maxSpeed = 280;
	}
	
	Car(String model, int maxSpeed){
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	
	public static void main(String[] args) {
		
		int v = 100;
		v = 101;
		
		// read only
		final int c;
		c = 100;
		
		// 값을 변경 할 수 없고 읽기만 가능
		// c = 1000;
		
		Car.company = "KIN";
		Car k3 = new Car();
		System.out.println(k3.model);
		System.out.println(k3.maxSpeed);
		// k3.model = "k5"; - final로 생성한거라 변경 할 수 없음/ 다만 초기화 시켜야함 
		Car k5 = new Car("k5",320);
		System.out.println(k5.company);
		System.out.println(k5.model);
		System.out.println(k5.maxSpeed);
		
		System.out.println(Car.MIN_SPEED);
		
		System.out.println(Math.random());
		// Math.PI = 3.141512;
		System.out.println(Math.PI);
	}

}
