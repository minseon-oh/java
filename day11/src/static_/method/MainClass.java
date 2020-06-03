package static_.method;

public class MainClass {
	
	public static void main(String[] args) {
		Count c = new Count();
		c.a = 10;
		c.method1();
		
		//static메서드 사용
		Count.method2();
		Count.method2();
		
		//static 메서드의 예시
		Math.random();
		String.valueOf('c');
		
		
		
		
		
		
	}

}
