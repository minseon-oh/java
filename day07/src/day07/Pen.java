package day07;

//설계도 클래스는 메인 메서드가 없음.
public class Pen {
	
	//클래스 속성을 나타내는 것을 멤버변수(필드)라 한다.
	String ink;
	int price;
	String company;
	
	//클래스 안에 기능을 나타내는 것을 메서드로 라고 부른다.
	void write() {
		System.out.println(ink + "색상 글씨를 씁니다.");
	}
	
	void info() {
		System.out.println("---펜의 정보---");
		System.out.println("색상: " + ink);
		System.out.println("가격: " + price);
		System.out.println("제조사: " + company);
	}
	
	//생성자: 클래스 이름과 똑같고 반환유형이 없다. 생성을 안해도 가상머신이 만들어놈(클래스 안에 숨겨져있다)
	Pen(){
		
	}
	
	
}
