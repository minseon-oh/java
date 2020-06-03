package quiz35;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 1.List, Set, Map을 이용하여 간단한 관리프로그램 정한다.
		 * (도서관리, 회원관리, 예약관리, 물품관리 등)
		 * 
		 * 2.인터페이스를 반드시 하나 이상 사용한다.
		 * 3.기능은 3개이상 생성.
		 * 4.클래스를 사용.
		 * 
		 * 도서관리 (추가 반납 검색)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Set<Person> person = new HashSet<>();
		Book book = new Book();
		
		start: while(true) {
			InterPoint.menuInfo();
			System.out.print("MENU>");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				book.info(person);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default :
				System.out.println("프로그램종료");
				break start;
			
			}
		}
		
		




	}

}
