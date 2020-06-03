package api.lang.sb;

public class StringTest {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		//일반 스트링 타입 약 17초걸림
//		String s = "";
//		for(int i=1; i<=300000; i++) {
//			s += "A";
//		}
		
		//버퍼타입 약 0.01초걸림(대용량에 적합)
		StringBuffer sb = new StringBuffer();
		for(int i=1; i<=300000; i++) {
			sb.append("A");
		}
		
		long end = System.currentTimeMillis();
		System.out.println("시간: " + (end - start) * 0.001);
		
		
		
		
		
		
	}

}
