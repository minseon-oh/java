package quiz35;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Person {
	
	private String name;
	private String id;
	private String pw;
	
	private Scanner sc = new Scanner(System.in);
	
	public String inputInfo() {
		System.out.print("ID>");
		this.id = sc.next();
		System.out.print("PW>");
		this.pw = sc.next();
		System.out.print("NAME>");
		this.name = sc.next();

		return this.id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	

}
