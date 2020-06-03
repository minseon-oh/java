package quiz;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		
		/*
		 * 정수 3개를 입력받는다
		 * 가장 큰값, 가장 작은 값, 중간값을 구해서 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요");
		System.out.print("> ");
		int n1 = sc.nextInt();
		System.out.print("> ");
		int n2 = sc.nextInt();
		System.out.print("> ");
		int n3 = sc.nextInt();
		
		int max = 0;
		int mid = 0;
		int min = 0;
		
		if(n1 > n2 && n1 > n3) { //n1이 가장 큰 경우
			max = n1;
			if(n2 > n3) {
				mid = n2;
				min = n3;
			}else {
				mid = n3;
				min = n2;
			}
			
		}else if(n2 > n1 && n2 > n3) {//n2가 가장 큰 경우
			
			max = n2;
			if(n1 > n3) {
				mid = n1;
				min = n3;
			}else {
				mid = n3;
				min = n1;
			}
			
		}else {//n3가 가장 큰 경우
			
			max = n3;
			if(n1 > n2) {
				mid = n1;
				min = n2;
			}else {
				mid = n2;
				min = n1;
			}
			
		}
		
		System.out.println("max: " + max);
		System.out.println("mid: " + mid);
		System.out.println("min: " + min);
		
		
		
		
		}
		
		
	}


