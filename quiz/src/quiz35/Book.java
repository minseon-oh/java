package quiz35;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Book implements InterPoint{
	
	Scanner sc = new Scanner(System.in);

	public void info(Set<Person> person) { //회원입력
		Person p = new Person();
		p.inputInfo();
		person.add(p);
	}
	
	@Override
	public void input(Set<Person> person) { //대여
		System.out.print("ID>");
		String id = sc.next();
		for(Person p : person) {
			if(person.contains(id)) {
				System.out.print("PW>");
				String pw = sc.next();
				if(person.contains(pw)) {
					System.out.print("책제목>");
					String b = sc.next();
					
					return;
				}
			}
		}
		
		
	}

	@Override
	public void showAll(Set<Person> person) { //출력
		System.out.print("ID>");
		String id = sc.next();
		for(Person p : person) {
			if(person.contains(id)) {
				System.out.print("PW>");
				String pw = sc.next();
				if(person.contains(pw)) {
					Iterator<Person> iter = person.iterator();
					while(iter.hasNext()) {
						System.out.println(iter.next());
					}
					return;
				}
			}
		}
		System.out.println("없는 회원입니다.");
		
	}

	@Override
	public void delete(Set<Person> person) { //반납
		// TODO Auto-generated method stub
		
	}
}
