package poly.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.method1();
		p.method2();
		
		Child c = new Child();
		c.method1(); //상속받은 메서드
		c.method2(); //오버라이딩 메서드
		c.method3(); //자식의 메서드
		
		System.out.println("---다형성 적용---");
		Parent p2 = c; //child형을 parent형에 넣음.
		
		System.out.println(c); //c와 p2가 같음을 확인. 같은 주소값을 확인할 수 있다.
		System.out.println(p2);
		System.out.println(p2 == c);
		
		p2.method1();
		p2.method2();
//		p2.method3(); -> 자식의 메서드는 사용불가. 재정의 된 메서드만 사용가능.
		/*
		 * 다형성 적용시에 자식이 가지고 있던 본래 멤버에 접근할 수 없는 문제가 발생한다.
		 * 단, 재정의된 메서드는 정상적으로 호출가능.
		 */
		
		System.out.println("---클래스 캐스팅---");
		Parent pp = new Child(); //자식클래스를 받은건 자식클래스로 캐스팅이 가능하다.
		Child cc = (Child) pp;
		
//		Parent ppp = new Parent(); -> 빨간줄은 없지만 에러발생. 다형성을 하지 않은 것은 자식클래스로 캐스팅 불가.
//		Child ccc = (Child)ppp;
		/*
		 *다형성이 일어나지 않은 객체를 대상으로 클래스캐스팅을 실행하면 에러발생. 
		 */
		
		
		
		
		
	}

}
