package static_.init;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 클래스가 호출될 때 정적초기화자는 단 한번 호출된다.
		 * 
		 * 
		 */
//		Computor com1 = new Computor(1000);
//		Computor com2 = new Computor(2000);
//		Computor com3 = new Computor(3000);
		
		System.out.println(Computor.model);
		System.out.println(Computor.company);

	}

}
