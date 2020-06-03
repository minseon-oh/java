package quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1>");
		int num1 = sc.nextInt();
		System.out.print("연산을 선택하세요[+, -, *, /]>");
		String s = sc.next();
		System.out.print("정수2>");
		int num2 = sc.nextInt();
		
		switch(s) {
		
		case "+":
			num1 += num2;
			System.out.println("두 수의 덧셈 값은: " + num1);
			break;
		case "-":
			num1 -= num2;
			System.out.println("두 수의 뺄셈 값은: " + num1);
			break;
		case "*":
			num1 *= num2;
			System.out.println("두 수의 곱셈 값은: " + num1);
			break;
		case "/":
			num1 /= num2;
			System.out.println("두 수의 나누기 값은: " + num1);
			break;
		default :
			System.out.println("연산을 잘못 입력하였습니다");
		
		}
		
		
	}

}
