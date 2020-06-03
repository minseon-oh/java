package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//입력받는 순서대로 값을 저장
		String[] arr = new String[100];
		int count = 0;// 입력받은 갯수를 카운트하여 index로 사용하는 변수
		
		System.out.println("#먹고싶은 음식을 입력하세요");
		System.out.println("#입력을 중지하려면 <그만>을 입력하세요");
		
		while(true) {
			
			System.out.print(">");
			String menu = sc.nextLine();
			
			if(menu.equals("그만")) {
				System.out.println("입력 종료");
				break;
			}
			
			arr[count] = menu;
			count++;
			
		}
		
		//입력종료 후 출력조건 (입력받은 인덱스까지만 출력)
		System.out.println("-----입력받은 메뉴-----");
		for(int i=0; i<count; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		

	}

}
