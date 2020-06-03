package api.io.buffered04;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx {

	public static void main(String[] args) {
		/*
		 * Buffered가 붙은 클래스는 입출력 속도향상을 위한 클래스이며 InputStream 바이트기반이다.
		 */
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			
			fis = new FileInputStream("D:\\course\\JAVA\\file\\test2.txt");
			bis = new BufferedInputStream(fis);
			
			while(true) {
				int a = bis.read(); //한글자를 읽어서 반환
				System.out.print((char)a);
				
				if(a == -1) break; //더이상 읽은 데이터가 없다면 -1을 반환
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				bis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
