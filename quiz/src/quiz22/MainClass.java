package quiz22;

public class MainClass {
	public static void main(String[] args) {
		
		Calculating c = new Calculating();
		
		System.out.println("1번 어린이의 식대금액: " + c.child1());
		System.out.println("2번 어린이의 식대금액: " + c.child2(c.YOGURT));
		System.out.println("3번 어린이의 식대금액: " + c.child3(c.ICECREAM, c.MILK));
	}
}
