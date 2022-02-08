package kr.infrine;

public class IntArray {
	
	private int count;
	private int[] arr;
	
	public IntArray() {
		this(10);
	}
	
	public IntArray(int init) {
		arr = new int[init]; // init�� ���� ��ŭ ����
	}
	
	public void add(int data) {
		arr[count++] = data; // count++�� �־ �ϳ��� ����
	}
	
	public int get(int index) {
		return arr[index];
	}
	
	public int size() {
		return count;
	}

}
