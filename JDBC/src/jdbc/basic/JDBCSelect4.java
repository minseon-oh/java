package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBCSelect4 {

	public static void main(String[] args) {
		
		// 조인에 대한 처리
		ArrayList<Board01> list = new ArrayList<>();
		MemberBoard mb = new MemberBoard();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디>");
		String id = sc.next();
		
		//1.DB연결에 필요한 접속정보를 선언
		
		String url = "JDBC:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";
		
		String sql = "select \r\n" + 
					"    m.id,\r\n" + 
					"    m.pw,\r\n" + 
					"    m.name,\r\n" + 
					"    m.email,\r\n" + 
					"    m.address,\r\n" + 
					"    b.num,\r\n" + 
					"    b.title,\r\n" + 
					"    b.content\r\n" + 
					"from member01 m\r\n" + 
					"JOIN board01 b\r\n" + 
					"ON m.id = b.id\r\n" + 
					"where m.id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt .setString(1, id);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				//회원에 대한 정보
				id = rs.getString("id");
				String pw  = rs.getString("pw");
				String name  = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				
				//글에 대한 정보
				int num = rs.getInt("num");
				String title = rs.getString("title");
				String content = rs.getString("content");
				
				mb.setId(id);
				mb.setPw(pw);
				mb.setName(name);
				mb.setEmail(email);
				mb.setAddress(address);
				
				//1번 회전할 때 마다 글에 대한 정보를 list에 추가
				Board01 board = new Board01(num, null, title, content);
				list.add(board);
				
			}
			//MemberBoard에 list를 추가하는 작업
			mb.setList(list);
			System.out.println("이름:" + mb.getName());
			System.out.println("아이디:" + mb.getId());
			System.out.println("이메일:" + mb.getEmail());
			System.out.println("주소:" + mb.getAddress());
			System.out.println("크기:" + mb.getList().size());
			
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
