package d_contructor;

// 실행 class
public class CarExamlple {

	public static void main(String[] args) {

		Car car = new Car();

		car.company = "Benz";
		car.model = "S class";
		car.color = "Black";
		car.maxSpeed = 380;
		car.speed = 0;
		
		Car k5 = new Car("KIA", "K5", 230);
		
		System.out.println(k5.company);
		System.out.println(k5.model);
		System.out.println(k5.color);
		System.out.println(k5.maxSpeed);
		
		Car k3 = new Car("kia","k3","white");
		System.out.println(k3);
		
		Car avante = new Car("hyundea","avante","white",180,0);
		System.out.println(avante.company);
		
	}

}
