package quiz31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArryaListQuiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<User> list = new ArrayList<>();
		
		while(true){
			System.out.println("[1.등록 | 2.회원정보보기 | 3.회원정보검색 | 4.회원정보삭제 | 5.종료]");
			System.out.print("메뉴입력>");
			int num = sc.nextInt();
			
			if(num == 1) {
				//스캐너로 이름나이 입력받고 User에 저장, 리스트에 추가
				System.out.print("이름>");
				String name = sc.next();
				System.out.print("나이>");
				int age = sc.nextInt();
				
				User u = new User(name, age);
				list.add(u);
				
			}else if(num == 2) {
				//list에 길이만큼 회전하며 User객체의 이름, 나이를 순서대로 출력
				for(User u : list) {
					System.out.println("이름:" + u.getName() + ", 나이:" + u.getAge());
				}
			}else if(num == 3) {
				//찾을 이름을 입력받는다. 있다면 출력
				//없다면 목록에없음 출력
				System.out.print("찾을 회원의 이름을 입력하세요>");
				String name = sc.next();
				for(int i=0; i<list.size(); i++){
					if(list.get(i).getName().equals(name)) {
						User u = list.get(i);
						System.out.println("이름:" + u.getName() + ", 나이:" + u.getAge());
						break;
					}else if(i == list.size()-1) {
						System.out.println("없는 회원입니다");
					}
				}
			}else if(num == 4) {
				//삭제할 이름 받아서 동일하다면 객체삭제
				System.out.print("삭제할 회원의 이름을 입력하세요>");
				String name = sc.next();
				for(int i=0; i<list.size(); i++){
					if(list.get(i).getName().equals(name)) {
						list.remove(i);
						break;
					}
				}
			}else if(num == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("다시 입력하세요");
			}
			
		}

	}

}
