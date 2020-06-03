package fitness;

import java.util.List;
import java.util.Scanner;

public interface Fitness01 {
	
	Scanner sc = new Scanner (System.in);
	
	String url = "JDBC:oracle:thin:@localhost:1521/XEPDB1";
	String uid = "TEST01";
	String upw = "test01";
	
	public void showPointUI();
	public void input();
	public void showAll();
	public void search();
	public void modify();
	public void delete();
	
	public static void menuInfo() {

		System.out.println("\n*** 헬스 프로그램 ***");
		System.out.println("# 1. 등록");
		System.out.println("# 2. 전체조회");
		System.out.println("# 3. 검색");
		System.out.println("# 4. 수정");
		System.out.println("# 5. 삭제");
		System.out.println("# 6. 프로그램 종료");
		System.out.println("*********************");
	}

}
