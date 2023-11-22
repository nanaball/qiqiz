package extends3_overriding;

public class Computer extends Calculator{

	// 접근제한자는 부모보다 넓은것만 가능 (부모가 public인데 자식이 private일 수 없음)
	@Override // annotation = 주석 // 부모클래스에 있는거와 동일한지 재정의해줌 
	public double circleArea(double radius) {	
		System.out.println("Computer에 존재하는 circleArea");
		return radius * radius * Math.PI;
	}
	
}
