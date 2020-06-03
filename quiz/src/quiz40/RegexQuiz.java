package quiz40;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegexQuiz {

	public static void main(String[] args) {
		/*
		 * 1.day, store, grade, detail, price를 멤버로 갖는 Product 클래스 생성
		 * 2.getter,setter선언
		 * 3.Product를 제네릭으로 갖는 ArrayList생성
		 * 4.BufferedReader를 통해 건담.txt파일을 읽어들인다.
		 * 5.while문안에서는 readLine()메서드를 이용하여 한줄씩 읽도록 처리한다.
		 * 6.날짜 지점 등급 상세 가격 패턴분석을 통해서 Product에 저장 후 리스트에 추가한다.
		 * 
		 * 7.외부라이브러리를 사용하여 분석한 패턴을 xlsx엑셀 파일로 추출
		 */
		
		List<Product> list = new ArrayList<>();
		FileOutputStream fo = null;
		BufferedReader br = null;
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("건담");//시트제목
		XSSFRow row = sheet.createRow(0); //행
		row.createCell(0).setCellValue("날짜");
		row.createCell(1).setCellValue("지점");
		row.createCell(2).setCellValue("등급");
		row.createCell(3).setCellValue("상세");
		row.createCell(4).setCellValue("가격");
		
		try {
			fo = new FileOutputStream("D:\\course\\건담.xlsx");
			br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\course\\건담.txt"), "UTF-8"));
			String str;
			while((str = br.readLine()) != null) {
				Matcher day = Pattern.compile("\\d{8}-\\d{2}-\\d{12,13}").matcher(str);
				Matcher store = Pattern.compile("[가-힣]+ [가-힣]+").matcher(str);
				Matcher grade = Pattern.compile("\\[\\D+\\]").matcher(str);//  \\[[A-Z가-힣]*\\]
				Matcher price = Pattern.compile("\\d+,*\\d+원").matcher(str);
				if(day.find() && store.find() && grade.find() && price.find()) {
					Product p = new Product();
					p.setDay(day.group());
					p.setStore(store.group());
					p.setGrade(grade.group());
					p.setDetail(str.substring(grade.end() + 1, price.start() -1));
					p.setPrice(price.group());
					list.add(p);
				}
			}
			for(int i=0; i<list.size(); i++) {
				row = sheet.createRow(i+1);
				row.createCell(0).setCellValue(list.get(i).getDay());
				row.createCell(1).setCellValue(list.get(i).getStore());
				row.createCell(2).setCellValue(list.get(i).getGrade());
				row.createCell(3).setCellValue(list.get(i).getDetail());
				row.createCell(4).setCellValue(list.get(i).getPrice());
			}
			workbook.write(fo);
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (Exception e2) {
			}
		}
		
		for(Product p : list) {
			System.out.println("-----상품정보-----");
			System.out.println(p.getDay());
			System.out.println(p.getStore());
			System.out.println(p.getGrade());
			System.out.println(p.getDetail());
			System.out.println(p.getPrice());
		}

	}

}
