package day07;

public class PhoneMain {
	
	public static void main(String[] args) {
		
		Phone basic = new Phone();
		basic.info();
		
		Phone black = new Phone("블랙");
		black.info();
		
		Phone white = new Phone("화이트", 400000);
		white.info();
		
		Phone iPhone = new Phone("그레이", "아이폰");
		iPhone.info();
		
		//모든 멤버변수를 받는 생성자 생성
		//그린, 1000000, 샤오미 전달하여 객체생성
		
		Phone all = new Phone("샤오미", 1000000, "그린");
		all.info();
		
	}

}
