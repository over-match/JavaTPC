public class TPC07 {
	public static void main(String[] args) {
		
		int a = 20;
		float b = 56.7f;
		
		// a + b=?
		float v = sum(a, b); // Call By Value(��)
		System.out.println(v); // 76.7
		
		int[] arr = {1,2,3,4,5};
		// �迭�� ����=?
		int total = arrSum(arr); // Call By Reference(����, ����)
		System.out.println(total); // 15
	}

	public static float sum(int a, float b) {
		float v = a + b;
		return v;
	}
	
	private static int arrSum(int[] arr) {
		int hap = 0;
		for(int i=0; i<arr.length; i++) {
			hap+=arr[i];
		}
		return hap;
		
	}
}