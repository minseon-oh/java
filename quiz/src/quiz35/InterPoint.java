package quiz35;

import java.util.Set;

public interface InterPoint {
	
	public void input(Set<Person> person); // 대여
	public void showAll(Set<Person> person); // 출력
	public void delete(Set<Person> person); //반납
	
	public static void menuInfo() {

		System.out.println("\n*** 성적관리 프로그램 ***");
		System.out.println("# 1. 회원등록");
		System.out.println("# 2. 도서대여");
		System.out.println("# 3. 도서반납");
		System.out.println("# 4. 대여한 목록 조회");
		System.out.println("*********************");
	}

}
