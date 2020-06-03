package quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {

		//1.입력받은 정수까지 3의 배수 이거나, 4의 배수 일 경우만 출력
		//2.입력받은 정수까지의 6의 배수 합을 구하라
		//3.1~100까지 정수 중 4의 배수이면서 8의 배수가 아닌 수의 개수
		//4.1000의 약수의 개수를 구하시오
		
		System.out.println("----------< 1번문제 >----------");
		//1.입력받은 정수까지 3의 배수 이거나, 4의 배수 일 경우만 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요>");
		int num1 = sc.nextInt();
		
		int a = 1;
		while(num1 >= a) {
			
			if(a % 3 == 0 || a % 4 == 0) {
				System.out.print(a + " ");
			}
			
			
			a++;
		}
		
		
		
		
		
		System.out.println("----------< 2번문제 >----------");
		//2.입력받은 정수까지의 6의 배수 합을 구하라
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요>");
		int num2 = scan.nextInt();
		
		int i = 1;
		int total = 0;
		while(num2 >= (i*6)) {
			total += (i*6);
			i++;
		}
		
		System.out.println(num2 + "까지의 6의 배수 합: " + total);
		
		
		
		
		
		System.out.println("----------< 3번문제 >----------");
		//3.1~100까지 정수 중 4의 배수이면서 8의 배수가 아닌 수의 개수
		int j = 1;
		int total2 = 0;
		while(j <= 100) {
			
			if(j % 4 == 0 && j % 8 != 0) {
				total2++;
			}
			
			j++;
		}
		System.out.println("1~100까지 정수 중 4의 배수이면서 8의 배수가 아닌 수의 개수: " + total2);
		
		
		
		
		
		
		System.out.println("----------< 4번문제 >----------");
		//4.1000의 약수의 개수를 구하시오
		
		int b = 1;
		int total3 = 0;
		while(1000 >= b) {
			
			if(1000 % b == 0) {
				total3++;
			}
			b++;
		}
		System.out.println("1000의 약수의 개수:" + total3);
		
		
	}

}
