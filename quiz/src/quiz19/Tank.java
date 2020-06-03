package quiz19;

public class Tank extends Unit{
	
	public Tank() {
		super(0,0,100);
	}
	
	public void changeMode() {
		System.out.println("공격 모드를 변경");
	}

}
