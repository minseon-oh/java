package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBCSelect3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Board01> list = new ArrayList<>();
		
		System.out.print("조회할 시작 데이터:");
		String start = sc.next();
		System.out.print("조회할 끝 데이터:");
		String end = sc.next();
		
		String url = "JDBC:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";

		String sql = "select *\r\n" + 
						"from(\r\n" + 
						"    select rownum as rn,\r\n" + 
						"            num,\r\n" + 
						"            id,\r\n" + 
						"            title,\r\n" + 
						"            content\r\n" + 
						"    from (select num, \r\n" + 
						"                id, \r\n" + 
						"                title, \r\n" + 
						"                content\r\n" + 
						"                from board01\r\n" + 
						"                order by num desc)\r\n" + 
						")\r\n" + 
						"where rn > ? and rn <= ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {
			/*
			 * 조회한 데이터를 출력, board01클래스를 생성해서 저장하는 JDBC코드를 완성하라.
			 * 
			 */
			
			while(rs.next()) {
				
				int num = rs.getInt("num");
				String id = rs.getString("id");
				String title = rs.getString("title");
				String content = rs.getString("content");
				
				System.out.println("------------------");
				System.out.println(num);
				System.out.println(id);
				System.out.println(title);
				System.out.println(content);
				
				Board01 board = new Board01(num, id, title, content);
				list.add(board);

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
