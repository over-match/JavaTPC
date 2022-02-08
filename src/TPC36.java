import kr.infrine.IntArray;

public class TPC36 {
	public static void main(String[] args) {
		
		// 정수 3개를 배열에 저장하고 출력하시오.
		int[] a = new int[3];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		int v = a[1]; // 20
		
		int len = a.length; // a의 공간의 길이를 구하는 len
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		//----------------------------------------
		
		//생성한 API를 활용한 방법 - 배열처럼 동작
		IntArray arr = new IntArray(5); // ()를 빈 공간으로 둘 경우, 10이 생성
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
