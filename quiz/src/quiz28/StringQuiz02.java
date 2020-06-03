package quiz28;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {
		/*
		 * 주민번호 13자리 입력받는다.
		 * 주민번호는 -를 포함하여 받을 수 있다
		 * 13자리가 아니라면 다시 입력받는다
		 * 남자인지 여자인지 구분하여 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("주민번호>");
			String num = sc.next();
			num = num.replace("-", "");
			
			try {
				
				Long.parseLong(num);
				
				if(num.length() == 13) {
					
					char c = num.charAt(6);
					
					if(c == '1' || c == '3') {
						System.out.println("남자");
						break;
					}else if(c == '2' || c == '4') {
						System.out.println("여자");
						break;
					}
				}else {
					System.out.println("다시 입력하세요");
				}
				
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요");
			}
		}
		sc.close();
	}

}
