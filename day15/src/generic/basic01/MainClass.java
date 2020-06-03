package generic.basic01;

public class MainClass {

	public static void main(String[] args) {
		
		//제네릭을 사용하면, 객체로 생성할 때 사용할 타입을 지정할 수 있고,
		//다양한 값을 저장하도록 저장할 수 있다.
		
		ABC<String> abc = new ABC<>();//생성자의 타입은 생략이 가능하다.(앞에만 쓰고 뒤에는 <>를 비워둬도 된다.)
		abc.setT("홍길자");
		String name = abc.getT();
		
		ABC<Integer> abc2 = new ABC<>(); //제네릭클래스는 기본형이 저장될 수 없다.
		abc2.setT(1);
		int num = abc2.getT();
		
		ABC<Person> abc3 = new ABC<>();
		abc3.setT(new Person());
		Person p = abc3.getT();
		
	}

}
