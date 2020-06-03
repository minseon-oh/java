package quiz06;

public class Student {
	
	/*
	 * 멤버변수는 5개
	 * name -이름
	 * no - 학생번호
	 * kon - 국어점수
	 * eng - 영어점수
	 * math - 수학점수
	 * 
	 * 생성자
	 * 5가지를 초기화하는 생성자
	 * 
	 * getTotal() - 국어, 영어, 수학 점수를 모두 더해서 합계반환
	 * getAvg() - 평균점수 반환(단, 소수점 2자리 까지)
	 * 
	 * main에서는 학생 두명을 각각 생성하고 확인.
	 * 
	 * 
	 */
	
	String name;
	int no;
	int kon;
	int eng;
	int math;
	
	Student(String name1, int no1, int kon1, int eng1, int math1){
		name = name1;
		no = no1;
		kon = kon1;
		eng = eng1;
		math = math1;
	}
	
	int getTotal() {
		int total = kon + eng + math;
		return total;
	}
	
	double getAvg() {
		double avg = (int)((getTotal() / 3.0) * 100) /100.0;
		return avg;
	}

}
