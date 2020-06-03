package quiz36;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileQuiz02 {
	
	public static void main(String[] args) {
		
		/*
		 * 1.Date클래스를 이용하여 file경로에 20200421.txt이름으로 파일을 쓴다.
		 * 2.내용은 아무거나 작성
		 * 3.파일을 정상적으로 썻다면 BufferedTeader를 통해 파일을 읽어들인다.
		 * 
		 */
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(date);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			fw = new FileWriter("D:\\course\\JAVA\\file\\" + today + ".txt");
			bw = new BufferedWriter(fw);
			String str = "안녕하세요\n반갑습니다";
			bw.write(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
				
			}
		}
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader("D:\\course\\JAVA\\file\\" + today + ".txt");
			br = new BufferedReader(fr);
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			
		}finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				
			}
		}
		
	}

}
