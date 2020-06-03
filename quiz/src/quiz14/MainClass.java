package quiz14;

public class MainClass {
	
	public static void main(String[] args) {
		
		SuperSonicAp s = new SuperSonicAp("대한항공");
		System.out.println(s.info());
		
		s.takeOff();
		s.fly();
		
		s.flyMode = 1;
		s.fly();
		s.land();
		
	}

}
