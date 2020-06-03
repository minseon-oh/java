package quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		// 1부터 입력받은 수 까지의 약수들의 합을 구하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요>");
		int num = sc.nextInt();
		
		int total = 0;
		int i = 1;
		
		while(num >= i ) {
			int j = 1;
			
			while(i >= j) {
				
				if(i % j == 0) {
					total += j;
				}
				
				j++;
			}
			
			i++;
			
		}
		
		System.out.println("1부터 입력받은 수 까지의 약수들의 합: " + total);
		

	}

}
