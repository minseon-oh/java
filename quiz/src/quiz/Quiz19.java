package quiz;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int total = 0;
		while(i != 0) {
			
			System.out.print("정수입력>");
			i = sc.nextInt();
			total += i;
			
		}
		
		System.out.println("입력한 정수의 핪: " + total);
		
		sc.close();

	}

}
