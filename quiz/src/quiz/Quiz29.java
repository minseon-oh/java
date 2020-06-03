package quiz;

import java.util.Scanner;

public class Quiz29 {

	public static void main(String[] args) {
		// 가로, 세로를 입력받는다.
		//가로길이, 세로길이의 사각형을 출력하면됩.
		//단, 윤곽만 나타나도록 처리/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가로>");
		int n1 = sc.nextInt();
		System.out.print("세로>");
		int n2 = sc.nextInt();
		
		for(int i=1; i<=n2; i++){
			for(int a=1; a<=n1; a++) {
				if(i == 1 || i == n2 || a == 1 || a == n1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
