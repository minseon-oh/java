package quiz37;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RamdaQuiz01 {

	public static void main(String[] args) {
		/*
		 * 1.BufferedReader를 사용하여 읽어들이기.
		 * 2.쉼표(,)기준으로 잘라서 Data클래스에 한 줄 단위로 저장한다.
		 * 3.List<Data>에 추가
		 * 
		 * 4.람다식을 이용하여, 지역:서울, 짝수:월의 분양가격 4000이상의 객체만 뽑아서 새로운 list생성
		 */
		List<Data>list = new ArrayList<>();
		BufferedReader br = null;
		try {
			
			br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\course\\주택도시보증공사_전국 평균 분양가격(2020년 2월).csv"), "EUC-KR"));
			
			String str;
			str = br.readLine();
			while((str = br.readLine()) != null) {
				Data data = new Data();
				str = str.replace("\"", "");
				str = str.replace(" ", "");
				String[] arr = str.split(",", 5);
				if(arr[4].equals("")||arr[4] == null) {
					arr[4] = "0";
				}
				
				data.setRegion(arr[0]);
				data.setSize(arr[1]);
				data.setYear(arr[2]);
				data.setMonth(arr[3]);
				data.setPrice(arr[4].replaceAll("[,-]", ""));
				
				list.add(data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (Exception e2) {
			}
		}
		
		list.stream().filter((data) -> {
			int price = Integer.parseInt((data.getPrice().equals("")) ? "0" : data.getPrice());
			int month = Integer.parseInt(data.getMonth());
			return data.getRegion().equals("서울") && month % 2 == 0 && price >= 4000;
		}).collect(Collectors.toList()).forEach((data) -> {
		System.out.print("지역:" + data.getRegion());
		System.out.print("  규모:" + data.getSize());
		System.out.print("  년도:" + data.getYear());
		System.out.print("  월:" + data.getMonth());
		System.out.print("  분양가:" + data.getPrice() + "\n");
		});	
		
		for(Data d : list) {
			System.out.println(d.toString());
		}
	}

}
