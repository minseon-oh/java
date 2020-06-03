package day07;

public class Variable {
	
	int a; //멤버변수 : 초기화하지 않으면 자동으로 초기화
//	a = 10; 이러한 작업은 메서드 안에서만 사용. 클래스안에서는 선언만 가능. 또는 선언과 동시에 값을 줄 수 있다. ex) int a = 10;
	
	//메서드 선언
	void printNumber(int c) {
		
		int b; //지역변수: 메서드안에서 선언한 변수. 꼭 초기화를 하고 사용해야한다.
		b = 1; //지역변수는 선언하고 따로 초기화가 가능하다.
		System.out.println("멤버: " + a);
		System.out.println("지역: " + b);
		System.out.println("매개: " + c);
		
	}
	
	

}
