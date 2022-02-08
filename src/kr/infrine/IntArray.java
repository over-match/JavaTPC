package kr.infrine;

public class IntArray {
	
	private int count;
	private int[] arr;
	
	public IntArray() {
		this(10);
	}
	
	public IntArray(int init) {
		arr = new int[init]; // init의 개수 만큼 생성
	}
	
	public void add(int data) {
		arr[count++] = data; // count++를 넣어서 하나씩 증가
	}
	
	public int get(int index) {
		return arr[index];
	}
	
	public int size() {
		return count;
	}

}

