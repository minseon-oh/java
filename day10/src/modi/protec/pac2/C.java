package modi.protec.pac2;

import modi.protec.pac1.A;

public class C extends A{
	
	public C() {
//		A a = new A;
//		a.bool = true;
//		a.method();
		
		super();
		super.bool = true; //상속관계에서 슈퍼를 통해 사용이 가능하다.
		super.method();
	}

}
