package day03;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		//1. 스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//2. 스캐너가 가지고 있는 입력 기능을 통해서 데이터를 입력받음
		System.out.print("이름> ");
		String name = scan.next();
		
		System.out.print("나이> ");
		int age = scan.nextInt();
		
		System.out.print("키> ");
		double cm =  scan.nextDouble();
		
		System.out.print("자기소개> ");
		scan.nextLine();
		//nextLine()은 엔터값까지 인식하여 출력하기때문에 중간에 엔터를 없애주는 작업을 하지 않으면 입력받을 수 없다
		//넘어온 엔터값을 인식하여 값을 입력하지 않은채로 넘어가기때문
		String intro =  scan.nextLine();
		
		System.out.println("이름: " + name + ", 나이: " + age + ", 키: " + cm);
		System.out.println("자기소개: " + intro);
		
		//3.스캐너 자원 반납(마무리작업)
		scan.close();
	}

}
