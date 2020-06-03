package api.io.folder02;

import java.io.File;

public class CreateFileEx {

	public static void main(String[] args) {
		/*
		 * 자바에서 외부경로로 폴더를 생성할 때에는 File클래스를 사용한다.
		 * 생성자의 매개변수로 폴더를 생성할 경로 + 폴더명을 지정한다.
		 */
		
		try {
			
			File file = new File("D:\\course\\JAVA\\file_test");
			if(!file.exists()) { //exists(): 해당파일이 존재하면 true, 아니면 false
				file.mkdir(); //파일생성
				System.out.println("폴더 생성완료");
			}else {
				System.out.println("이미 폴더가 존재합니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
