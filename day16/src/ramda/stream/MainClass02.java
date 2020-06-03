package ramda.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass02 {

	public static void main(String[] args) {
		
		List<Integer>list = new ArrayList<Integer>();
		
		for(int i=0; i<100; i++) {
			list.add(new Random().nextInt(100)+1);
		}
		
		System.out.println(list.toString());
		
		System.out.println("----------------------------------------------------------");
		
		//중복제거 distinct()
		list.stream().distinct().forEach((num) -> System.out.print(num + " ")); //스트림으로바꾸고 중복제거해서 람다식으로 출력

		System.out.println("\n----------------------------------------------------------");
		
		//걸러내는 기능 filter() 
		Stream<Integer> s1 = list.stream().filter((num) -> {
			return num % 2 == 0; //순서대로 확인하며 참일때만 반환해준다.
		});
		
		s1.forEach((num) -> System.out.print(num + " "));
		
		System.out.println("\n----------------------------------------------------------");
		
		//정렬 sorted()
		list.stream().sorted().forEach((num) -> System.out.print(num + " "));
		
		System.out.println("\n----------------------------------------------------------");
		
		//새롭게 정의해주는 map()
		//map()은 메서드안에 정의된 새로운 stream으로 반환
		Stream<String> s2 = list.stream().map((num) -> {
			return num % 2 == 0? "짝수" : "홀수";
		});
		
		s2.forEach((str) -> System.out.print(str + " "));
		
		System.out.println("\n----------------------------------------------------------");
		
		//최종처리 collect()
		List<Integer>result = list.stream().filter((num) -> {
			return num % 3 == 0;
		}).collect(Collectors.toList()); //list의 형태로 반환
		
		System.out.println(result);
		
		System.out.println("\n----------------------------------------------------------");
		
		//list의 중복을 제거하고 짝수만 찾아낸다음 정렬하고 짝홀수로 변경한 결과를 list로 반환받고 forEach구문으로 처리
		
		list.stream().distinct().filter((num) -> num % 2 == 0).sorted().map((num) -> num % 2 == 0? "짝수" : "홀수")
		.collect(Collectors.toList()).forEach((s) -> System.out.print( s + " "));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
