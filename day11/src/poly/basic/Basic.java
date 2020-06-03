package poly.basic;

/*
 * 자바에서 하나의 클래스 파일에 여러 클래스 선언이 가능하다.
 * 단, 파일명과 동일한 클래스가 존재해야 하고, 해당 클래스만 public이어야 한다. 
 * 
 */

class A{} //밑에 public클래스가 있기때문에 public을 쓸 수 없음. 하나만 public.
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {
	
	/*
	 * 다형성
	 * 자식객체가 부모타입을 가질 수 있는 특성이다.
	 */
	
	A a = new A(); //접근제한자도 앞에 붙을 수 있음
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	int x = 10;
	double y = x; //int가 double형으로 자동형변환되서 1.0으로 출력됨. 아래 클래스도 동일하다. 
	
	A a1 = b; // B가 A로 자동형변환.
	A a2 = new B(); //줄여쓰기. 부모변수에 자식클래스.
	A a3 = new C();
	A a4 = new D();
	A a5 = new E();
	
//	B b1 = new E(); -> 상속관계가 없다면 다형성 적용이 불가능.
	
	//Odject타입은 최상위 부모클래스이기때문에 모든 클래스를 저장할 수 있다.
	Object o1 = a;
	Object o2 = new B();
	Object o3 = "문자열";
	
	

}
