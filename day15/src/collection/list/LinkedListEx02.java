package collection.list;

import java.util.LinkedList;

public class LinkedListEx02 {
	
	public static void main(String[] args) {
		
		//링크리스트객체생성
		LinkedList<String> list = new LinkedList<>();
		
		//추가
		list.add("홍길동");
		list.add("홍길자");
		list.add("김길동");
		//확인
		System.out.println(list.toString());
		
		//처음에추가
		list.addFirst("이순신");
		list.addLast("신사임당");
		System.out.println(list.toString());

		String name = list.get(0);
		System.out.println("0번째 인덱스:" + name);
		
		list.remove();
	}
	
}
