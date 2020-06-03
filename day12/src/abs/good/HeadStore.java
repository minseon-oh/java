package abs.good;

public abstract class HeadStore {
	
	/*
	 * 1.메서드에 abstract를 붙이면 추상메서드가 된다.
	 * 	이 메서드는 상속을 통해 반드시 오버라이딩을 해야한다.
	 * 2.추상메서드는 중가로({})가 없는 메서드이며, 세미콜론(;)으로 메서드를 마감한다.
	 * 3.일반 클래스에 추상메서드를 선언할 수 없다.
	 * 	추상메서드가 하나라도 있다면, 클래스도 추상클래스가 된다.
	 * 4.추상클래스는 일반메서드, 일반변수, 생성자 모두 사용할 수 있다.
	 * 
	 */
	
	private String name = "호식이 과일가게";
	
	public HeadStore() {
		System.out.println("추상클래스 생성자 호출");
	}
	
	public String getName() {
		return name;
	}
	
	public final void mango() {
		System.out.println("망고의 가격은 2000원 입니다");
	}
	
	public abstract void apple ();
	public abstract void banana ();
	public abstract void orange ();
	public abstract void melon ();

	
}
