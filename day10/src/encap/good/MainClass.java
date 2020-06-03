package encap.good;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		me.setYear(2020);
		
		int year = me.getYear();
		System.out.println("년: " + year);
		
		me.setMonth(2);
		me.setDay(10);
		me.setSsn("1234567891234");
		
		int month = me.getMonth();
		int day  = me.getDay();
		String ssn = me.getSsn();
		
		System.out.println("월: " + month);
		System.out.println("일: " + day);
		System.out.println("주민번호: " + ssn);
		
		//-------------------------------------------------------
		
		Member m1 = new Member("aaa123", "1234", "홍길동", "google", "서울", 010, 20);
		Member m2 = new Member("bbb123", "5678", "홍길자", "google", "경기", 010, 25);
		Member[] arr2 = new Member[2];
		arr2[0] = m1;
		arr2[1] = m2;
		
		for(int i=0; i<arr2.length; i++) {
			Member m = arr2[i];
			System.out.println(m.getId());
			System.out.println(m.getPw());
		}
		

		
		
	}

}
