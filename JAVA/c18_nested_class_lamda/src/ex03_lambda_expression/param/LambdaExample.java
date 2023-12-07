package ex03_lambda_expression.param;

public class LambdaExample {

	public static void main(String[] args) {

		MyInterface i = new MyInterface() {

			@Override
			public void methodA(int x, int y) {
				int sum = x + y;
				System.out.println("sum : " + sum);
			}
		};
		i.methodA(1, 10);
		
		
		i = (a, b)->{ // 타입생략 가능
			int result = a * b;
			System.out.println("result : " + result);
		};
		i.methodA(2, 3);
		
		
		MyInterface2 i2 = a -> { // 매개변수가 하나일때는 () 생략 가능
			System.out.println(a);
		};
		i2.method("안녕하세요");
		
		
	} // end main

}
