package quiz31;

import java.util.List;
import java.util.ArrayList;


public class ArrayListQuiz02 {

	public static void main(String[] args) {
		/*
		 * 1.User클래스는 은닉된 변수로 name, age를 선언
		 *   user클래스의 생성자도 선언
		 * 2.user클래스를 저장할 수 있는 ArrayList선언
		 * 3.User객체를 2개 생성해서 리스트에 추가
		 * 4.list에 저장된 모든 이름, 나이를 향상된 for문으로 출력.
		 * 5.list에 "홍길자"가 있다면 홍길자의 이름과 나이만 출력. for문으로.
		 * 6.list에 홍길동이 있다면 객체삭제.
		 */
		
		List<User> list = new ArrayList<>();
		User u1 = new User("홍길자", 20);
		User u2 = new User("홍길동", 30);
		User u3 = new User("홍", 30);
		
		list.add(u1);
		list.add(u2);
		list.add(u3);
		System.out.println(list.toString());
		
		for(User u : list) {		
			System.out.println(u.getName() + u.getAge());
		}
		
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getName().equals("홍길자")) {
				User user = list.get(i);
				System.out.println(user.getName() + user.getAge());
			}
			if(list.get(i).getName().equals("홍길동")) {
				list.remove(i);
			}
		}
		
		System.out.println(list.toString());
	}

}
