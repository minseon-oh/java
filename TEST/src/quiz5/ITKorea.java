package quiz5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ITKorea {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String today = sdf.format(date);
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader("D:\\course\\java\\" + today + ".txt");
			br = new BufferedReader(fr);
			
			String s;
			String t;
			while((s = br.readLine()) != null) {
				String[] arr = s.split(", ");
				System.out.println(Arrays.toString(arr));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}

}
