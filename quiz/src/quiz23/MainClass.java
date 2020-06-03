package quiz23;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		/*
		 * 인터페이스형으로 선언하고 무한반복문 안에서
		 * 음악을 추가하는 기능
		 * 재생기능
		 * 종료기능
		 */
		Scanner sc  = new Scanner(System.in);
		SongList song = new MelonMusic();

		System.out.println("---음악사이트를 선택하세요---");
		System.out.println("1)MelonMusic 2)BugsMusic");
		System.out.print(">");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("MelonMusic을 실행합니다");
		}else if(num == 2) {
			System.out.println("BugsMusic을 실행합니다");
			song = new BugsMusic();
		}
		
		while(true) {
			System.out.println("---메뉴를 선택하세요---");
			System.out.println("1)음악추가    2)음악재생    3)종료");
			System.out.print(">");
			int num2 = sc.nextInt();
			
			if(num2 == 1) {
				System.out.println("추가할 음악을 입력하세요");
				System.out.println("음악 추가를 끝내려면 '그만'을 입력하세요");
				while(true) {
					System.out.println(">");
					String music = sc.next();
					if(music.equals("그만")) {
						break;
					}
					song.insertList(music);
					song.playLength();
				}
			}else if(num2 == 2) {
				song.playList();
				song.playLength();
			}else if(num2 == 3) {
				System.out.println("---종료합니다---");
				break;
			}else {
				System.out.println("잘못 입력 하였습니다");
			}
		}
	}

}

