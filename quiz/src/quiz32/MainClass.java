package quiz32;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Student> list = new ArrayList<>();
		InterPoint point = new Point();
		
		
		start: while(true) {
			//1.인터페이스 메뉴를 호출
			InterPoint.menuInfo();
			System.out.print("메뉴입력>");
			String menu = sc.next();
			
			switch(menu) {
			case "1":
				point.input(list);
				
				break;
			case "2":
				point.showAll(list);
				break;
			case "3":
				point.search(list);
				break;
			case "4":
				point.modify(list);
				break;
			case "5":
				point.delete(list);
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
