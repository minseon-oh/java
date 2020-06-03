package quiz;

import java.util.Scanner;

public class Quiz24 {

	public static void main(String[] args) {
		// 두 정수를 입력받는다
		// 두 수의 크기는 정해지지 않았다
		// 두 수 사이의 합을 구하는 코드를 최대한 간략하게 작성하여라
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요>");
		int num1 = sc.nextInt();
		System.out.print("정수를 입력하세요>");
		int num2 = sc.nextInt();

		
		int total = 0;
		if(num1 == num2) {
			total = 0;
		}else if(num1 < num2) {
			for(int i=num1; i<=num2; i++) {
				total += i;
			}
		}else {
			for(int i=num2; i<=num1; i++) {
				total += i;
			}
		}
		System.out.println(total);
		


		

	}

}
