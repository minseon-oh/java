package api.lang.object;

public class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "이름: " + name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Person) {
			Person p = (Person)obj;
			if(p.getName().equals(this.name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected void finalize() throws Throwable {
		//생성된 객체가 사라지는 시점에서 자동실행
		System.out.println(this.name + "님이 소멸되었습니다.");
	}
	
	
	
	

}
