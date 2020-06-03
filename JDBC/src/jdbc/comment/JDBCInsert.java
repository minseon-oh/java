package jdbc.comment;

import java.util.Scanner;
import java.sql.*;

public class JDBCInsert {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디>");
		String id = sc.next();
		
		System.out.print("비밀번호>");
		String pw = sc.next();
		
		System.out.print("이름>");
		String name = sc.next();
		
		System.out.print("이메일");
		String email = sc.next();
		
		System.out.print("주소>");
		String address = sc.next();
		
		//1.DB연결에 필요한 변수
		String url = "JDBC:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";
		
		String sql = "insert into member01 values(?,?,?,?,?)";
		
		//2.DB연동에 사용할 클래스 변수들을 선언
		//ResultSet은 Select주문이 아니라면 필요없음
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//3.JDBC연결 드라이버 호출
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//4.커넥션 객체 생성
			conn = DriverManager.getConnection(url, uid, upw);
			//5.SQL문 전손을 위한pstmt객체생성
			//sql문의 물음표(?)의 순서대로 인덱스번호를 가지고 1부터 시작한다. pstmt에 전달된 sql문의 물음표를 채우는 작업.
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			pstmt.setString(5, address);
			
			//6.sql문의 실행(insert, delete, update문은 Update()문을 실행한다.)
			int result = pstmt.executeUpdate(); //인서트 성공시 1을 반환, 실패시 0을 반환
			
			if(result == 1) {
				System.out.println("DB입력성공");
			}else {
				System.out.println("DB입력실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				
			}
		}

	}

}
