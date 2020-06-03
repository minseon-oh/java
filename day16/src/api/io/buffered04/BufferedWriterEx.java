package api.io.buffered04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			/*
			 * 순서대로 nextLine()을 써서 2문장을 입력받는다.
			 * 줄바꿈 처리를 한 후 file폴더안에 test3.txt형식으로 파일을 써라.
			 */
			
			fw = new FileWriter("D:\\course\\JAVA\\file\\test3.txt");
			bw = new BufferedWriter(fw);
			
			System.out.print("문장 작성1>");
			String s1 = sc.nextLine();
			System.out.print("문장 작성2>");
			String s2 = sc.nextLine();
			
			bw.write(s1 + "\r\n" + s2);
			
			System.out.println("정상 저장");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				fw.close();
				sc.close();
			} catch (Exception e2) {
			}
		}

	}

}
