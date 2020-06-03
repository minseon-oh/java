package api.io.folder02;

import java.io.File;

public class DeleteFileEx {

	public static void main(String[] args) {
		
		try {
			
			File file  = new File("D:\\course\\JAVA\\file_test");
			if(file.exists()) {
				file.delete(); //delete성공시 true, 실패시 false반환
				System.out.println("파일삭제에 성공하였습니다.");
			}else {
				System.out.println("존재하지 않는 파일명입니다.");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
