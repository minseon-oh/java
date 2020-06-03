package jdbc.basic;

import java.sql.*;
import java.util.ArrayList;

public class JDBCSelect {

	public static void main(String[] args) {
		
		/* SQL문 --TEST01--
		 create table member01(
    		id VARCHAR2(30) not null,
    		pw VARCHAR2(30),
    		name VARCHAR2(30),
    		email VARCHAR2(30),
    		address VARCHAR2(50)
		);

		alter table member01 add CONSTRAINT member01_pk PRIMARY KEY (id);
		
		insert into member01 values('kkk123','1234','홍길동','kkk123@naver.com','서울시');
		insert into member01 values('aaa123','1234','홍길순','aaa123@naver.com','경기도');
		insert into member01 values('bbb123','1234','이순신','bbb123@naver.com','부산시');

		select * from member01;
		 */
		
		//JDBC셀렉트
		
		ArrayList<Member01> list = new ArrayList<>();
		
		//1.DB연결에 필요한 접속정보를 선언
		
		String url = "JDBC:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "TEST01";
		String upw = "TEST01";
		
		//사용할 SQL문 String변수에 저장
		String sql = "select * from member01 order by id desc";
		
		//2.DB변동에 사용할 클래스변수들을 선언
		Connection conn = null; //DB연결
		PreparedStatement pstmt = null; //SQL전송객체
		ResultSet rs = null; //쿼리결과 저장객체
		
		/*
		 * java.sql패키지에 클래스들을 사용하려면, 반드시 try~catch블록 안에서 사용한다.
		 * 이유는 해당 메서드들이 모두 예외던지기 throws처리가 되어있기 때문.
		 */
		
		try {
			
			//3.Connector안에 연결드라이버를 호출
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//4.커넥션 객체 생성
			//커넥션 객체생성시에는 직접 new로 사용할 수 없고,
			//DriverManager클래스가 제공하는 getter메서드를 통해서 
			conn = DriverManager.getConnection(url, uid, upw);
			
			//5.SQL쿼리문을 실행해주는 Statement객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//6.SQL문 실행 -셀렉트 구문이라면 executeQuery(), 인서트&딜리드&업데이트 구문이라면 executeUpdate()
			rs = pstmt.executeQuery();
			
			//셀렉트구문의 쿼리결과로 데이터가 존재하면 next()메서드는 true를 반환함.
			//셀렉트구문의 실행경과를 하나씩 처리할 때, rs.getString(컬럼명), rs.getInt(컬럼명), rs.getTimeStamp(컬럼명)을 사용한다.
			while(rs.next()) {
				
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				
				System.out.println("---------------------------");
				System.out.println(id);
				System.out.println(pw);
				System.out.println(name);
				System.out.println(email);
				System.out.println(address);
				
				Member01 member = new Member01(id, pw, name, email, address);
				list.add(member);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace(); //에러로그
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
