package array;

/**
 * 배열의 기본타입과 참조타입의 항목이 저장된 배열 확인
 */
public class ArrayRefExample {

	public static void main(String[] args) {
	
		// 배열 선언과 동시에 초기화
		int[] scores = {70,60,50,40,60,60};
		System.out.println(scores);
		
		int[] scores2 = scores;
		// [70][60][50][40][60][60]
		scores[0] = 80;
		// [80][60][50][40][60][60]
		System.out.println(scores[0]);
		System.out.println(scores2[0]);
		System.out.println(scores2);
		System.out.println(scores == scores2);
		
		int a = 10;
		int b = a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		
		b = 20;
		System.out.println(a);
		System.out.println(b);
		
		// 알파벳은 26자
		char chars[] = new char[26];
		char c = 'A'; // 65 'a' == 97
		for(int i = 0; i < chars.length; i++, c++) {
			chars[i] =c;
		}
		for(int i = 0; i < chars.length; i++) {
		System.out.print(chars[i]+" ");
		}
		System.out.println();
		
		
		// 향상된 for문
		for(char ch : chars) {
			System.out.print("["+ch+"]");
		}
		System.out.println();
		
		// 실수 
		double[] doubles = new double[3];
		doubles[1] = 3.141592;
		for(double d : doubles) {
			System.out.println(d);
		}
		
		// 논리 타입
		boolean[] tasks = new boolean[5];
		for(boolean bool : tasks) {
			System.out.println(bool);
		}
		
		// 참조 타입
		String[] strs = new String[3];
		strs[1] = "java";
		for(String s : strs) {
			System.out.println(s);
		}
		System.out.println(strs);
		
		int[] arrays[] = new int[3][];
		// [null] [null] [null]
		arrays[0] = new int[4]; // [0][0][0][0]
								//  0  1  2  3
		arrays[1] = new int[3];
		arrays[2] = new int[3];
		int num = arrays[0][0];
		/*
		 * arrays[0] [0][1][2][3]
		 * arrays[1] [0][1][2]
		 * arrays[2] [0][1][2]
		 */
		
		int[][] arrays2 = new int [2][3];
		// [0][1]
		// arrays2[0] [0][0][0]
		// arrays2[1] [0][0][0]
		
		int arrays3 [][] = new int [3][2];		
		
		int[][] scoresA = new int[][] {
			{10,20,30},
			{70,80,90,100}
		};
		
		
		System.out.println(scoresA.length);
		System.out.println(scoresA[0].length);
		System.out.println(scoresA[1].length);

		for(int i = 0; i < scoresA[0].length; i++) {
			System.out.print(scoresA[0][i]+" ");
		}
		
		for(int i = 0; i < scoresA[1].length; i++) {
			System.out.print(scoresA[1][i]+" ");
		}
		System.out.println();
		System.out.println(scoresA);
		for(int i = 0; i <scoresA.length; i++) {
			System.out.print(scoresA[i] + " ");
			for(int j = 0; j <scoresA[i].length; j++) {
				System.out.print(scoresA[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int[] arr : scoresA) {
			System.out.print(arr+" ");
			for(int i : arr) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
		
	}
	
}
