package quiz;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		// switch quiz07
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구입할 메뉴를 입력하세요");
		System.out.println("[수박, 사과, 멜론, 포도, 귤]");
		System.out.print(">");
		String fruit = sc.next();
		
		switch(fruit) {
		
		case "수박":
			System.out.println("수박의 가격은 1만원 입니다");
			break;
		case "사과":
			System.out.println("사과의 가격은 5천원 입니다");
			break;
		case "멜론":
			System.out.println("멜론의 가격은 1만5천원 입니다");
			break;
		case "포도":
			System.out.println("포도의 가격은 8천원 입니다");
			break;
		case "귤":
			System.out.println("귤의 가격은 3천원 입니다");
			break;
		default:
			System.out.println(fruit + "은(는) 메뉴에 없습니다");
			System.out.println("다시 입력해주세요");
		
		}
		
		
	}

}
