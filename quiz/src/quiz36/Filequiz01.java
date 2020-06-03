package quiz36;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Filequiz01 {

	public static void main(String[] args) {
		/*
		 * 1.스캐너를 통해 파일명을 정확히 입력받는다.
		 * 2.upload폴더에 해당파일이 있다면 카피폴더로 복사.
		 *	파일이 없다면 파일명이 없습니다 출력(예외) 
		 *
		 * 3.복사도중에 에러가 발생하면 파일 처리중 예외발생 구문출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		FileInputStream f = null;
		FileOutputStream cf = null;
		
		try {
			System.out.print("파일명을 입력하세요>");
			String name = sc.next();
			
			f = new FileInputStream("D:\\course\\JAVA\\upload\\" + name);
			cf = new FileOutputStream("D:\\course\\JAVA\\uploadcopy\\" + name);
			
			byte[] arr = new byte[100];
			
			int result;
			while((result = f.read(arr)) != -1) {
				cf.write(arr, 0, result); 
			}
				
			System.out.println("파일이 정상적으로 복사되었습니다.");
			
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일이 없습니다.");
		}catch (IOException e){
			System.out.println("파일 처리 중 에러발생");
		}finally {
			try {
				f.close();
				cf.close();
				sc.close();
			} catch (Exception e2) {
				
			}
		}

	}

}
