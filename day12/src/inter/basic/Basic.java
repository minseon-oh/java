package inter.basic;

public class Basic implements Inter1, Inter2{

	@Override
	public void method1() {
		System.out.println("재정의 된 1번 메서드 호출");		
	}

	@Override
	public void Method2() {
		System.out.println("재정의 된 2번 메서드 호출");	
		
	}
	
	public void method3() {
		System.out.println("Basic클래스의 일반메서드 호출");	
	}
	
	
	
	
	

}
