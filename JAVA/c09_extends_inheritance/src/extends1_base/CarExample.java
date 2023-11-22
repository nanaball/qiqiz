package extends1_base;

class Car{
	String company;
	int maxSpeed;
	
	Car(){
		System.out.println("Car 기본 생성자 호출");
	}
	
	Car(String company){
		this.company = company;
		System.out.println("Car company를 넘겨받는 생성자");
	}
	
	public String toString() {
		return "Car [company : "+this.company+", maxSpeed : " +this.maxSpeed+"]";
	}
	
} // end class car

// is a
class Taxi extends Car{
	Taxi(){
		super(); // 생략가능함. 자동으로 적용되서 
		System.out.println("Taxi 기본 생성자 호출");
		// super(); - 부모생성자 호출은 자식생성자 맨 위에 있어야 함. 
	}
}

// 버스는 차다
class Bus extends Car{
	
	Bus(String company){
		super(company);
		System.out.println("Bus 생성자 호출");
	}
	
}

public class CarExample {

	public static void main(String[] args) {
		Taxi taxi = new Taxi();
		taxi.company = "KIA";
		taxi.maxSpeed = 180;
		System.out.println(taxi.toString());
		
		Bus bus = new Bus("HYUNDAI");
		bus.maxSpeed = 200;
		String str = bus.toString();
		System.out.println(str);
		}
}
