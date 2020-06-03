package modi.member.pac1;

public class A {
	
	public int var1;
	int var2;
	private int var3;
	
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	//생성자
	public A() {
		//같은 클래스이기때문에 모두 사용이 가능.
		var1 = 1;
		var2 = 1;
		var3 = 1;
		method1();
		method2();
		method3();
	}

}
