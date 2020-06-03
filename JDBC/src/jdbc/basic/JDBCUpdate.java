package jdbc.basic;

import java.sql.*;
import java.util.Scanner;

public class JDBCUpdate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요>");
		String id = sc.next();
		
		System.out.print("수정할 이름>");
		String name = sc.next();
		System.out.print("수정할 이메일>");
		String email = sc.next();
		System.out.print("수정할 주소>");
		String address = sc.next();
		
		//1.DB연동에 필요한 변수선언
		String url = "JDBC:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";
		
		String sql = "update member01 set name = ?, email = ?, address = ? where id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//2.JDBC드라이버 호출
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//3.커넥션생성
			conn = DriverManager.getConnection(url, uid, upw);
			//4. SQL문 전달객체 pstmt생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, address);
			pstmt.setString(4, id);
			//5.SQL문 실행
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("정상수정");
			}else {
				System.out.println("없는아이디");
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

