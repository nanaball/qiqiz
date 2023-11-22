package com.bitc.test;

/**
 * 문서 주석
 * 이 클래스는 기본 타입의 변수 사용법을 알아봅니다.
 * @since 2023-11-02
 */
public class VariableTest {
	/*
	 프로그램 동작의 시작과 끝은 main method에서 이루어진다.
	 */
	public static void main(String[] args) {
		// TODO 변수 다시 확인!
		// 선언부
		int num;
		// num = "최기근"; (x) // int형 정수만 사용 가능
		// 초기화 전에는 해당 변수를 사용할 수 없다. 
		// 컴파일 오류
		// System.out.println(num);
		
		// 0B 바이너리 - 뒤에오는 값는 이진수
		byte bNum = 0B00001010;
		System.out.println("bNum : " + bNum);
		
		// 앞에 0이 붙으면 8진수 임을 의미한다.
		byte oNum = 012;
		// (8^1 * 1) + (8!0 == 1 * 2) = 10;
		System.out.println("oNum : " + oNum);
		
		// 앞에 0X가 붙으면 16진수 임을 의미
		// 0 ~ 9 A B C D E F
		byte xNum = 0X3A;
		System.out.println("oNum : " + xNum);
		
		byte b1 = -128;
		b1 = 127;
		// b1 = -129; (x) 저장 범위를 벗어나는 데이터가 대입되면 컴파일 오류
		
		// '' == 한개의 문자
		// "" == 문자열
		// Character
		char c = 'A';
		// c = 'ab'; (x)
		// c = "A"; (x)
		// c = -1 (x) 음수를 표현하지 않음. 0 ~ 65535 양의 정수로 문자 표현
		c = 65; // 65 == 대문자A ~ 97 == 대문자Z
		c = 65535;
		
		System.out.println("c : " + c); 
		
		// 2byte의 정수값을 저장하는 short
		short s = -30000;
		
		// 정수형 상수 리터럴은 4byte의 int 타입으로 저장
		int i = 2100000000; // 정수의 기본타입
		// 4byte
		// [    1    ][    1    ][    1    ][    1    ]
		
		long l = 10000000000L; // 100억 
		// 기본이 int 4byte라 8byte인 long은 대문자나 소문자 l을 입력해줘야 컴파일링 가능
		
		char c1 = 'A';
		System.out.println(c1 + 1); // 기본이 int라 정수계산된 값은 int로 됨
		// char c2 = c1 + 1; (x)  
		char c2 = (char)(c1 + 1);
		System.out.println(c2);
		System.out.println(10 / 3); // 정수 int값으로 계산되서 소수점 사라지고 정수만 남음
		
		// 8byte의 실수를 저장하는 타입 - 정밀.
		double d = 3.141592; // 실수의 기본타입
		
		// 4byte의 실수를 저장
		float f = 3.141592f; // 4byte라는 걸 알려줘야 해서 뒤에 대소문자 f 입력
		double result = 3.141592 * 10 * 10;		
		System.out.println(3.141592 * 10 * 10); // 실수가 하나라도 있으면 실수 기본타입인 double 전환
		System.out.println(10.0 / 3);
		
		boolean isTrue = true;
		isTrue = 3e+5 == 300000;
		System.out.println(isTrue);
		isTrue = (3e-5 == 0.00003);
		System.out.println(isTrue);
		
		String str = "문자열을 저장하는 녀석";
		// System.out.println(); 자동완성 syso ctrl + space
		System.out.println(str);
	
	}

}
