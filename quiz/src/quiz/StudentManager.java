package quiz;

import java.util.Scanner;

public class StudentManager {
	
	//프로그램 전체에서 사용할 변수를 클래스 바로 아래에 선언.
	static Scanner sc = new Scanner(System.in);
	static String[] nameList = new String[100];
	static String[] genderList = new String[100];
	static String[] emailList = new String[100];
	static int[] birthList = new int[100];
	
	static int count = 0;
	static int index = -1;

	public static void main(String[] args) {
		
		start: while(true) {
			
			System.out.println("[Info]-고객수: " + count + ", 현재위치: " + index);
			System.out.println("[메뉴]1.Insert, 2.Prev, 3.Next, 4.Current, 5.Update, 6.Delete, 7.Quit");
			System.out.print("메뉴번호입력>");
			int menu = sc.nextInt();
			System.out.println("====================================");
			
			switch(menu) {
			case 1:
				insertData();
				break;
			case 2:
				System.out.println("==========이전 고객정보를 출력합니다==========");
				if(index <= 0) { //이전으로 갈 수 없음
					System.out.println("이전 고객 정보가 없음");
				}else {
					index--;
					printData(index);
				}
				break;
			case 3:
				System.out.println("==========다음 고객정보를 출력합니다==========");
				if(index >= count-1) {
					System.out.println("다음 고객 정보가 없음");
				}else {
					index++;
					printData(index);
				}	
				break;
			case 4:
				System.out.println("==========현재 고객정보를 출력합니다==========");
				if(index >= 0 && count > index) {
					printData(index);
				}else {
					System.out.println("현재 고객 정보가 없음");
				}
				break;
			case 5:
				updateData(index);
				break;
			case 6:
				deleteData(index);
				break;
			case 7:
				System.out.println("==========프로그램을 종료합니다==========");
				sc.close();
				break start;
			default:
				System.out.println("!메뉴를 잘못입력하였습니다!");
				break;
			}

		}
		
	}//main
		
		//고객정보를 입력받는 메서드
		static void insertData() {
			System.out.println("==========고객정보입력을 시작합니다==========");
			System.out.print("이름>");
			nameList[count] = sc.next();
			System.out.print("성별>");
			genderList[count] = sc.next();
			System.out.print("이메일>");
			emailList[count] = sc.next();
			System.out.print("생년월일>");
			birthList[count] = sc.nextInt();
			count++;
		}//insertData
		
		//고객정보를 출력해주는 메서드
		static void printData(int index) {
				System.out.println("이름: " + nameList[index] );
				System.out.println("성별: " + genderList[index] );
				System.out.println("이메일: " + emailList[index] );
				System.out.println("생년월일: " + birthList[index] );
		}//printData
		
		//고객정보를 수정해주는 메서드
		static void updateData(int index) {
			System.out.println("==========현재 고객정보를 수정합니다==========");
			if(index >= 0 && index < count) {
				
				System.out.print("이름(" + nameList[index] + "): ");
				nameList[index] = sc.next();
				System.out.print("성별(" + genderList[index] + "): ");
				genderList[index] = sc.next();
				System.out.print("이메일(" + emailList[index] + "): ");
				emailList[index] = sc.next();
				System.out.print("생년월일(" + birthList[index] + "): ");
				birthList[index] = sc.nextInt();
				
			}else {
				System.out.println("수정할 고객 정보가 없음");
			}
		}//updateData
		
		//고객정보를 삭제해주는 메서드
		static void deleteData(int index) {
			System.out.println("==========현재 고객정보를 삭제합니다==========");
			if(index >= 0 && index < count) {
				
				System.out.println(nameList[index] + "의 정보를 삭제합니다.");
				for(int i=index; i<count-1; i++) {
					nameList[i] = nameList[i+1];
					genderList[i] = genderList[i+1];
					emailList[i] = emailList[i+1];
					birthList[i] = birthList[i+1];
				}
				count--;
				
			}else {
				System.out.println("삭제할 고객 정보가 없음");
			}
		}//deleteData
		
	
	
	
}
