package practice_01_03;


public class Practice_03 {

	public static void main(String[] args) {
		// code 작성
		
		int[] numbers = new int[10];
		
		System.out.print("최초의 리스트 : ");
		for(int i = 0; i < numbers.length; i++) {
			// 난수 삽입 및 출력
			numbers[i] = (int)(Math.random() * 100) + 1;
			System.out.print(numbers[i]+" ");
			
			for(int j = 0; j < i; j++) {
				if(numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			} // 정렬
		
		} // end for
				
		// 정렬된 리스트 출력
		System.out.println();
		System.out.print("정렬된 리스트 : ");
		for(int i : numbers) {
			System.out.print(i + " ");
		}
	} // end main
} // end class
