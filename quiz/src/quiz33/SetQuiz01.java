package quiz33;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SetQuiz01 {

	public static void main(String[] args) {
		/*
		 * Random객체 이용하여 1~45까지 랜덤수생성
		 * set이용하여 6개의 랜덤수를 만들어내는 코드 작성
		 * 
		 */
		Set<Integer> set = new HashSet<>();
		while(true) {
			int r = (int)(Math.random() * 45) + 1;
			set.add(r);
			if(set.size() == 6) {
				break;
			}
		}
		
		System.out.println(set.toString());
		

	}

}
