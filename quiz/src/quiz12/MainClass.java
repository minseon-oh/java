package quiz12;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior wa = new Warrior("전사");
		
		System.out.println("-----전사-----");
		wa.info();
		wa.bash();
		
		Wizard wi = new Wizard("마법사");
		
		System.out.println("-----마법사-----");
		wi.info();
		wi.iceArrow();

	}

}
