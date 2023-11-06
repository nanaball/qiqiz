package com.bitc.conditional_statement;

import java.util.Scanner;

// import java.util.Scanner;

public class if_switchExample {
	
	public static void main(String[] args) {
		// 컨트롤 + 시프트 + o : 자동 import
		Scanner sc = new Scanner(System.in);
		
		/*
		 * "사용자에게 점수를 입력해주세요 >" 라고 출력한뒤 정수값을 입력받는다.
		 * 변수 선언 및 정수값 입력
		 * 
		 * 90-100점은 "a학점"
		 *  80-89점은 "b학점"
		 *  70-79점은 "c학점"
		 *  60-69점은 "d학점"
		 *  0-100점이 아니거나 59점 이하면 나머지는 "f학점"
		 */
		
		
		/*
		   System.out.println("사용자에게 점수를 입력해주세요 >");
		   int scr = sc.nextInt();
		   System.out.println("점수 : " + scr);
		
		   if(scr >= 90 ) {
			   System.out.println("A학점");			
		   }else if(scr >= 80){
			   System.out.println("B학점");
		   }else if(scr >= 70){
			   System.out.println("c학점");	
		   }else if(scr >= 60){
			   System.out.println("d학점");
		   }else {
			   System.out.println("F학점");
		   }
		 */
		
		System.out.println("사용자에게 점수를 입력해주세요 >");
		int scr = sc.nextInt();
		
		if(scr >= 90 && scr <= 100) {
			   System.out.println("A학점");			
		   }else if(scr >= 80 && scr <= 89){
			   System.out.println("B학점");
		   }else if(scr >= 70 && scr <= 79){
			   System.out.println("C학점");	
		   }else if(scr >= 60 && scr <= 69){
			   System.out.println("D학점");
		   }else {
			   System.out.println("F학점");
		   }
		
		System.out.println(scr / 10);
		switch(scr / 10) {
			case 10 : case 9 :
				System.out.println("a학점");			
				break;
			case 8 :
				System.out.println("b학점");			
				break;
			case 7 :
				System.out.println("c학점");			
				break;
			case 6 :
				System.out.println("d학점");			
				break;
			default :
				System.out.println("f학점");			
		}
		
		// 문자 타입
		char c = '@'; // 64
		System.out.println("한개의 문자를 입력해주세요.");
		// 문자열
		c = sc.next().charAt(0);
		switch(c) {
			case 64 : 
				System.out.println("64 : " + c);
				break;
			case 'a' : 
				System.out.println("a : " + c);
				break;
			case 'b' : 
				System.out.println("b : " + c);
				break;
			default : 
				System.out.println("만족하는 녀석이 없습니다" + c);				
		}
		
		String rank = "Gold";
		switch(rank) {
			case "Gold" :
				System.out.println("금메달 입니다.");
				break;
			case "Silver" :
				System.out.println("은메달 입니다.");
				break;
			case "Bronze" :
				System.out.println("동메달 입니다.");
				break;
			default : 
				System.out.println("획득한 메달이 없습니다.");			
		}
		
	}

}
