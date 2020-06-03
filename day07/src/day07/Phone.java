package day07;

public class Phone {
	
	String model;
	int price;
	String color;
	
	//생성자: 생성자는 클래스 이름과 대/소문자 까지 동일
	//반환유형은 없다.
	Phone(){ //생성자는 보통 멤버변수 다음에 만든다. 
		System.out.println("생성자 호출");
		model = "큐리텔";
		price = 200000;
		color = "검정";
	}
	
	//생성자는 중복해서 여러개 선언할 수 있다.
	//단, 매개변수의 종류, 개수가 달라야한다.
	Phone(String pColor){
		model = "애니콜";
		price = 300000;
		color = pColor;
	}
	
	Phone(String pColor, int pPrice){
		model = "가로본능";
		price = pPrice;
		color = pColor;
	}
	
	Phone(String pColor, String pModel){
		model = pModel;
		price = 500000;
		color = pColor;
	}
	
	//모든 멤버변수를 초기화하는 생성자
	Phone(String pModel, int pPrice, String pColor){
		model = pModel;
		price = pPrice;
		color = pColor;
	}
	
	void info() {
		System.out.println("-----휴대폰 정보-----");
		System.out.println("기종: " + model);
		System.out.println("가격: " + price);
		System.out.println("색상: " + color);
		
	}

}
