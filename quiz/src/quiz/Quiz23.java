package quiz;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		// 1. 7~100 중에 7의 배수를 가로로 출력
		// 2. 1~100 중에 12의 배수를 가로로 출력
		// 3. 1~200 중에 9의 배수의 개수 출력
		// 4. 50~100 두 수 사이의 합
		// 5. A~Z 출력
		// 6. 입력받은 정수까지 팩토리얼 값을 구하세요 팩토리얼) 5! = 5x4x3x2x1
		
		System.out.println("----------<1번문제>----------");
		// 1. 7~100 중에 7의 배수를 가로로 출력
		
		for(int i=7; i<=100; i++) {			
			if(i % 7 == 0) System.out.print(i + " ");	
		}
		
		System.out.println();// 줄바꿈의 의미
		
		for(int i=7; i<=100; i+=7) {			
			System.out.print(i + " ");	
		}
		
		
		
		
		System.out.println("\n----------<2번문제>----------");
		// 2. 1~100 중에 12의 배수를 가로로 출력
		
		for(int i=1; i<=100; i++) {			
			if(i % 12 == 0) 
				System.out.print(i + " ");	
		}
		
		
		
		
		System.out.println("\n----------<3번문제>----------");
		// 3. 1~200 중에 9의 배수의 개수 출력
		
		int count = 0;
		for(int i=1; i<=200; i++) {			
			if(i % 9 == 0) 
				count++;
		}
		System.out.println("1~200 중 9의 배수 개수: " + count);
		
		
		
		
		System.out.println("----------<4번문제>----------");
		// 4. 50~100 두 수 사이의 합
		
		int total = 0;
		for(int i=50; i<=100; i++) {
			total += i;
		}
		System.out.println("50~100 두 수 사이의 합: " + total);
		
		
		
		
		System.out.println("----------<5번문제>----------");
		// 5. A~Z 출력
		
		for(char c='A'; c<='Z'; c++){
			System.out.print(c +" ");
		}
		
		
		
		
		System.out.println("\n----------<6번문제>----------");
		// 6. 입력받은 정수까지 팩토리얼 값을 구하세요 팩토리얼) 5! = 5x4x3x2x1
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요>");
		int num = sc.nextInt();
		System.out.print(num + "! = ");
		
		int total2 = 1;
		for(int i=1; i<=num; i++) {
			total2 *= num;
		}
		System.out.println(total2);
		
		
		
		
	}

}
