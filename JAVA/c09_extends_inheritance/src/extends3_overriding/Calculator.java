package extends3_overriding;

public class Calculator // extends Object - 자바에서 최상위 객체 
{
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	
	public double circleArea(double radius) {	
		System.out.println("calculator circleArea 호출");
		return radius * radius * 3.14;
	}
	
	@Override
	public String toString() {
		return "Calculator";
	}

}
