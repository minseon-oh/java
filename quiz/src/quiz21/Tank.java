package quiz21;

public class Tank extends Unit{
	
	public Tank() {
		super(0,0,100);
	}
	
	//location과 move의 기능은 동일
	
	public void changeMode() {
		System.out.println("공격 모드를 변경");
	}

	@Override
	public void location() {
		System.out.println("Tank의 현재 위치: " + this.x + ", " + this.y);
		
	}

	@Override
	public void move(int x, int y) {
		int num = (int)Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
		
		this.x = x;
		this.y = y;
		
		System.out.println("탱크 이동한 거리: " + num);
		
		location();
	}

}
