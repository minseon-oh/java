package api.io.stream01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * 1.파일을 쓸 때 사용하는 클래스는 FileOutputStream이다.
		 * 2.생성자 매개값으로 파일을 쓸 전체경로를 지정한다.
		 * 3.io패키지 모든 클래스들은 생성자에 throws키워드가 
		 * 		있기때문에 트라이캐치블록과 함께 써야한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명>");
		String name = sc.next();
		FileOutputStream fos = null; //try~catch구문 안에서 닫을 수 없으니까 구문밖에서 먼저 선언
		
		try {
			//D:\\course\\JAVA\\file(=파일경로)  +  \\test.txt(=파일명)
			fos = new FileOutputStream("D:\\course\\JAVA\\file\\" + name + ".txt");
			System.out.print("문장입력>");
			sc.nextLine();//엔터값을 없애주는 작업을 해야함.
			//next()다음에 nextLine()을 쓰려고할 때 엔터값이 넘어오기 때문에(문장의 종료로 인식) 문장을 쓰지 못 하고 넘어가버리는 문제.
			String str = sc.nextLine();
			
			byte[] arr = str.getBytes(); //문자열 데이터를 바이트데이터로 변형			
			fos.write(arr);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close(); //꼭 닫아야함.
				sc.close();
			} catch (IOException e) {
			}
		}

		
	}

}
