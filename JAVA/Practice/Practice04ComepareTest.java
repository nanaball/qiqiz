import java.util.Scanner;

public class Practice04ComepareTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 정수 두개를 입력받아 max(큰수 찾기)
		System.out.println("첫번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.println("두번째 정수 입력 : ");
		int second = sc.nextInt();
		
		if(first > second) {
			System.out.println("큰 수는 : " + first);
		}else {
			System.out.println("큰 수는 : " + second);
		}
		
		int max = 0;
		if(first > second ) {
			max = first;
		}else {
			max = second;
		}
		System.out.println("큰수는 : " + max);
		
		// 삼항 연산자
		max = (first > second) ? first : second;
		System.out.println("큰 수는(삼항연산자) : " + max);
		
		
		
		
		
	}

}
