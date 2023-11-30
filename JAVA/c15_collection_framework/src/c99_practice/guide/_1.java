package c99_practice.guide;

import java.util.ArrayList;
import java.util.Scanner;

public class _1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("6개의 학점을 빈칸으로 분리 입력 >>");
		String scores = sc.next();
		System.out.println(scores);
		System.out.println("입력 완료");
			
		
		ArrayList score = new ArrayList();
		score.add("A");
		score.add("B");
		score.add("C");
		score.add("D");
		score.add("F");
		
		

		for(int i = 0; i < score.size(); i++) {
			System.out.print(score.get(i));
		}
		

		
		// 해당 인덱스 값을 변경하고 기존에 저장되어있던 값을 반환
		scores = (String) score.set(0, 4.0);
		scores = (String) score.set(1, 3.0);
		scores = (String) score.set(2, 2.0);
		scores = (String) score.set(3, 1.0);
		scores = (String) score.set(4, 0.0);
		System.out.println("result : " + scores);
	
		System.out.println("시스템 종료");
	}

}
