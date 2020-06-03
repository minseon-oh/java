package inter.basic3;

public class MianClass {
	
	public static void main(String[] args) {
		
		Printed p = new Samsung();//new LG();
		
		p.turnOn();
		p.print("마바사");
		p.colorPrint("가나다", "검정");
		p.copy(10);
		p.turnOff();
		
		
	}

}
