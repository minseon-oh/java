package fitness;

import java.util.Scanner;

import fitness.Fitness01;
import fitness.Members;

public class JDBC요구사항 {

	public static void main(String[] args) {
		/*
		 * 회원관리프로그램, 도서관리, 음악관리 , 데이터관리 등 아무주제선택해서
		 * JDBC프로그램작성
		 * 
		 * 단, 테이블은 5개 이상 관계형 데이터베이스 설계
		 * 인터페이스 반드시 사용
		 * 
		 * ArrayList or Map 꼭 하나 이상 사용
		 * 
		 * 메서드는 8개 이상 짝궁과 협업
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		Members m = new Members();
		
		start: while(true) {

			Fitness01.menuInfo();
			System.out.print("메뉴입력>");
			String menu = sc.next();
			
			switch(menu) {
			case "1":
				m.input();
				break;
			case "2":
				m.showAll();
				break;
			case "3":
				m.search();
				break;
			case "4":
				m.modify();
				break;
			case "5":
				m.delete();
				break;
			case "6":
				System.out.println("프로그램을 종료합니다.");
				break start;
			default:
				System.out.println("메뉴를 잘못입력했습니다.");
				break;
			}
			
		}
		
		
		
		
		
		
		
	}

}
