package day05;

import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] nameList = new String[100];
		String[] genderList = new String[100];
		String[] emailList = new String[100];
		int[] birthList = new int[100];
		
//		//현재 고객수가 몇명이 저장되었는지 알기 위한 변수 count선언
//		int count = 0;
//		//index를 조정할 변수선언
//		int index = 0;
//		
//		start: while(true) {
//			
//			System.out.println("[Info]-고객수: " + count + ", 현재위치: " + index);
//			System.out.println("[메뉴]1.Insert, 2.Prev, 3.Next, 4.Current, 5.Update, 6.Delete, 7.Quit");
//			System.out.print("메뉴번호입력>");
//			int menu = sc.nextInt();
//			
//			switch (menu) {
//			case 1:
//				System.out.println("==========고객정보입력을 시작합니다==========");
//				/*
//				 * 이름, 성별, 이메일, 출생년도를 입력받아서 각각 배열에 저장하시오.
//				 * 사람 수를 증가시킨다.
//				 */
//				System.out.print("이름>");
//				nameList[count] = sc.next();
//				System.out.print("성별>");
//				genderList[count] = sc.next();
//				System.out.print("이메일>");
//				emailList[count] = sc.next();
//				System.out.print("출생년도>");
//				birthList[count] = sc.nextInt();
//				
//				count++;
//				index++;
//				
//				break;
//			case 2:
//				System.out.println("==========이전 고객정보를 출력합니다==========");
//				/*
//				 *index가 0이하라면 "이전고객정보가 없습니다."
//				 *그렇지 않으면 index를 이동하여 이전고객정보를 출력하면됨.
//				 */
//				if(index <= 0) {
//					System.out.println("!이전 고객정보가 없습니다!");
//				}else {
//					index -= 1;
//					System.out.println("이름> " + nameList[index]);
//					System.out.println("성별> " + genderList[index]);
//					System.out.println("이메일> " + emailList[index]);
//					System.out.println("출생년도> " + birthList[index]);
//				}
//				break;
//			case 3:
//				System.out.println("==========다음 고객정보를 출력합니다==========");
//				/*
//				 * 다음 고객정보를 출력할 수 없는 조건을 생각하여 "다음 고객정보가 없습니다."
//				 * 그렇지 않으면 index를 이동하여 다음고객정보를 출력.
//				 */
//				if(index >= count-1) {
//					System.out.println("!다음 고객정보가 없습니다!");
//				}else {
//					index += 1;
//					System.out.println("이름> " + nameList[index]);
//					System.out.println("성별> " + genderList[index]);
//					System.out.println("이메일> " + emailList[index]);
//					System.out.println("출생년도> " + birthList[index]);
//				}
//				break;
//			case 4:
//				System.out.println("==========현재 고객정보를 출력합니다==========");
//				/*
//				 * 현재정보를 출력할 수 있는 조건을 생각하여 현재정보를 출력
//				 * 그렇지 않으면 현재고객정보없음 출력
//				 */
//				if(count == 0) {
//					System.out.println("!현재 고객정보가 없습니다!");
//				}else {
//					System.out.println("이름> " + nameList[index]);
//					System.out.println("성별> " + genderList[index]);
//					System.out.println("이메일> " + emailList[index]);
//					System.out.println("출생년도> " + birthList[index]);
//				}
//				break;
//			case 5:
//				System.out.println("==========현재 고객정보를 수정합니다==========");
//				/*
//				 * 현재 정보를 출력할 수 있는 조건을 생각하여
//				 * 스캐너를 통해 순서대로 이름, 성별, 이메일, 출생년도를 입력받고 배열의 값을 수정하라
//				 * 
//				 * 그렇지 않으면 수정할 데이터가 없음 출력
//				 */
//				if(count == 0) {
//					System.out.println("!수정할 고객정보가 없습니다!");
//				}else {
//					System.out.println("현재 고객: " + nameList[index]);
//					System.out.print("이름>");
//					nameList[index] = sc.next();
//					System.out.print("성별>");
//					genderList[index] = sc.next();
//					System.out.print("이메일>");
//					emailList[index] = sc.next();
//					System.out.print("출생년도>");
//					birthList[index] = sc.nextInt();
//				}
//				break;
//			case 6:
//				System.out.println("==========현재 고객정보를 삭제합니다==========");
//				/*
//				 * 현재정보를 삭제할 수 있는 조건을 생각하여 
//				 * 현재 index부터 뒤에있는 배열 요소를 당겨와 덮어씌운다.
//				 * 
//				 * 그렇지 않으면 삭제할 데이터가 존재하지 않음 출력
//				 */
//				if(count == 0) {
//					System.out.println("!삭제할 고객정보가 없습니다!");
//				}
//				for(int i=0; i<count; i++) {
//					if(index == i) {
//						System.out.println(nameList[index] + "의 고객정보를 삭제합니다.");
//						
//						for(int j=i; j<count-1; j++) {
//							nameList[j] = nameList[j+1];
//							genderList[j] = genderList[j+1];
//							emailList[j] = emailList[j+1];
//							birthList[j] = birthList[j+1];
//						}
//						count--;
//					}
//				}
//				break;
//			case 7:
//				System.out.println("==========프로그램을 종료합니다==========");
//
//				/*
//				 * 탈출, 끝내기
//				 */
//				break start;
//			default:
//				System.out.println("!메뉴를 잘못입력하였습니다!");
//				break;
//			}
//			
//			
//		}
		
		
		//쌤풀이
				int count = 0;
				int index = -1;
				
				start: while(true) {
					
					System.out.println("[Info]-고객수: " + count + ", 현재위치: " + index);
					System.out.println("[메뉴]1.Insert, 2.Prev, 3.Next, 4.Current, 5.Update, 6.Delete, 7.Quit");
					System.out.print("메뉴번호입력>");
					int menu = sc.nextInt();
					
					switch (menu) {
					case 1:
						System.out.println("==========고객정보입력을 시작합니다==========");
						/*
						 * 이름, 성별, 이메일, 출생년도를 입력받아서 각각 배열에 저장하시오.
						 * 사람 수를 증가시킨다.
						 */
						System.out.print("이름>");
						String name = sc.next();
						System.out.print("성별>");
						String gender = sc.next();
						System.out.print("이메일>");
						String email = sc.next();
						System.out.print("생년월일>");
						int birth = sc.nextInt();
						
						nameList[count] = name;
						genderList[count] = gender;
						emailList[count] = email;
						birthList[count] = birth;
						
						count++;
						System.out.println("====================================");
						
						break;
						
						
					case 2:
						System.out.println("==========이전 고객정보를 출력합니다==========");
						/*
						 *index가 0이하라면 "이전고객정보가 없습니다."
						 *그렇지 않으면 index를 이동하여 이전고객정보를 출력하면됨.
						 */
						if(index <= 0) { //이전으로 갈 수 없음
							System.out.println("이전 고객 정보가 없음");
						}else {
							index--;
							System.out.println("이름: " + nameList[index] );
							System.out.println("성별: " + genderList[index] );
							System.out.println("이메일: " + emailList[index] );
							System.out.println("생년월일: " + birthList[index] );
						}
						System.out.println("====================================");
						break;
						
						
					case 3:
						System.out.println("==========다음 고객정보를 출력합니다==========");
						/*
						 * 다음 고객정보를 출력할 수 없는 조건을 생각하여 "다음 고객정보가 없습니다."
						 * 그렇지 않으면 index를 이동하여 다음고객정보를 출력.
						 */
						
						if(index >= count-1) {
							System.out.println("다음 고객 정보가 없음");
						}else {
							index++;
							System.out.println("이름: " + nameList[index] );
							System.out.println("성별: " + genderList[index] );
							System.out.println("이메일: " + emailList[index] );
							System.out.println("생년월일: " + birthList[index] );
						}
						System.out.println("====================================");
						break;
						
						
					case 4:
						System.out.println("==========현재 고객정보를 출력합니다==========");
						/*
						 * 현재정보를 출력할 수 있는 조건을 생각하여 현재정보를 출력
						 * 그렇지 않으면 현재고객정보없음 출력
						 */
						
						if(index >= 0 && count > index) {//출력가능조건
							System.out.println("이름: " + nameList[index] );
							System.out.println("성별: " + genderList[index] );
							System.out.println("이메일: " + emailList[index] );
							System.out.println("생년월일: " + birthList[index] );
						}else {
							System.out.println("현재 고객 정보가 없음");
						}
						System.out.println("====================================");
						break;
						

					case 5:
						System.out.println("==========현재 고객정보를 수정합니다==========");
						/*
						 * 현재 정보를 출력할 수 있는 조건을 생각하여
						 * 스캐너를 통해 순서대로 이름, 성별, 이메일, 출생년도를 입력받고 배열의 값을 수정하라
						 * 
						 * 그렇지 않으면 수정할 데이터가 없음 출력
						 */
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
						System.out.println("====================================");
						break;
						
						
					case 6:
						System.out.println("==========현재 고객정보를 삭제합니다==========");
						/*
						 * 현재정보를 삭제할 수 있는 조건을 생각하여 
						 * 현재 index부터 뒤에있는 배열 요소를 당겨와 덮어씌운다.
						 * 
						 * 그렇지 않으면 삭제할 데이터가 존재하지 않음 출력
						 */
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
						System.out.println("====================================");
						break;
						
						
					case 7:
						System.out.println("==========프로그램을 종료합니다==========");
						/*
						 * 탈출, 끝내기
						 */
						
						sc.close();
						break start;
						
						
					default:
						System.out.println("!메뉴를 잘못입력하였습니다!");
						break;
					}
					
					
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
