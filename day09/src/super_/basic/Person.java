package super_.basic;

public class Person {
	
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person(String name){
		this(name, 1);
	}
	
//	Person(){
//		this("이름x", 1);
//	}
	
	String info() {
		return "이름:" + name + " 나이:" + age;
	}

}
