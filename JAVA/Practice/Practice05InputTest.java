import java.util.Scanner;

public class Practice05InputTest {
	
	public static void main(String[] args) {
		
		// 사용자에게 5개의 정수를 입력받아 sum 변수에 저장하고 그 값을 통해 평균을 정수로 출력하는 소스코드를 작성하시오 (sum/5)

		Scanner sc = new Scanner(System.in);
		// 평균 = 총합계 / 항목개수
		
		// 총합계
		int sum = 0;
		int score1 = 0, score2 = 0, score3 = 0, score4 = 0, score5 = 0;
		/*
		System.out.println("성적을 입력해주세요.");
		score1 = sc.nextInt();
		
		System.out.println("성적을 입력해주세요.");
		score2 = sc.nextInt();
		
		System.out.println("성적을 입력해주세요.");
		score3 = sc.nextInt();
		
		System.out.println("성적을 입력해주세요.");
		score4 = sc.nextInt();
		
		System.out.println("성적을 입력해주세요.");
		score5 = sc.nextInt();
		*/
		
		for(int i = 0; i < 5; i++) {
			System.out.print("성적을 입력해주세요. : ");
			sum = sum + sc.nextInt();
			System.out.println(sum);
		}
		int avg = sum / 5;
		System.out.println("총합 성적은 " +sum+"입니다.");
		System.out.println("평균 성적은 " + avg + "입니다.");
		
		
		
		/*
		 * 90-100 a학점
		 * 80-89 b학점
		 * 70-79 c학점
		 * 60-69 d학점
		 * 60점 미만 f학점
		 * 60점 미만 또는 사용할 수 없는 점수면 반복문 탈출
		 * (while/조건문)
		 */
		
		boolean isRun = true;
		
		while(isRun) {
			System.out.println("성적을 입력해주세요.");
			int score = sc.nextInt();
			char grade = 'f';
			if(score <= 100 && score >= 90) {
				grade='a';
			}else if(score <= 89 && score >= 80) {
				grade='b';
			}else if(score <= 79 && score >= 70) {
				grade='c';
			}else if(score <= 69 && score >= 60) {
				grade='d';
			}else {
				grade='f';
				isRun = false;

			}
			
			System.out.printf("%c 학점입니다.\n",grade);
	
		} // end while
				
		
		
	} // end main
	

}
