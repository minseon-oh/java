package quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		//퀴즈04
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 나이를 입력하세요");
		System.out.print("키: ");
		double cm = sc.nextDouble();
		System.out.println("나이: ");
		int age = sc.nextInt();
		
		if(cm >= 140 && age >= 8) {
			System.out.println("놀이기구 탑승이 가능합니다");
		}else {
			System.out.println("놀이기구 탑승이 불가합니다");
		}
		
		sc.close();
		
	}

}
