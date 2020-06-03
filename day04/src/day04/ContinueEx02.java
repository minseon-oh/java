package day04;

import java.util.Scanner;

public class ContinueEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수>");
		int n = sc.nextInt();
		
		int total = 0;
		int count = 0;
		
		start: for(int i=2; i<=n; i++) {
			
			count = 0;
			for(int j=1; j<=i; j++) {
				if(i % j == 0) {
					count++;
				}
				if(count > 2) {
					continue start;
				}
			}
			
			if(count == 2) {
				total += i;
			}
			
		}
		System.out.println(n + "까지 소수의 합은: " + total);
		
		
		
		
		
		
		
		
		
		
	}

}
