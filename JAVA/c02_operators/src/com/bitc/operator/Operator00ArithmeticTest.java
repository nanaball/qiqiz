package com.bitc.operator;

public class Operator00ArithmeticTest {
	
	public static void main(String[] args) {
		System.out.println("- main 프로그램 실행");
		
		int num1 = 10;
		
		int num2 = 20;
		
		System.out.println(+num1); // (+1 * num1)
		System.out.println(-num2); // (-1 * num2)
		System.out.println(num2);
		
		num2 = -num2;
		System.out.println(num2);
		System.out.println(-num2);
		
		System.out.println("------------------------------------------");
		
		int result = num1 + num2;
		System.out.println("result : "+ result);
		
		num1 = 10;
		num2 = 3;
		// 정수와 정수의 산술 연산의 결과 타입은 int, 소수점 결과값x
		result = num1 / num2;
		System.out.println("정수 연산 : " + result);
		double dResult = num1 / num2;
		System.out.println("정수 연산 : " + dResult);
						  // 10		 3.0
		double typeResult = num1 / dResult;
		System.out.println("typeResult : " + typeResult);
		
		// 문자열과 다른 타입의 산술 연산 : 접합연산(+)만 가능
		String s = "최기근 ";
		String strResult = num1 + num2 + s;
		System.out.println(strResult);
		
		// 문자열 연산은 +만 가능 나머지 연산은 컴파일 오류		
		// strResult = num1 - num2 - s;
		
		strResult = s + num1 +num2;
		System.out.println(strResult);
	
		int a = 1;
		// (b = a); a = a + 1;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		
		// a = a + 1; b = a;
		b = ++a;
		System.out.println(a);
		System.out.println(b);
		
		
		System.out.println("- main 프로그램 종료");
		
	}
	

}
