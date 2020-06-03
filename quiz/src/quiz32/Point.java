package quiz32;

import java.util.List;
import java.util.Scanner;

public class Point implements InterPoint{
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void showPointUI() {
		System.out.println("===========================================================");
		System.out.printf("%4s%10s%15s%12s %12s%12s%12s %15s\n"
				, "학번", "이름", "국어", "영어", "수학", "총점"
				, "평균", "학점");
		System.out.println("===========================================================");
	}

	@Override
	public void input(List<Student> students) {
		Student s = new Student();
		s.inputStuInfo();
		for(int i=0; i<students.size(); i++) {
			if(students.get(i).getStuId().equals(s.getStuId())) {
				System.out.println("이미 등록된 학번입니다");
				return;
			}
		}
		s.calcTotAvg();
		showPointUI();
		s.outputInfo();
		students.add(s);
		System.out.println(s.getName() + "님의 성적 정보가 정상적으로 입력되었습니다.");
	}

	@Override
	public void showAll(List<Student> students) {
		double total = 0;
		showPointUI();
		for(Student s : students) {
			s.outputInfo();
			total += s.getAvg();
		}
		total /= students.size();
		System.out.printf("<우리반 전체평균: %.2f>", total);
		
	}

	@Override
	public void search(List<Student> students) {
		System.out.print("찾을 학생의 학번을 입력하세요>");
		String s = sc.next();
		for(Student stu : students) {
			if(stu.getStuId().equals(s)) {
				showPointUI();
				stu.outputInfo();
				return;
			}
		}
		System.out.println("없는 학번입니다");
		
	}

	@Override
	public void modify(List<Student> students) {
		int n = 0;
		System.out.print("수정할 학생의 학번을 입력하세요>");
		String s = sc.next();
		for(Student stu : students) {
			if(stu.getStuId().equals(s)) {
				System.out.print("국어>");
				n = sc.nextInt();
				stu.setKor(n);
				System.out.print("영어>");
				n = sc.nextInt();
				stu.setEng(n);
				System.out.print("수학>");
				n = sc.nextInt();
				stu.setMath(n);
				
				stu.calcTotAvg();

				return;
			}
		
	}
		System.out.println("없는 학번입니다");
	}

	@Override
	public void delete(List<Student> students) {
		System.out.print("삭제할 학생의 학번을 입력하세요>");
		String s = sc.next();
		for(int i=0; i<students.size(); i++) {
			if(students.get(i).getStuId().equals(s)) {
				students.remove(i);
				return;
			}
			if(i == students.size()-1) {
				System.out.println("없는 학번입니다");
			}
		}
		
	}

}
