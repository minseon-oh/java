package day04;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
		
		//정수를 받아서 해당 정수가 소수인지 판별하라.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("정수입력>");
		int num = sc.nextInt();
		
		int count = 0;
		for(int i=1; i<=num; i++) {
			
			if(num % i == 0) {
				count++;
			}
			
		}
		System.out.println(count == 2 ? num + "는 소수" : num + "는 소수가 아닙니다.");
		
		
		
		
	}

}
