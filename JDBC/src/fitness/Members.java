package fitness;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.List;
import java.util.ArrayList;

public class Members implements Fitness01{
	
	ArrayList<Members> list1 = new ArrayList<>();
	ArrayList<Members> list2 = new ArrayList<>();
	ArrayList<Members> list3 = new ArrayList<>();
	
	private String mem_id;
	private String mem_name;
	private String mem_phone;
	private String mem_address;
	private String sql;
	private String class_name;

	
	
	


	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public Members() {
		
	}
	
	 public Members(String mem_id, String mem_name, String mem_phone, String mem_address) {
	      super();
	      this.mem_id = mem_id;
	      this.mem_name = mem_name;
	      this.mem_phone = mem_phone;
	      this.mem_address = mem_address;
	   }
	   

	   public Members(String mem_id, String mem_name, String mem_phone) {
	      super();
	      this.mem_id = mem_id;
	      this.mem_name = mem_name;
	      this.mem_phone = mem_phone;
	   }
	   
	   
	


	public Members(String mem_name, String mem_phone) {
		super();
		this.mem_name = mem_name;
		this.mem_phone = mem_phone;
	}

	@Override
	public void showPointUI() {
		
		System.out.printf("%10s%10s%20s%10s%10s\n","회원번호","회원이름","핸드폰", "주소", "강의");
		System.out.println("==========================================================================");
		
	}
	
