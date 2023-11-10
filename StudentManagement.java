package f_object_array;

import java.util.Scanner;

public class StudentManagement {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student[] students = null;
		
		
		
		while(true) {
			System.out.println("=====================================");
			System.out.println("1.학생수|2.정보입력|3.정보확인|4.분석|5.종료");
			System.out.println("=====================================");
			System.out.println("메뉴 번호를 입력해주세요 > ");
			int selectNo = sc.nextInt();
			
			/*
			 * 1. 학생수를 입력받아 student 객체가 저장될 students 배열 생성
			 * 	  - 입력 받은 학생 수 만큼
			 * 2. 생성된 students 배열의 항목 수만큼 학생의 정보를 입력받아 저장 
			 * 	  - 학번(int), 이름(String), 점수(int)
			 * 3. students 배열에 저장된 학생들의 정보(field data)를 출력
			 * 4. students 배열에 저장된 학생들의 점수를 전체 합계, 평균을 구해서 출력 
			 *    students 배열에 저장된 학생들의 점수 중에서 최고 득점자 이름, 최저 득점자 이름 출력
			 * 5. 종료 
			 */
			
			System.out.println("선택한 번호는 "+selectNo+"입니다.");
			
			if(selectNo == 1) {
				System.out.println("학생수를 입력해 주세요");
				int studentN = sc.nextInt();
				students = new Student[studentN];

			}else if(selectNo == 2) {
				System.out.println("1에 입력한 학생수만큼 학번, 이름, 점수를 입력해주세요 ");
				Student stu = new Student();	
				
			}else if(selectNo == 3) {
				System.out.println(String getInfo);
					
	
			}
			
			
			
			
			
			
		} // end while
		
		
		
		
	} // end main

} // end class
