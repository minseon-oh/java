package quiz36;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz03 {

	public static void main(String[] args) {
		/*
		 * Date클래스를 이용하여  file 경로에 하위폴더로 20200421file폴더생성
		 * 스캐너로 파일명을 입력받고 BufferedWriter를 이용하여 .txt파일 생성
		 * 그만을 입력받을 때 까지 엔터를 포함해서 입력받는다.\r과\n을 적절하게 이용하여 파일출력완료
		 * 파일을 다 썼다면 아무방법으로 읽어들여서 출력.
		 */
		Scanner sc = new Scanner(System.in);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(date);
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		String fileName = "";
		
		try {
			File file = new File("D:\\course\\JAVA\\file\\" + today);
			if(!file.exists()) {
				file.mkdir();
				System.out.println("폴더 생성완료");
				
				try {
					System.out.print("생성할 파일명을 입력하세요>");
					fileName = sc.nextLine();
					bw = new BufferedWriter(new FileWriter(file.getPath() + "\\" + fileName + ".txt"));
					
					System.out.println("파일 내용을 입력하세요('그만'입력시 입력종료)>");
					String str = "";
					while(true) {
						String str2 = sc.nextLine();
						if(str2.equals("그만")) break;
						str += (str2 + "\r\n");
					}
					bw.write(str);
					
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					try {
						bw.close();
					} catch (Exception e2) {	
					}
				}
				
				try {
					
					br = new BufferedReader(new FileReader(file.getPath() + "\\" + fileName + ".txt"));
					
					String str;
					while((str = br.readLine()) != null) {
						System.out.println(str);
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					try {
						br.close();
					} catch (Exception e2) {
					}
				}
				
			}else {
				System.out.println("이미 폴더가 존재합니다");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
