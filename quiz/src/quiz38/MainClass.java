package quiz38;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 1.BufferedReader로 파일 읽기
		 * 2.수출입 구분의 수출항목에 오징어가 포함되어있는  데이터만 구분하여 List<Data>에 처리
		 * 3.이 데이터의 수출입 미화금액 총 합계를 구하세요
		 * 4.오징어를 찾을 때는
		 * 		if(data.indexOf("오징어") != -1)사용 : 갈치라는 단어가 들어가면 숫자를 반환하고 아니면 -1을 반환하는 메서드
		 */
		
		BufferedReader br = null;
		List<Data> list = new ArrayList<>();
		int monthTotal = 0;
		int yearTotal = 0;
		
		try {
			
			br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\course\\해양수산부_수산물 품목별 수출입 현황 - 2020년 02월(월간).csv"), "EUC-KR"));
			
			String str;
			str = br.readLine();
			while((str = br.readLine()) != null) {
				Data d = new Data();
				str = str.replace("'", "");
				String[] arr = str.split(",");
				d.setMonth(arr[0]);
				d.setCode(arr[1]);
				d.setCode2(arr[2]);
				d.setFish(arr[3]);
				d.setName(arr[4]);
				d.setMonthWeight(arr[5]);
				d.setMonthPrice(arr[6]);
				d.setYearWeight(arr[7]);
				d.setYearPrice(arr[8]);
				d.setDay(arr[9]);
				list.add(d);
				monthTotal += Integer.parseInt(d.getMonthPrice());
				yearTotal += Integer.parseInt(d.getYearPrice());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (Exception e2) {
			}
		}

		int sum = list.stream().filter((data)-> data.getName().equals("수출"))
		.filter((data) -> data.getFish().indexOf("오징어") != -1)
		.mapToInt((data) -> {
			return Integer.parseInt(data.getMonthPrice());
		}).sum();
		
		System.out.println("합계:" + sum);
		
		for(Data d : list) {
			System.out.println(d.toString());
		}
//		
//		System.out.println("당월 총 수출입 미화금액:" + monthTotal);
//		System.out.println("당해 총 수출입 미화금액:" + yearTotal);

		

	}

}
