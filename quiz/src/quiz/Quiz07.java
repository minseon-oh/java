package quiz;

import java.util.Scanner;

public class Quiz07 {
	
	public static void main(String[] args) {
		//퀴즈05
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력하세요");
		System.out.print("> ");
		int num1 = sc.nextInt();
		System.out.print("> ");
		int num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("같은 수 입니다");
		}else if(num1 > num2) {
			System.out.println(num1 + "이(가) 큰 수 입니다");
		}else{
			System.out.println(num2 + "이(가) 큰 수 입니다");
		}
		
		sc.close();
	}

}
