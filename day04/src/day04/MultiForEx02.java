package day04;

public class MultiForEx02 {

	public static void main(String[] args) {
		// 조건이 바뀌는 for문
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		int star = 5;
		for(int i=0; i<star; i++) { //행을 나타내는 for문
			
			for(int j=0; j<i+1; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		//반대로
		
		for(int i=0; i<star; i++) {
			
			for(int j=0; j<star-i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------");
		
		for(int i=0; i<star; i++) { //행의 수
			
			for(int a=0; a<star-1-i; a++) { //공백
				System.out.print("   ");
			}
			for(int b=0; b<2*i+1; b++) { //별 출력
				System.out.print("★");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
