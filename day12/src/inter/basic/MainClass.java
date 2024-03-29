package inter.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Basic b = new Basic();
		b.method1();
		b.Method2();
		b.method3();
		
		System.out.println(b.ABC);
		System.out.println(b.PI);
		
		System.out.println("----------------------------------");
		/*
		 * 인터페이스도 하나의 데이터 타입이 될 수 있다.
		 * 인터페이스에 객체를 저장했을 때, 다형성의 형태와 동일하기 시행
		 * 
		 */
		
		Inter1 i1 = b;
		i1.method1(); //오버라이딩 된 메서드 실행
//		i1.method2(); (x)
//		i1.method3(); (x)
		
		Inter2 i2 = b;
//		i2.Method1();
		i2.Method2();
//		i2.Method3();
		
		//인터페이스에서도 클래스 캐스팅을 사용할 수 있다.
		Basic bb = (Basic)i1;
		
	}

}
