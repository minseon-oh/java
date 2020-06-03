package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		//날짜클래스
		Date date = new Date();
		System.out.println(date);
		//날짜 포맷클래스
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일");
		String now = sdf.format(date);
		System.out.println(now);
	}

}
