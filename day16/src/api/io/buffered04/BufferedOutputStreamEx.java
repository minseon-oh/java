package api.io.buffered04;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {
		/*
		 * Buffered가 붙은 클래스는 입출력 속도 향상을 위한 클래스이며
		 * OutputStream은 바이트기반입니다.
		 * 
		 * Buffered가 붙은 클래스들은 생성자의 매개변수로 바이트기반 클래스를 받을 수 있다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		FileOutputStream fs = null;
		BufferedOutputStream bs = null;
		
		try {
			
			fs = new FileOutputStream("D:\\course\\JAVA\\file\\test2.txt");
			bs = new BufferedOutputStream(fs);
			
			System.out.print("문장입력>");
			String str = sc.nextLine();
			
			bs.write(str.getBytes()); //write()는 매개변수로 바이트배열을 받는다.
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fs.close();
				bs.close();
				sc.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
