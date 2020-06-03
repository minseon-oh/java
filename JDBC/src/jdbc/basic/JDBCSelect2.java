package jdbc.basic;

import java.sql.*;
import java.util.Scanner;

public class JDBCSelect2 {
	
	public static void main(String[] args) {
		
		/*
		 * 회원 ID를 입력받아서 해당ID의 회원정보를 모두 출력하는 JDBC코드를 작성
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID>");
		String id = sc.next();
		
		String url = "JDBC:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";
		
		String sql = "select * from member01 where id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				
				System.out.println("아이디:" + id);
				System.out.println("비번:" + pw);
				System.out.println("이름:" + name);
				System.out.println("이메일:" + email);
				System.out.println("주소:" + address);
				
			}else {
				System.out.println("없는 아이디 입니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) conn.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {
				
			}
		}
		
		
	}

}
