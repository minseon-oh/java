package quiz25;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 스캐너를 통해서 정수2개를 입력받는다.
		 * 입력받은 값이 정수라면 단순히 정수의 합을 출력하고 반복문을 종료하세요.
		 * 입력받은 값이 에러를 발생시키는 값이라면 "정수로만 입력하세요" 출력 후 다시 입력받는다.
		 * 반복문을 탈출하면 프로그램 정상종료 문장 띄우기.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			try {
				System.out.println("정수를 2개 입력하세요");
				System.out.print(">");
				int n1 = sc.nextInt();
				System.out.print(">");
				int n2 = sc.nextInt();
				System.out.println("정수의 합은: " + (n1+n2));
				break;
			} catch (Exception e) {
				System.out.println("정수로만 입력하세요");
				sc.nextLine();
			}
			
		}
		System.out.println("프로그램 정상종료");
		

	}

}
