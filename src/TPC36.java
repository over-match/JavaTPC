import kr.infrine.IntArray;

public class TPC36 {
	public static void main(String[] args) {
		
		// ���� 3���� �迭�� �����ϰ� ����Ͻÿ�.
		int[] a = new int[3];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		int v = a[1]; // 20
		
		int len = a.length; // a�� ������ ���̸� ���ϴ� len
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		//----------------------------------------
		
		//������ API�� Ȱ���� ��� - �迭ó�� ����
		IntArray arr = new IntArray(5); // ()�� �� �������� �� ���, 10�� ����
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}