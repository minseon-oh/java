package quiz24;

public class List implements IBag{
	
	public int index = 0;
	String[] arr = new String[100];

	@Override
	public void insert(String item) {
		arr[index] = item;
		index++;
	}

	@Override
	public void print() {
		for(int i=0; i<index; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	@Override
	public int search(String item) {
		for(int i=0; i<index; i++) {
			if(arr[i].equals(item)) {
				System.out.println(item + "은 arr[" + i + "]에 있습니다");
				return i;
			}
		}
		System.out.println(item + "은 없습니다");
		return -1;
	}

	@Override
	public boolean delete(String item) {
		for(int i=0; i<index; i++) {
			if(arr[i].equals(item)) {
				System.out.println(item + "을 삭제합니다");
				for(int j=i; j<index-1; j++) {
					arr[j] = arr[j+1];
				}
				index--;
				break;
			}
		}
		return false;
	}

}
