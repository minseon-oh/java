package api.io.rw03;

import java.io.FileWriter;

public class FileWriterEx {

	public static void main(String[] args) {
		/*
		 * 문자를 써서 저장할 때 사용하는 클래스 FileWriter클래스
		 * 기본적으로 2바이트 단위로 처리하기 때문에 문자쓰기에 적합
		 */
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter("D:\\course\\JAVA\\file\\test.txt");
			
			String str = "오늘은 4월 20일 입니다.\r\n집에가고싶다."; // \n:줄바꿈. \r:커서를 처음으로 되돌림.
			fw.write(str);
			System.out.println("정상 저장");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				
			}
		}

	}

}
