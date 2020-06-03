package super_.basic;

public class Student extends Person{
	
	//this 키워드를  이용하여 name,age,studentId초기화하는 생성자
	
	String studentId; //학번
	
	Student(String name, int age, String studentId){
		super(name, age); //생략되어있음.
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	String info() {
		return super.info() + " 학번:" + studentId;
	}


}
