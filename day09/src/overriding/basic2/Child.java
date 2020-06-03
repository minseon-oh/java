package overriding.basic2;

public class Child extends Parent{
	
	void method2() {
		System.out.println("자식의 제정의 된 메서드 2번 호출");
	}
	
	void method3() {
		System.out.println("자식의 메서드 3번 호출");
	}

}
