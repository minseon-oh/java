package quiz28;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		/*
		 * 스캐너를 통해 id입력받는다.
		 * 아이디는 공백을 포함하여 받을 수 있다.
		 * 단, 공백을 제거한 아이디가 5글자 미만이면 다시 입력
		 * 		5글자 이상이면 id가 등록되었습니다 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("ID>");
			String id = sc.next();
			id = id.replace(" ", "");
			if(id.length() < 5) {
				System.out.println("5글자 이상으로 다시 입력하세요.");
			}else {
				System.out.println("id가 등록되었습니다.");
				break;
			}
		}
		

	}

}
