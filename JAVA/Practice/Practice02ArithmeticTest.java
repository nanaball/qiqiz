import java.util.Scanner;

public class Practice02ArithmeticTest {
	
	public static void main(String[] args) {
		// 원의 면적을 구하시오.
		// 반지름 * 반지름 * 원주율
		// 원주율은 3.14
		
		double radius, area;
		System.out.print("반지름을 입력해주세용 > ");
		
		Scanner sc = new Scanner(System.in);
		radius = sc.nextDouble();
		// 원주율 
		double pi = 3.14;
		// 원의 면적
		area = radius * radius * pi;
		System.out.println(area);
		System.out.printf("반지름이 %f인 원의 면적은 : %.1f %n" ,radius,area);

		
		
		// 반복문을 이용하여 1-10까지의 합을 구해서 출력하는 코드를 작성하시오 (print/println)
		
		System.out.println();
		System.out.println("- 결과");
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.print(i+" ");
			sum = sum + i;
			
		}
		
		System.out.println("\n합 : " + sum);

		
	}

}
