package guide.practice01;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("6개의 학점을 공백으로 분리 입력(A/B/C/D/F) >>");
		String value = sc.nextLine();
		
		
		// 합계
		double total = 0;
		double avg = 0.0;
		
		// 코드 작성
		
		ArrayList <Character> score = new ArrayList<Character>();
		for(int i=0; i < 6; i++){
			char n = sc.next().charAt(0);
			score.add(sc.next());
		}
	
		for(int i=0; i<score.size(); i++){
			switch(score.get(i)){
				case "A" :
					System.out.println(4.0);
					break;
				case "B" :
					System.out.println(3.0);
					break;
				case "C" :
					System.out.println(2.0);
					break;
				case "D" :
					System.out.println(1.0);
					break;
				case "F" :
					System.out.println(0);
					break;
				default:
					System.out.println("잘못된 값 입력");
					break;
			}
			System.out.println("평균은 : " + avg);
			
			System.out.println("시스템 종료");
		}
		
	}

}
