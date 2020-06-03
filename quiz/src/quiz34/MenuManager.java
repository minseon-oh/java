package quiz34;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MenuManager {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		
		//맵을 이용하는데 키값은 메뉴, 벨류는 가격
		start: while(true) {
			System.out.println("-----음식 메뉴 관리-----");
			System.out.println("1. 신규메뉴등록"); //이미 등록된 메뉴인지 확인 후 메뉴등록
			System.out.println("2. 메뉴판 전체보기"); //메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정"); //변경할 메뉴를 받아서 메뉴가 있다면 가격수정
			System.out.println("4. 메뉴판 삭제"); //메뉴를 받아서 있다면 삭제
			System.out.println("5. 프로그램 종료");
			
			System.out.print("메뉴입력>");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("===신규 메뉴 등록===");
				System.out.print("메뉴이름>");
				String k = sc.next();
				if(map.containsKey(k)) {
					System.out.println("이미 등록된 메뉴입니다");
				}else {
					System.out.print("메뉴가격>");
					int v = sc.nextInt();
					map.put(k, v);
				}
				break;
				
			case 2:
				System.out.println("===메뉴판 전체보기===");
				Set<Entry<String, Integer>> entry = map.entrySet();
				for(Entry<String, Integer> e : entry) {
					System.out.println(e.getKey() + ":" + e.getValue() + "원");
				}
				break;
			case 3:
				System.out.println("===메뉴판 수정===");
				System.out.print("수정할 메뉴이름>");
				k = sc.next();
				if(map.containsKey(k)) {
					System.out.print("수정할 가격>");
					int v = sc.nextInt();
					map.put(k, v);
				}else {
					System.out.println("없는 메뉴입니다");
				}

				break;
			case 4:
				System.out.println("===메뉴판 삭제===");
				System.out.print("삭제할 메뉴이름>");
				k = sc.next();
				if(map.containsKey(k)) {
					map.remove(k);
					System.out.println(k + "메뉴가 삭제되었습니다");
				}else {
					System.out.println("없는 메뉴입니다");
				}
				break;
			case 5:
				System.out.println("===프로그램 종료===");
				break start;
			default:
				System.out.println("잘못 입력하였습니다");
				break;
			}
		}
		
		
	}

}
