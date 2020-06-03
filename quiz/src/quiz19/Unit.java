package quiz19;

public class Unit {

	public int x;
	public int y;
	public int hp;
	
	public Unit(int x, int y, int hp){
		this.x = x;
		this.y = y;
		this.hp = hp;
	}
	
	void location() {
		System.out.println("현재 위치");
	}
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void stop() {
		System.out.println("현재 위치에 정지");
	}
	
	
	
}
