package practice;

import java.util.Scanner;

public class ScreenReserve {
	
	public static void main(String[] args) {
		
		byte[] seats[] = new byte[10][10];
		
		// seats[1][2] = 1;
		/*
		for(byte[] line : seats) {
			// System.out.println(line + "-");
			for(byte column : line) {
				if(column == 0) {
					System.out.print("[□]");
				}else {
					System.out.print("[■]");
				}
				// System.out.printf("[%d]",column);
			}
			System.out.println();
		}
		*/
		// 예약 프로그램 종료 flag
		boolean isRun = true;
		// 사용자에게 예약할 좌석을 입력
		Scanner sc = new Scanner(System.in);

		while(isRun) {
			System.out.println("           [SCREEN]");
			// 열번호 출력
			for(int i = 0; i < seats.length;i++) {
				System.out.print("["+(i+1)+"]");
			}
			System.out.println(" [열]");
			
			// 좌석표시
			for(int i = 0; i < seats.length; i++) {
				// System.out.println(line + "-");
				for(int j = 0; j < seats[i].length;j++) {
					if(seats[i][j] == 0) {
						System.out.print("[□]");
					}else {
						System.out.print("[■]");
					}
					// System.out.printf("[%d]",column);
				}
				System.out.println(" ["+(char)(i+65)+"행]");
			} // 상영관 그리기 완료 - 좌석표시 끝 
			
			System.out.println("예약하실 좌석의 행을 입력해주세요(A-J) > ");
			String s = sc.next();
			System.out.println(s);

			// a == 65, j == 74
			char inputRow = s.charAt(0);
			System.out.println(inputRow);
			
			if(inputRow < 65 || inputRow >74) {
				System.out.println("선택 할 수 없는 행입니다.");
				continue;
			}
			
			System.out.println("선택하신 행 이름은 : " + inputRow);
			
			// 배열 인덱스 번호로 변경 -> 0-9
			int row = inputRow - 65;
			
			// 열번호 입력받기 1-10
			System.out.println("예약하실 좌석의 열 번호를 입력해주세요(1-10) >");
			int columnNum = sc.nextInt();
			
			if(columnNum < 1 || columnNum > 10) {
				System.out.println("사용할 수 없는 열번호 입니다.");
				continue;
			}
			
			// 정상적인 행과 열을 입력 
			System.out.printf("선택하신 좌석은 %s행 %d열 입니다. %n" ,inputRow, columnNum);
			
			
			// 예약진행 
			// 행 인덱스 번호 : row
			// 열 인덱스 번호 : columnNum -1;
						
			System.out.println("예약 완료하시겠습니ㄲㅏ? Y/N > ");
			String selected = sc.next();
			
			// equals method를 이용해서 저장한 문자열이 같은지를 비교
			if(selected.equals("Y") || selected.equals("y")) {				
				// 중복예약 확인
				if(seats[row][columnNum - 1] != 0) {
					// 이미 예약된 자리
					System.out.println("이미 예약이 완료된 좌석입니다.");
					continue;
				}
				seats[row][columnNum -1] = 1;
				System.out.println("예약이 완료되었습니다.");
			}else {
				System.out.println("ㅇㅖ약이 취소되었습니다.");
			}
		
		
		
		} // end while
		
		
		
		
		
		/*
		final char Y = 10;
		final char H = 10;

		char[] arr[] = new char[Y][H];

		System.out.println("screen");
		
		while(true) {
			System.out.println("----------------------------");
			for (char i = 0; i < Y;i++) {
				System.out.print("[□]"+" ");
			}
			System.out.println("\n-----------------------");
			for(char[] i : arr) {
				System.out.print("[■]"+" ");
			}
		
		
		System.out.println("예약하실 좌석의 열을 입력해주세요 > ");
		char Y1 = sc.next().charAt(0);
		System.out.println("입력한 열 : "+Y1);
		
		System.out.println("예약하실 좌석의 행 번호를 입력해주세요 >");
		char H1 = sc.next().charAt(0);
		System.out.println("선택하신 좌석은 <"+Y+"> 열 <"+H1+"> 행입니다. ");
		
		System.out.println("예약 완료하시겠습니다? Y/N > ");
		}
		*/
		
		
		
		
	}

}
