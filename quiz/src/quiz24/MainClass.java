package quiz24;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
//		List list = new List();
//		list.insert("공책");
//		list.insert("필통");
//		list.insert("지갑");
//		list.insert("파우치");
//		list.print();
//		list.search("필통");
//		list.search("지우개");
//		list.delete("필통");
//		list.print();
		
		Scanner sc = new Scanner(System.in);
		IBag bag = new List();
		
		while(true) {
			System.out.println("----------메뉴----------");
			System.out.println("1)추가 2)출력 3)검색 4)삭제");
			System.out.print(">");
			String menu = sc.next();
			
			switch(menu) {
			case "1":
				System.out.println("추가할 아이템");
				System.out.print(">");
				String item = sc.next();
				bag.insert(item);
				break;
			case "2":
				System.out.println("아이템>");
				bag.print();
				break;
			case "3":
				System.out.println("찾을 아이템");
				System.out.print(">");
				String find = sc.next();
				int index = bag.search(find);
				System.out.println(index + "번째 있습니다.");
				break;
			case "4":
				System.out.println("삭제할 아이템");
				System.out.print(">");
				String del = sc.next();
				boolean bool = bag.delete(del);
				System.out.println("삭제여부: " + bool);
				break;
			default:
				break;
				
			}
			
		}
		
	}
	

}