	@Override
	public void input() {
		
		Members m = new Members();
		
		//정보등록
		System.out.println("등록할 항목을 입력하세요");
		System.out.println("1. 회원");
		System.out.println("2. 직원");
		System.out.println("3. 수업");
		System.out.print(">");
		int menu = sc.nextInt();
		
		
		
		if(menu == 1) {//회원
			sql = "insert into member VALUES (?,?,?,?,?)";
			System.out.print("아이디>");
			mem_id = sc.next();
			System.out.print("이름>");
			mem_name = sc.next();
			System.out.print("핸드폰번호>");
			mem_phone = sc.next();
			System.out.print("주소>");
			mem_address = sc.next();
			
			System.out.println("현재 강의");
			System.out.println(list3.size());

			for(int i = 0; i < list3.size() ; i++) {
				System.out.println("==============");
				System.out.println("강의 이름 : " + list3.get(i).getMem_name());
				System.out.println("강의실 : " + list3.get(i).getMem_phone());
			}

			System.out.print("강의 이름>");
			this.class_name = sc.next();
			
			end : for(int j = 0; j < list3.size(); j++) {
				if(list3.get(j).getMem_name().equals(class_name)) {
					System.out.println("정상등록 되었습니다.");
					break end;
				}else {
					System.out.println("등록된 아이디가 없습니다.");
					
				}
			}

			
		}else if(menu == 2) {//직원
			this.sql = "insert into employees VALUES (e_seq.nextval,?,?,?,?)";
			System.out.print("이름>");
			this.mem_name = sc.next();
			System.out.print("핸드폰번호>");
			this.mem_phone = sc.next();
			System.out.print("주소>");
			this.mem_address = sc.next();
			
			System.out.println("현재 강의");
			System.out.println(list3.size());

			for(int i = 0; i < list3.size() ; i++) {
				System.out.println("==============");
				System.out.println("강의 이름 : " + list3.get(i).getMem_name());
				System.out.println("강의실 : " + list3.get(i).getMem_phone());
			}

			System.out.print("강의 이름>");
			this.class_name = sc.next();
			
			end1 : for(int j = 0; j < list3.size(); j++) {
				if(list3.get(j).getMem_name().equals(class_name)) {
					System.out.println("정상등록 되었습니다.");
					break end1;
				}else {
					System.out.println("등록된 강의가 없습니다.");
					
				}
			}
			
		}else if(menu == 3) {//수업
			this.sql = "insert into class01 member VALUES (class01_seq.nextval,?,?)";
			System.out.print("수업이름>");
			this.mem_name = sc.next();
			System.out.print("룸이름>");
			this.mem_phone = sc.next();
		}else {
			System.out.println("메뉴를 잘못입력하였습니다");
			return;
		}

		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			this.conn = DriverManager.getConnection(url, uid, upw);
			this.pstmt = conn.prepareStatement(sql);

				if(menu == 1) {
					pstmt.setString(1, mem_id);
					pstmt.setString(2, mem_name);
					pstmt.setString(3, mem_phone);
					pstmt.setString(4, mem_address);
					pstmt.setString(5, class_name);
				
				}else if(menu == 2) {
					pstmt.setString(1, mem_name);
					pstmt.setString(2, mem_phone);
					pstmt.setString(3, mem_address);
					pstmt.setString(4, class_name);
					
				}else if(menu == 3) {
					pstmt.setString(1, mem_name);
					pstmt.setString(2, mem_phone);
					
					Members members = new Members(mem_name, mem_phone);
					list3.add(members);
					

				}
		
		
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("정상등록되었습니다");
			}else {
				System.out.println("등록불가합니다");
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
	@Override
	public void showAll() {
		//회원전체조회
		  System.out.println("전체조회할 항목을 입력하세요");
	         System.out.println("1. 회원");
	         System.out.println("2. 직원");
	         System.out.println("3. 수업");
	         System.out.print(">");
	         int menu = sc.nextInt();
	         
	         if(menu == 1) {//회원
	            
	            System.out.println("회원 전체 정보를 등록된 회원 순서대로 출력합니다.");
	               sql = " select mem_id, name, phone, address, m.class_name\r\n" + 
	                     " from member m\r\n" + 
	                     " LEFT OUTER JOIN class01 c\r\n" + 
	                     " ON m.class_name = c.class_name";

	            }else if(menu == 2) {//직원
	               
	               System.out.println("직원 전체 정보를 등록된 직원 순서대로 출력합니다.");
	               
	               sql = " select em_no, em_name, em_phone, em_address, e.class_name \r\n" + 
	                     " from  employees e\r\n" + 
	                     " LEFT OUTER JOIN class01 c\r\n" + 
	                     " ON e.class_name = c.class_name";

	            }else if(menu == 3) {//수업
	               
	               System.out.println("수업 전체 정보를 등록된 수업 순서대로 출력합니다.");

	               sql = " select * from class01";

	            }else {
	               System.out.println("메뉴를 잘못 입력하셨습니다.");
	               return;
	            }

	      
	      try {
	         
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         
	         conn = DriverManager.getConnection(url, uid, upw);
	         pstmt = conn.prepareStatement(sql);
	         rs =pstmt.executeQuery();
	         
	         while(rs.next()) {
	            
	            if(menu == 1) {

	               System.out.printf("%10s%10s%20s%10s%10s\n","회원번호","회원이름","핸드폰", "주소", "강의이름");
	               System.out.println("==========================================================================");
	               System.out.printf("%10s%20s%20s%20s%15s\n",this.rs.getString("mem_id"), this.rs.getString("name"), this.rs.getString("phone"), this.rs.getString("address"), this.rs.getString("class_name"));
	            
	               Members member = new Members(rs.getString("mem_id"), rs.getString("name"), rs.getString("phone"), rs.getString("address"));
	               list1.add(member);
	               
	            }else if(menu == 2) {
	               System.out.printf("%10s%10s%20s%10s\n","직원번호","직원이름","핸드폰", "주소", "강의이름");
	               System.out.println("==========================================================================");
	               System.out.printf("%10s%20s%20s%15s\n",rs.getInt("em_no"), rs.getString("em_name"), rs.getString("em_phone"), rs.getString("em_address"), this.rs.getString("class_name"));
	         
	               Members member = new Members(rs.getString("em_no"), rs.getString("em_name"), rs.getString("em_phone"), rs.getString("em_address"));
	               list2.add(member);
	            
	            }else if(menu == 3) {
	               System.out.printf("%10s%10s%10s\n","강의번호","수업이름","강의장");
	               System.out.println("===============================");
	               System.out.printf("%10s%20s%15s\n",rs.getInt("class_no"), rs.getString("class_name"), rs.getString("class_room"));
	            
	               Members member = new Members(rs.getString("class_no"), rs.getString("class_name"), rs.getString("class_room"));
	               list3.add(member);
	            
	            }

	            
	         }// end while

	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
	         try {
	            if(conn != null) conn.close();
	            if(pstmt != null) pstmt.close();
	            if(rs != null) rs.close();
	         } catch (Exception e2) {
	            // TODO: handle exception
	         }
	      }
	      

		
	}
	@Override
	public void search() {
		//정보 조회
		System.out.println("조회할 항목을 입력하세요");
	      System.out.println("1. 회원");
	      System.out.println("2. 직원");
	      System.out.println("3. 수업");
	      System.out.print(">");
	      int menu = sc.nextInt();

	      if(menu == 1) {

	         System.out.println("[특정 회원의 정보 조회]");
	         System.out.println("[회원 구별 방법] : [1]. 이름, [2]. id ");
	         try {

	            System.out.print("선택 > ");

	            int ch = sc.nextInt();
	            if(ch == 1) {
	               System.out.print("회원이름 입력 > ");
	               String name = sc.next();

	               this.sql = "select * from member where name = ?";
	               
	               Class.forName("oracle.jdbc.driver.OracleDriver");

	               conn = DriverManager.getConnection(url,uid,upw);
	               pstmt = conn.prepareStatement(this.sql);
	               pstmt.setString(1, name);

	               rs = pstmt.executeQuery();

	               while(rs.next()) {
	                  String mem_name = rs.getString("name");


	                  System.out.printf("%10s%10s%20s%10s%10s\n","회원번호","회원이름","핸드폰", "주소", "강의");
		               System.out.println("=================================================================");
	                  System.out.printf("%10s%10s%20s%10s%10s\n",rs.getString("mem_id"), rs.getString("name"), rs.getString("phone"), 
	                        rs.getString("address"),rs.getString("class_name"));
	               } // end while
	            }else if(ch == 2) {
	               System.out.println("아이디>");
	               String id = sc.next();

	               this.sql = "select * from member where mem_id = ?";
	               Class.forName("oracle.jdbc.driver.OracleDriver");
	               conn = DriverManager.getConnection(url,uid,upw);
	               pstmt = conn.prepareStatement(this.sql);
	               pstmt.setString(1, id);
	               rs = pstmt.executeQuery();

	               while(rs.next()) {
	                  String mem_id = rs.getString("mem_id");
	                  System.out.println(mem_id);
	                  System.out.printf("%10s%10s%20s%10s%10s\n","회원번호","회원이름","핸드폰", "주소", "강의");
		               System.out.println("=================================================================");
		               System.out.printf("%10s%10s%20s%10s%10s\n",rs.getString("mem_id"), rs.getString("name"), rs.getString("phone"), 
		                     rs.getString("address"),rs.getString("class_name"));

	               }

	              
	            }else {
	               System.out.println("등록되지 않은 id 이거나 id의 형식이 잘못되었습니다. 메뉴환경으로 이동합니다.");
	            }


	         } catch (Exception e) {
	            e.printStackTrace();

	            System.out.println("menu를 입력해주세요.");
	         }finally {
	            try {
	               if(conn != null) conn.close();
	               if(pstmt != null) pstmt.close();
	               if(rs != null) rs.close();
	            } catch (Exception e2) {
	               // TODO: handle exception
	            }
	         }

	      }else if(menu ==2 ) {

	         System.out.println("[특정 직원의 정보 조회]");
	         System.out.println("[직원 구별 방법] : [1]. 이름, [2]. 휴대폰번호 ");


	         try {

	            System.out.print("선택 > ");
	            int ch = sc.nextInt();

	            if(ch == 1) {
	               System.out.print("직원이름 입력 > ");
	               String name = sc.next();

	               this.sql = "select * from employees where em_name = ?";
	               Class.forName("oracle.jdbc.driver.OracleDriver");

	               conn = DriverManager.getConnection(url,uid,upw);
	               pstmt = conn.prepareStatement(this.sql);
	               pstmt.setString(1, name);
	               rs = pstmt.executeQuery();

	               while(rs.next()) {
	                  String mem_name = rs.getString("em_name");
	                  System.out.printf("%10s%10s%20s%10s%10s\n","직원번호","직원이름","직원핸드폰", "직원주소", "강의");
		               System.out.println("=================================================================");
		               System.out.printf("%10s%10s%20s%10s%10s\n",rs.getString("em_no"), rs.getString("em_name"), rs.getString("em_phone"), 
		                     rs.getString("em_address"),rs.getString("class_name"));
	
	               }
	             
	            }else  if(ch == 2) {
	               System.out.print("휴대폰번호 입력 > ");
	               String phone = sc.next();

	               this.sql = "select * from employees where em_phone = ?";
	               
	               Class.forName("oracle.jdbc.driver.OracleDriver");

	               conn = DriverManager.getConnection(url,uid,upw);
	               pstmt = conn.prepareStatement(this.sql);
	               pstmt.setString(1, phone);
	               rs = pstmt.executeQuery();
	               
	               while(rs.next()) {


	                  System.out.printf("%10s%10s%20s%10s%10s\n","직원번호","직원이름","직원핸드폰", "직원주소", "강의");
		               System.out.println("=================================================================");
		               System.out.printf("%10s%10s%20s%10s%10s\n",rs.getString("em_no"), rs.getString("em_name"), rs.getString("em_phone"), 
		                     rs.getString("em_address"),rs.getString("class_name"));
	               }
	            
	            }else {
	               System.out.println("직원 등록되지 않았거나 휴대폰번호가 잘못되었습니다. 메뉴환경으로 이동합니다.");
	            }

	         } catch (Exception e) {
	            e.printStackTrace();
	         }finally {
	            try {
	               if(conn != null) conn.close();
	               if(pstmt != null) pstmt.close();
	               if(rs != null) rs.close();
	            } catch (Exception e2) {
	               // TODO: handle exception
	            } 
	         }
	      }else if(menu == 3) {

	         System.out.println("[특정 수업의 정보 조회]");
	         System.out.println("[수업 구별 방법] : [1]. 수업, [2]. 룸이름 ");


	         try {

	            System.out.print("선택 > ");
	            int ch = sc.nextInt();

	            if(ch == 1) {
	               System.out.print("수업 입력 > ");
	               String name = sc.next();

	               this.sql = "select * from  class01 where class_name= ?";
	               Class.forName("oracle.jdbc.driver.OracleDriver");

	               conn = DriverManager.getConnection(url,uid,upw);
	               pstmt = conn.prepareStatement(this.sql);
	               pstmt.setString(1, name);
	               rs = pstmt.executeQuery();

	               while(rs.next()) {
	                  String class_name = rs.getString("class_name");


	                  System.out.printf("%10s%10s%20s\n","수업번호","수업이름","강의장");
	                  System.out.println("==========================================================================");
	                  System.out.printf("%10s%10s%20s\n",rs.getString("class_no"), rs.getString("class_name"), rs.getString("class_room"));

	               }
	            }else if(ch == 2) {

	               System.out.print("강의장 입력 > ");
	               String roomname = sc.next();

	               this.sql = "select * from class01 where class_room= ?";
	               Class.forName("oracle.jdbc.driver.OracleDriver");

	               conn = DriverManager.getConnection(url,uid,upw);
	               pstmt = conn.prepareStatement(this.sql);
	               pstmt.setString(1, roomname);
	               rs = pstmt.executeQuery();

	               while(rs.next()) {
	                  String class_room = rs.getString("class_room");

	                  System.out.printf("%10s%10s%20s\n","수업번호","수업이름","강의장");
		               System.out.println("==========================================================================");
		               System.out.printf("%10s%10s%20s\n",rs.getString("class_no"), rs.getString("class_name"), rs.getString("class_room"));
	               }
	               
	             
	            }else {
	               System.out.println("강의장이 등록되지 않았거나 이름 잘못되었습니다. 메뉴환경으로 이동합니다");
	            }
	            
	         }catch (Exception e){
	            e.printStackTrace();
	         }finally {
	            try {
	               if( conn != null)conn.close();
	               if( pstmt != null)pstmt.close();
	               if( rs != null)rs.close();
	            } catch (Exception e2) {
	               // TODO: handle exception
	            }
	         }
	      }



		
	}
	@Override 
	public void modify() {
		
		//정보수정
	      System.out.println("수정할 항목을 입력하세요");
	      System.out.println("1. 회원");
	      System.out.println("2. 직원");
	      System.out.println("3. 수업");
	      System.out.print(">");
	      int menu = sc.nextInt();
	      
	      if(menu == 1) {//회원
	         this.sql = "update member set name = ?, phone = ?, address = ?, class_name = ? where mem_id = ?";
	         System.out.print("아이디>");
	         this.mem_id = sc.next();
	         
	         System.out.println("수정할 내용을 입력하세요");
	         System.out.print("이름");
	         this.mem_name = sc.next();
	         System.out.print("핸드폰번호>");
	         this.mem_phone = sc.next();
	         System.out.print("주소>");
	         this.mem_address = sc.next();
	         System.out.print("강의>");
	         this.class_name = sc.next();
	         
	      }else if(menu == 2) {//직원
	         this.sql = "update employees set em_name = ?, em_phone = ?, em_address = ?, class_name = ? where em_no = ?";
	         System.out.print("직원번호>");
	         this.mem_id = sc.next();
	         
	         System.out.println("수정할 내용을 입력하세요");
	         System.out.print("이름");
	         this.mem_name = sc.next();
	         System.out.print("핸드폰번호>");
	         this.mem_phone = sc.next();
	         System.out.print("주소>");
	         this.mem_address = sc.next();
	         System.out.print("강의>");
	         this.class_name = sc.next();
	      
	      }else if(menu == 3) {//수업
	         this.sql = "update class01 set class_name = ?, class_room = ? where class_no = ?";
	         System.out.print("수업번호>");
	         this.mem_id = sc.next();
	         
	         System.out.println("수정할 내용을 입력하세요");
	         System.out.print("수업이름>");
	         this.mem_name = sc.next();
	         System.out.print("룸이름>");
	         this.mem_phone = sc.next();
	         
	      }else {
	         System.out.println("메뉴를 잘못입력하였습니다");
	         return;
	      }
	      
	      
	      
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         this.conn = DriverManager.getConnection(url, uid, upw);
	         this.pstmt = conn.prepareStatement(sql);
	         
	         if(menu == 1) {
	            pstmt.setString(1, mem_name);
	            pstmt.setString(2, mem_phone);
	            pstmt.setString(3, mem_address);
	            pstmt.setString(4, class_name);
	            pstmt.setString(5, mem_id);
	         }else if(menu == 2) {
	            pstmt.setString(1, mem_name);
	            pstmt.setString(2, mem_phone);
	            pstmt.setString(3, mem_address);
	            pstmt.setString(4, class_name);
	            pstmt.setString(5, mem_id);
	         }else if(menu == 3) {
	            pstmt.setString(1, mem_name);
	            pstmt.setString(2, mem_phone);
	            pstmt.setString(3, mem_id);
	         }
	         
	         int result = pstmt.executeUpdate();
	         
	         if(result == 1) {
	            System.out.println("정상수정되었습니다");
	         }else {
	            System.out.println("등록불가합니다");
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
	@Override
	public void delete() {
		
		//정보삭제
		System.out.println("삭제할 항목을 입력하세요");
		System.out.println("1. 회원");
		System.out.println("2. 직원");
		System.out.println("3. 수업");
		System.out.print(">");
		int menu = sc.nextInt();
		
		if(menu == 1) {//회원
			this.sql = "delete from member where mem_id = ?";
			
			System.out.print("삭제할 아이디>");
			this.mem_id = sc.next();

		}else if(menu == 2) {//직원
			this.sql = "delete from employees where em_no = ?";
			
			System.out.print("삭제할 직원번호>");
			this.mem_id = sc.next();
			
		}else if(menu == 3) {//수업
			this.sql = "delete from class01 where class_no = ?";
			
			System.out.print("삭제할 수업번호>");
			this.mem_id = sc.next();
			
		}else {
			System.out.println("메뉴를 잘못입력하였습니다");
			return;
		}
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			this.conn = DriverManager.getConnection(url, uid, upw);
			this.pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem_id);
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) {
				System.out.println("정상삭제되었습니다");
			}else {
				System.out.println("등록불가합니다");
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
	
	//게터세터
	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public String getMem_phone() {
		return mem_phone;
	}

	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}

	public String getMem_address() {
		return mem_address;
	}

	public void setMem_address(String mem_address) {
		this.mem_address = mem_address;
	}

	public String getSql() {
		return sql;
	}

	public void setMem_sql(String mem_sql) {
		this.sql = sql;
	}
	
	

}
