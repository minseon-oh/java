package quiz;

import java.util.Scanner;

public class Quiz33 {

	public static void main(String[] args) {
		/*
		 * UP DOWN GAME
		 * 
		 * 1~100 까지의 임의 숫자를 생성
		 * 스캐너를 통해 값을 입력받음
		 * 랜덤수가 입력받은 값보다 작으면 "더 작은 수를 입력하세요"
		 * 랜덤수가 입력받은 값보다 크면 "더 큰수를 입력하세요"
		 * 
		 * 정답이면 시도횟수: X회를 출력하고 종료.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int r = (int)(Math.random()*100) + 1;
		
		System.out.println("*****UP DOWN GAME*****");
		
		int count = 0;
		while(true) {
			
			System.out.print("정수를 입력하세요>");
			int num = sc.nextInt();
			
			count++;
			
			if(num == r) {
				System.out.println("시도횟수: " + count);
				break;
			}else if(num < r) {
				System.out.println("더 큰 수를 입력하세요");
			}else {
				System.out.println("더 작은 수를 입력하세요");
			}

		}
		
	}

}
