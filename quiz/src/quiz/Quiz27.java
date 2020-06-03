package quiz;

public class Quiz27 {

	public static void main(String[] args) {
		// 2단~ 9단 구구단출력1
		
		for(int i=2; i<=9; i++) {
			
			System.out.println("구구단" + i + "단");
			for(int j=1; j<=9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
			System.out.println("---------------");
		}

	}

}
