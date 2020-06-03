package quiz17;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior me = new Warrior("강한친구");
		
		Wizard play2 = new Wizard("구르미");//체력500
		Warrior play3 = new Warrior("전사 약해요");//체력1000
		
		System.out.println("---나의 캐릭 배쉬스킬 사용---");
		me.bash(play2);//강한친구 bash스킬사용 (play2적중)
		me.bash(play3);//강한친구 bash스킬사용 (play3적중)
		
		me.bash(play2);//강한친구 bash스킬사용 (play2적중)
		me.bash(play3);//강한친구 bash스킬사용 (play3적중)
		
		play2.info();
		play3.info();
		
		Player[] arr = {me, play3};
		play2.Bizzard(arr);
		play2.Bizzard(arr);
		
	}

}
