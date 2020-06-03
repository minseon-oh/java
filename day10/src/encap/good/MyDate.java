package encap.good;

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	private String ssn;
	
	/*
	 * 은닉된 변수에 접근 할 때는 클래스 설계자가 미리 생성해 놓은 
	 * getter / setter메서드를 사용하여 데이터에 접근한다.
	 * 
	 * setter메서드 선언
	 * 1. 은닉변수에 값을 저장하는 메서드
	 * 2. 접근제한자 public으로 선언하고 이름은 set+멤버변수이름으로 지정
	 * 
	 */
	
	public void setYear(int year) {
		
		if(year < 1 || year > 2020) {
			System.out.println("잘못된 값 입력 입니다.");
		}else {
			this.year = year;
		}
	}
	
	/*
	 * getter메서드 선언
	 * 1. 은닉변수에 값을 조회하는 메서드
	 * 2. 접근 제한자는 public선언하고 이름은 get + 멤버변수이름으로 지정
	 * 
	 */
	
	public int getYear() {
		return year;
	}
	
	/*
	 * 1. month, day, ssn에 대한 getter, setter생성
	 * month - 1~12월 까지 저장
	 * day - 1~31일
	 * ssn - 13자리까지만 저장가능 .length()
	 * 
	 */
	
	public void setMonth(int month) {
		if(month <= 0 || month > 12) {
			System.out.println("잘못된 값");
		}else {
			this.month = month;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setDay(int day) {
		if(day <= 0 || day > 31) {
			System.out.println("잘못된 값");
		}else {
			this.day = day;
		}
	}
	
	public int getDay() {
		return day;
	}
	
	public void setSsn(String ssn) {
		if(ssn.length() != 13) {
			System.out.println("잘못된 값");
		}else {
			this.ssn = ssn;
		}
	}
	
	public String getSsn() {
		return ssn;
	}
	
	
	
	

}
