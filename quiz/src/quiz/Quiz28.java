package quiz;

public class Quiz28 {

	public static void main(String[] args) {
		//1단~9단 구구단출력2
		
		for(int i=1; i<=9; i+=3) {
			
			for(int j=1; j<=9; j++) {
				System.out.printf("%d x %d = %d\t %d x %d = %d\t %d x %d = %d\t"
									, i , j, i*j, i+1 , j, (i+1)*j, i+2 , j, (i+2)*j);
				System.out.println();

			}
			System.out.println();
		}
		
		
	}

}
