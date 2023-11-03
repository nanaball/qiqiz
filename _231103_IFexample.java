package com.bitc.conditional_statement;

import java.util.Scanner;

public class IFexample {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		if(true) {
			System.out.println("무조건 실행");
		}
		
		if(num1 < num2) {
			System.out.println("num1이 num2보다 작다");
		}
		
		if(num1 < num2) {
			System.out.println("num1이 num2보다 작다");
		}else if (num1 > num2) {
			System.out.println("num1이 num2보다 크다");
		}else {
			System.out.println("num1이 num2과 같다");
		}
		
		// 나중에 배우게 될 객체
		// 맨위 import에 java.util.Scanner;를 작성해주었기에 java.util을 입력하지 않아도 됨
		// 위치를 작성하지 않고 Scanner만 쓸 경우 자동적으로 java.lang으로 인식하는데 여기에 없으면 어디에 있는지 몰라 작동하지 않음
		// 그래서 java.util.Scanner 라고 작성함
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("정수값을 입력해 주세요");
		// Scanner.nextInt(); console을 통해서 정수값을 입력받아 반환
		int a = sc.nextInt();
		System.out.println(a);
		// Scanner.next(); console을 통해서 한단어를 입력받아 반환
		System.out.println("단어를 입력해주세요");
		String str = sc.next();
		System.out.println(str);
		
		System.out.println("실수를 입력해주세요 > ");
		double r = sc.nextDouble();
		System.out.println(r);
		
		System.out.println("실행여부를 작성해주세요 true or false");
		boolean isRun = sc.nextBoolean();
		System.out.println(isRun);
		
		
		System.out.println("boolean 타입으로 값을 입력받아 저장");
		System.out.println("지정된 타입으로 값이 입력되었는지 여부를 boolean타입으로 반환");
		isRun = sc.hasNextBoolean();
		/*
		 * Scanner.hasNextBoolean();
		 * Scanner.hasNextInt();
		 * Scanner.hasNextDouble();
		 * Scanner.hasNext();
		 */
		
		// boolean타입의 값인지 여부확인
		if(isRun) {
			System.out.println("boolean 타입의 값이 정상적으로 입력");
			boolean isResult = sc.nextBoolean();
			System.out.println(isResult);
		}else {
			System.out.println("boolean 타입의 값이 아닙니다.");
			String dummy = "10";
			dummy = "3.141592";
			dummy = "true";
			dummy = sc.next();
			System.out.println("잘못된 값을 꺼내와서 제거 : " + dummy);
			
		}
		
		
	}

}
