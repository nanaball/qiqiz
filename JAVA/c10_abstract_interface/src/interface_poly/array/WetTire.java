package interface_poly.array;

// 젖은 도로 주행용 타이어
public class WetTire implements Tire{

	@Override
	public void roll() {
		System.out.println("젖은 도로를 안전하게 주행합니다.");
	}

}
