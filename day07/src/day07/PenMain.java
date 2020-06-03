package day07;

public class PenMain {
	
	public static void main(String[] args) {
		
		//검정색 펜
		//Pen의 기능 속성을 쓰려면 설계용 클래스를 객체로 생성해야한다.
		//객체의 기능과 속성을 사용할 때는 참조연산자 점(.)을 사용한다.
		Pen black = new Pen();
		black.ink = "검정";
		black.price = 500;
		black.company = "모나미";
		
		black.write();
		black.info();
		
		System.out.println("=============================");
		
		Pen red = new Pen();
		red.ink = "빨강";
		red.price = 1000;
		red.company = "하이테크";
		
		red.write();
		red.info();
		
	}

}
