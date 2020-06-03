package day04;

import java.util.Scanner;

public class BreakEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("4 x 6 = ?");
			System.out.println(">");
			int num = sc.nextInt();
			
			if(num == 24) {
				System.out.println("정답");
				break;
			}else {
				System.out.println("오답");
			}
			
		}
		sc.close();
	}

}
