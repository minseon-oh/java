package api.io.stream01;

import java.io.FileInputStream;
import java.util.Arrays;

public class InputStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 파일을 읽어 들이는데 사용하는 클래스는 FileInoutStream이다.
		 * 2. 생성자의 매개값으로 읽어드릴 파일의 전체경로를 적는다.
		 * 3. io패키지 모든 클래스들은 생성자에 throws키워드가 
		 * 		있기때문에 트라이캐치블록과 함께 써야한다. 
		 */
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("D:\\course\\JAVA\\file\\ggg.txt");

//			while(true) {
//				//1바이트씩 읽기
//				int data = fis.read(); //1바이트 단위로 읽음.(영어는 1바이트, 한글은 2바이트)
//				System.out.print( (char)data ); //숫자형을 문자형으로 출력
//				if(data == -1) break; //read()메서드가 더이상 읽을값이 없다면 -1반환
//			}
			
			byte[] arr = new byte[100];
			fis.read(arr); //100바이트 단위로 읽는다는 뜻.
//			System.out.println(Arrays.toString(arr));
			
			int i = 0;
			while(true) {
				if(arr[i] == 0) break;
				System.out.print((char)arr[i]);
				i++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (Exception e2) {
				
			}
		}
		
	}

}
