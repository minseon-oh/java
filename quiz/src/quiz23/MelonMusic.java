package quiz23;

import java.util.Arrays;

public class MelonMusic implements SongList{
	
	private String[] list = new String[100];
	private int count  = 0;
	
	/*
	 * SogListㅇ인터페이스를 상속받아서 기능을 구현
	 * insertList() 는 list배열에 순서대로 저장
	 * playList()는 list의 음악을 랜덤하게 출력
	 * playLength()는 저장된 음악의 개수를 반환
	 * 
	 */
	
	@Override
	public void insertList(String song) {
		System.out.println("---Melon Music---");
		System.out.println(song + "음악을 저장합니다");
		list[count] = song;
		count++;
	}
	@Override
	public void playList() {
		int[] temp = new int[100];
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
