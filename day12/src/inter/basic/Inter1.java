package inter.basic;

public interface Inter1 {
	/*
	 * 인터페이스의 구현(상속) 키워드는  implements 입니다.
	 * 인터페이스는 다중 상속이 가능하다.
	 * 인터페이스에 선언된 추상메서드는 반드시 자식클래스에서 오버라이딩 해야한다.
	 * 
	 */
	
	//상수와 추상메서드를 정의한다.
	double PI = 3.14; //인터페이스에 변수를 선언하면 자동으로 상수로 선언된다. final
	public void method1(); //엔터페이스에 메서드를 선언하면 자동으로 추상메서드가 된다. {}(x)
	
	//스태틱과 디폴트를 쓰면 메서드 몸체를 사용할 수 있음. 알아만 놓기.
//	public static void method2() {
//		
//	}
//	public default void method() {
//		
//	}
	
	
}
