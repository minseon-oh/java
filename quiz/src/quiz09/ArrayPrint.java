package quiz09;

public class ArrayPrint {
	
	String printArray(String[] arr) {
		
		String s = "[";
		
		for(int i=0; i<arr.length; i++) {
			s += i == arr.length-1? arr[i] : arr[i]+", ";
		}
		
		s += "]";
		return s;
	}
	
	String printArray(int[] arr) {
		
		String s = "[";
		
		for(int i=0; i<arr.length; i++) {
			s += i == arr.length-1? arr[i] : arr[i]+", ";
		}
		
		s += "]";
		return s;
	}
	
	//쌤풀이
	String printArray(char[] arr) {
		
		String s = "[";
		for(int i=0; i<arr.length; i++) {
			s += arr[i];
			if(i == arr.length-1) break;
			s += ", ";
		}
		s += "]";
		return s;
	}
	
	

}
