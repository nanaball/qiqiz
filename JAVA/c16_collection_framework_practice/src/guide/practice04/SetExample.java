package guide.practice04;

import java.util.Scanner;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 코드 작성

		TreeSet<Integer> treeSet = new TreeSet<>();
		System.out.println("정수 (-1이 입력될 때까지) >> ");


		while (true) {

			int num = sc.nextInt();
			treeSet.add(num);

			if (num != -1) {
				continue;
			} else {
				System.out.println("수가 하나도 없음");
				System.out.println("시스템 종료");
				break;
			} // end if
			
			
			
		} // end while
		
		int max = treeSet.last();
		System.out.println(treeSet);
		System.out.println("가장 큰 수는 " + max);
		sc.close();
		
	} // end main

}
