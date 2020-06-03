package quiz23;

import java.util.Arrays;

public class BugsMusic implements SongList{
	
	private String[] list = new String[100];
	private int count  = 0;
	
	/*
	 * SogListㅇ인터페이스를 상속받아서 기능을 구현
	 * 내용은 마음대로
	 * 
	 */
	
	@Override
	public void insertList(String song) {
		System.out.println("---Bugs Music---");
		System.out.println(song + "음악을 저장합니다");
		list[count] = song;
		count++;
	}
	@Override
	public void playList() {
		for(int i=0; i<count; i++) {
			int r = (int)(Math.random() * count);
			System.out.println("랜덤재생: " + list[r]);
		}
	}
	@Override
	public int playLength() {
		System.out.print("저장된 목록: ");
		for(int j=0; j<count; j++) {
			System.out.print(list[j] + " ");
		}
		System.out.println();
		System.out.println("저장된 개수: " + count);
		return count;
	}

}
