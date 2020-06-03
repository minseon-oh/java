package quiz27;

import java.util.Scanner;

public class Calculator {
	
//	static Scanner sc = new Scanner(System.in);
//	
//	public int input() throws Exception{
//		/*
//		 * 정수 2개를 받는다.
//		 * 입력된 값이 정수라면 합계를 반환
//		 * 예외가 발생할 수 있는 상황이라면 메서드를 종료하고 예외 메시지 전달.
//		 * sc.close() 적절하게 처리.
//		 */
//		System.out.print("정수1>");
//		int n1 = sc.nextInt();
//		System.out.print("정수2>");
//		int n2 = sc.nextInt();
//		
//		return n1+n2;
//	}
//	
//	public static void main(String[] args) {
//		
//		Calculator c = new Calculator();
//		try {
//			System.out.println(c.input());
//		} catch (Exception e) {
//			System.out.println("예외가 발생하였습니다.");
//		}finally{
//			sc.close();
//		}
//	}
	
	public int input() throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("정수1>");
			int n1 = sc.nextInt();
			System.out.print("정수2>");
			int n2 = sc.nextInt();
			return n1+n2;
		} catch (Exception e) {
			throw new Exception("숫자값을 입력하세요");
		}finally {
			sc.close();
		}
		
	}

}
