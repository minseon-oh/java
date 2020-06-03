package quiz4;

import java.util.List;
import java.util.Set;

public interface Inter {
	
	public void signUp(List<Member> list);
	public void showAll(List<Member> list);
	public void search(List<Member> list);
	public void password(List<Member> list);
	
	public static void menuInfo() {

		System.out.println("==== 회원 관리 프로그램 ====");
		System.out.println(" 1) 회원 등록");
		System.out.println(" 2) 모든 회원정보 확인");
		System.out.println(" 3) 회원 검색 ");
		System.out.println(" 4) 비밀번호 찾기 ");
		System.out.println(" 5) 프로그램 종료 ");
		System.out.println("=====================");
	}

}
