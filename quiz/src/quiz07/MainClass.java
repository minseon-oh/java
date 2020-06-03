package quiz07;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior wa = new Warrior();
		wa.name = "대한전사";
		wa.hp = 1000;
		wa.mp = 500;
		
		System.out.println("-----전사-----");
		wa.info();
		wa.bash();
		
		Wizard wi = new Wizard();
		wi.name = "달빛";
		wi.hp = 500;
		wi.mp = 1000;
		
		System.out.println("-----마법사-----");
		wi.info();
		wi.iceArrow();

	}

}
