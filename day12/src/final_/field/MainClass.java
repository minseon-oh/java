package final_.field;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person park = new Person("123123", "박한국");
		
//		park.nation = "미국"; (x)
//		park.ssn = "1234567"; (x)
//		park.name = "박마이클"; (o)
		
		System.out.println("국가: " + park.nation);
		System.out.println("주민번호: " + park.ssn);
		System.out.println("이름: " + park.name);
		
		Person kim = new Person("456456", "김중국");
		
		
		
		
		
		
		
	}

}
