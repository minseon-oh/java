package api.lang.sb;

public class StringBufferEx {

	public static void main(String[] args) {

		String str = new String("java"); 
		StringBuffer sb = new StringBuffer("java");
		
		//차이점
		str = str + " program"; //스트링타입은 늘 새로 객체를 만든다
		sb.append(" program"); //버퍼타입은 메서드를 통해 만들어져있는 객체에 추가한다. (새로 만들지 않고)
		
		System.out.println(str);//스트링타입
		System.out.println(sb);//버퍼타입
		
		//문자열 추가 append
		sb.append(" study");
		System.out.println(sb);
		
		//문자열 추가 insert
		sb.insert(12, "ming");
		System.out.println(sb);
		
		//문자열 변경 replace
		sb.replace(5, 16, "book");
		System.out.println(sb);
		
		//문자열 삭제 delete
		sb.delete(5, 9);
		System.out.println(sb);
		
		//문자열 거꾸로 뒤집기 reverse
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
