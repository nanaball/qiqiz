
public class Practice06gugudan {
	
	public static void main(String[] args) {
		
		
		/*
		 * 구구단 9단부터 공백은 \t 이스케이프 문자 사용
		 */
		
		int mul = 0;	
		for(int i = 9; i > 0; i--) {
			for(int j = 9; j > 0; j--) {
				System.out.print(i+ " ");
				System.out.print(j+ " ");
				mul = (i*j);
				System.out.println(mul);
				
				System.out.printf(i+" * "+j+" = "+(i*j)+"\t");

			}
			System.out.println();
			System.out.println("==============================");
						
		}
		
		
		
		
		
		
		for(int i = 9; i > 1; i--) {
		System.out.print(9+" * "+i+" = "+ (9*i)+"\t");	
		}
		System.out.println();

		for(int i = 9; i > 1; i--) {
			System.out.print(8+" * "+i+" = "+ (8*i)+"\t");	
		}
		System.out.println();
		System.out.println("==============================");
		
		for(int j = 9; j > 1; j--) {
			for(int i = 9; i > 1; i--) {
				System.out.print(j+" * "+i+" = "+ (j*i)+"\t");	
			}
			System.out.println();
		}
			
		System.out.println("===================================");
		for(int i = 2; i < 10; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %2d\t", i, j, (i*j));
			}
			System.out.println();
		}
		
		
	}

} 
