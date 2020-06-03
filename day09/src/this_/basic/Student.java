package this_.basic;

public class Student extends Person{
	
	//this 키워드를  이용하여 name,age,studentId초기화하는 생성자
	
	String studentId; //학번
	
	Student(String name, int age, String studentId){
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	String info() {
		return "이름:" + name + " 나이:" + age + " 학번:" + studentId;
	}


}
