package quiz4;

import java.util.List;
import java.util.Scanner;

public class InterMember implements Inter{
	
	private Scanner sc = new Scanner(System.in);
	
	public void signUp(List<Member> list) { //회원등록
		Member m = new Member();
		System.out.println("==== 회원 등록 ====");
		
		System.out.print("ID>");
		String s = sc.next();
			if(!list.contains(s)) {
				System.out.print("PW>");
				String pw = sc.next();
				System.out.print("EMAIL>");
				String email = sc.next();
				m.setId(s);
				m.setPw(pw);
				m.setEmail(email);
				System.out.println("- 회원등록완료 -");
			}else {
				System.out.println("이미 등록된 ID입니다. 다시 입력하세요.");
			}
		
		list.add(m);
	}
	
	@Override
	public void showAll(List<Member> list) { //모든회원정보
		System.out.println("==== 모든 회원 정보 ====");
		int i = 1;
		for(Member m : list) {
			System.out.print(i + ") ID:" + m.getId() + " PW:" + m.getPw() + " Email:" + m.getEmail() + "\n");
			i++;
		}
		System.out.println("- 모든 회원정보 출력완료 -");
	}
	
	@Override
	public void search(List<Member> list) { //회원검색
		System.out.println("==== 회원 검색 ====");
		System.out.print("ID>");
		String s = sc.next();
		for(Member m : list) {
			if(m.getId().equals(s)) {
				System.out.println(m.getId() + "님의 정보");
				System.out.println("ID:"+m.getId()+" PW:"+m.getPw()+" Email:"+m.getEmail());
				System.out.println("- 회원정보 출력완료 -");
				return;
			}
		}
		System.out.println("없는 회원입니다.");
	}
	
	@Override
	public void password(List<Member> list) { //비밀번호찾기
		System.out.println("==== 비밀번호 찾기 ====");
		System.out.println("1) 아이디로 찾기");
		System.out.println("2) 이메일로 찾기");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.print("ID>");
			String s = sc.next();
			
			for(Member m : list) {
				if(m.getId().equals(s)) {
					System.out.println(m.getId() + "님의 비밀번호는 " + m.getPw() + "입니다");
					System.out.println("- 비밀번호 찾기완료 -");
					return;
				}
			}
			System.out.println("없는회원입니다.");
			break;
		case 2:
			System.out.print("Email>");
			s = sc.next();
			
			for(Member m : list) {
				if(m.getEmail().equals(s)) {
					System.out.println(m.getId() + "님의 비밀번호는 " + m.getPw() + "입니다");
					System.out.println("- 비밀번호 찾기완료 -");
					return;
				}
			}
			System.out.println("없는회원입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}

}
