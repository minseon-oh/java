package quiz4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		 
		[문항4] 당신은 프로그램 개발회사 ITKorea의 직원이다. 회원관리 프로그램 제작의뢰가 들어왔다.
		다음 요구사항에 따라 프로그램을 제작하고 결과를 사진 또는 zip파일로 제출해주세요.
		
		요구사항정의
		1. 프로그램 기능은 회원등록, 모든 회원정보 확인, 회원정보 검색, 비밀번호 찾기 이다
		2. 회원아이디는 고유한 아이디어야 한다.
		3. 비밀번호 찾기 방법은 최소 2가지 이상을 제시하여야 한다
		예시) 아이디로 찾기, or email로 찾기 등
		
		*/
		Scanner sc = new Scanner(System.in);
		List<Member> list = new ArrayList<Member>();
		InterMember im = new InterMember();
		w: while(true) {
			Inter.menuInfo();
			System.out.print("메뉴를 입력하세요>");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				im.signUp(list);
				break;
			case 2:
				im.showAll(list);
				break;
			case 3:
				im.search(list);
				break;
			case 4:
				im.password(list);
				break;
			case 5:
				System.out.println("==== 프로그램을 종료합니다 ====");
				break w;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			
			
			}
		}
		
	}

}
