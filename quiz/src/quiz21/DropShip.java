package quiz21;

public class DropShip extends Unit{
	
	public Unit[] unit = new Unit[8];
	public int index = 0;
	
	public DropShip() {
		super(0,0,60);
	}
	
	/*
	 * 1. location의 기능은 동일
	 * 2. move의 기능은 마린과 동일
	 * 		단, 수송선이 이동하면 수송선 배열에 있는 모든 유닛의 위치를 수송선의 위치로 바꾼다.
	 * 3. void ride(모든 유닛을 받도록 선언)
	 * - 배열의 크기는 8이고, 수송선 배열에는 탱크와 마린만 탈 수 있다.
	 * - 탱크는 배열을 4칸씩 사용한다. 마린은 배열 1칸씩 사용
	 * - 배열에 유닛이 탈 수 있으면 유닛을 배열에 저장. (탱크가 배열에 타면 인뎃스를 4칸처리)
	 * - 배열이 전부 차거나, 탈수 있는 공간이 없으면 "수송선에 공간이 부족합니다" 출력
	 * - 수송선에 탄 유닛을 가로로 출력
	 * 4. main에서 마린객체 4마리생성, 탱크 2대, 수송선 1대 생성하고 수송선에 넣어서 확인
	 */
	
	@Override
	public void location() {
		System.out.println("DropShip의 현재 위치: " + this.x + ", " + this.y);
		
	}

	@Override
	public void move(int x, int y) {
		int num = (int)Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
		
		this.x = x;
		this.y = y;
		
		for(int j=0; j<unit.length; j++) {
			if(unit[j] instanceof Unit) {
				unit[j].x=x;
				unit[j].y=y;
			}
		}
		
		System.out.println("드롭쉽 이동한 거리: " + num);
		
		location();
	}

	public void ride(Unit u) {
		if (index > 7){
			System.out.println("수송선에 공간이 부족합니다");
		}else if(u instanceof Tank && index <= 4) {
			unit[index] = u;
			index += 4;
		}else if (u instanceof Marine  && index < unit.length) {
			unit[index] = u;
			index++;
		}
		
		System.out.println("---수송선 탑승목록---");
		for(int j=0; j<index; j++) {
			if(unit[j] instanceof Tank) {
				System.out.print("Tank ");
			}else if(unit[j] instanceof Marine) {
				System.out.print("Marine ");
			}
		}
		System.out.println();
		
		
	}

}
