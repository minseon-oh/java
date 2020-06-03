package quiz21;

public class Marine extends Unit{
	
	public static int attack = 6;
	public static int armor = 0;
	
	public Marine() {
		super(0,0,60);
	}
	
	/*
	 * location의 기능
	 * 마린의 현재위치 x와y의 출력
	 *
	 * move의 기능
	 * 1. 현재좌표값에서 매개변수의 좌표만큼 이동한 거리를 구한다.
	 * 		루트 근사값은 Math.sqrt(제곱근)을 이용하면 된다.
	 * 2. 현재좌표값을 매개변수의 좌표값으로 변경
	 * 3. 이동한 거리를 정수형으로 출력
	 * 4. location()메서드를 호출
	 */

	@Override
	public void location() {
		System.out.println("Marine의 현재 위치: " + this.x + ", " + this.y);
		
	}

	@Override
	public void move(int x, int y) {
		int num = (int)Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
		
		this.x = x;
		this.y = y;
		
		System.out.println("마린 이동한 거리: " + num);
		
		location();
	}
	
		
}
