package quiz;

import java.util.Scanner;

public class Quiz32 {

	public static void main(String[] args) {
		// (break)Quiz15 p.17
		
		Scanner sc = new Scanner(System.in);
		
		
//		int a = 0; //정답
//		int b = 0; //오답
//		while(true) {
//			
//			int r1 = (int)(Math.random()*100) + 1;
//			int r2 = (int)(Math.random()*100) + 1;
//			
//			System.out.println("*****<덧샘 문제>*****");
//			System.out.println(r1 + " + " + r2 + " = ?");
//			System.out.println("[문제를 그만 풀려면 0을 입력하세요]");
//			System.out.print(">");
//			int num = sc.nextInt();
//			
//			if(num == 0) {
//				System.out.println("프로그램을 종료합니다.");
//				System.out.println("--------------------");
//				System.out.println("정답횟수: " + a);
//				System.out.println("오답횟수: " + b);
//				break;
//			}else if(num == (r1 + r2)) {
//				a++;
//				System.out.println("정답입니다!");
//				System.out.println("--------------------");
//			}else {
//				b++;
//				System.out.println("오답입니다!");
//				System.out.println("--------------------");
//			}
//		}
		
		// (break)Quiz15-1 p.18
		
		int a = 0; //정답
		int b = 0; //오답

		while(true) {
			
			int r1 = (int)(Math.random()*100) + 1;
			int r2 = (int)(Math.random()*100) + 1;
			int c = (int)(Math.random()*2);
			
			System.out.println("*****<산수 문제>*****");
			System.out.println(r1 + (c==0? " + " : " - ") + r2 + " = ?");
			System.out.println("[문제를 그만 풀려면 0을 입력하세요]");
			System.out.print(">");
			int num = sc.nextInt();
			
			if(num == 0) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println("--------------------");
				System.out.println("정답횟수: " + a);
				System.out.println("오답횟수: " + b);
				break;
			}else if(c == 0? num == (r1 + r2) : num == (r1 - r2)) {
				a++;
				System.out.println("정답입니다!");
				System.out.println("--------------------");
			}else {
				b++;
				System.out.println("오답입니다!");
				System.out.println("--------------------");
			}
		}
	}

}
