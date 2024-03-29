package api.io.rw03;

import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) {
		/*
		 * 문자기반으로 읽어들이는 클래스는 FileReader클래스
		 * 2바이트 단위로 읽기때문에 문자를 쓰기에 적합.
		 */
		
		FileReader fr = null;
		
		try {
			
			fr = new FileReader("D:\\course\\JAVA\\file\\test.txt");
			
			while(true) {
				int i = fr.read(); //문자를 하나씩 읽어들임
				System.out.print((char)i); //문자형으로 변환
				if(i == -1) break; //읽어들일 문자가 없다면 -1반환
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (Exception e2) {
				
			}
		}
		
		

	}

}
