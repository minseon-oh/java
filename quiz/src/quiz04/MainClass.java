package quiz04;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", 20, 170);
		p1.info();
		
		Person p2  = new Person();
		p2.name = "고길동";
		p2.age = 30;
		p2.tall = 180;
		p2.info();
		
	}

}
