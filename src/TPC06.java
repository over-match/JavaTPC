public class TPC06 {
	public static void main(String[] args) {
		// 5. �޼ҵ� -> ����(���), ���(function)
		int a = 67;
		int b = 98;
		
		//a+b=?
		int result = sum(a, b);
		System.out.println(result);
		
		//10, 20, 30
		int[] arr = makeArr();
		int hap = 0;
		for(int i=0; i<arr.length; i++) {
			hap += arr[i];
		}
		System.out.println(hap);
	}
	
	// ���� 2���� �Ű������� �޾Ƽ� ������ ���Ͽ� �����ϴ� �޼ҵ带 �����Ͻÿ�.
	public static int sum(int a, int b) {
		int v = a+b;
		
		return v;
	}
	
	// 10, 20, 30�� �����ϰ� ���� ���
	public static int[] makeArr() {
		int x = 10;
		int y = 20;
		int z = 30;
		
		int[] arr = new int[3];
		arr[0] = x;
		arr[1] = y;
		arr[2] = z;
		
//		return x, y, z; //���� ���� ������ �� ����! �� ���� ������ �� �ִ�.
		return arr;
	}
}