package quiz25;

import java.util.Scanner;

public class MainClass2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			int r = (int)(Math.random()*100 + 1);
			try {
				System.out.print("1~100 사이의 값을 입력하세요>");
				int n = sc.nextInt();
				if(n == r) {
					count++;
					System.out.println("정답입니다");
					System.out.println("시도횟수: " + count);
					break;
				}else if(n < r) {
					System.out.println("더 큰 수를 입력하세요");
					count++;
				}else if(n > r) {
					System.out.println("더 작은 수를 입력하세요");
					count++;
				}
				
			} catch (Exception e) {
				System.out.println("잘 못 입력하였습니다. 숫자를 입력하세요.");
				sc.nextLine();
			}
			
			
		}
		
		
	}

}
