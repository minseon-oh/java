package quiz;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요>");
		int num = sc.nextInt();
		
		System.out.println("구구단: " + num);
		
		int i = 2;
		while(i <= 9) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
			i++;
		}
		
		
		
		

	}

}
