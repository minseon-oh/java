package exception.trycatch;

public class RuntimeEx {
	
	public static void main(String[] args) {
		
		//ArrayIndex	
//		int[] arr = {1, 2, 3, 4, 5};
//		System.out.println(arr[5]);
		
		//ClassCast
//		String s = (String) new Object();
		
		//NumberFormat
//		String s = "10";
//		int num = Integer.parseInt(s); //문자를 숫자로 바꾸는 parseInt
//		System.out.println(num);
		
		//NullPointer
		String s = null;
		s.charAt(0);
		
	}

}
