public class TPC06 {
	public static void main(String[] args) {
		// 5. 메소드 -> 동작(방법), 기능(function)
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
	
	// 정수 2개를 매개변수로 받아서 총합을 구하여 리턴하는 메소드를 정의하시오.
	public static int sum(int a, int b) {
		int v = a+b;
		
		return v;
	}
	
	// 10, 20, 30을 리턴하고 싶은 경우
	public static int[] makeArr() {
		int x = 10;
		int y = 20;
		int z = 30;
		
		int[] arr = new int[3];
		arr[0] = x;
		arr[1] = y;
		arr[2] = z;
		
//		return x, y, z; //여러 개를 리턴할 수 없음! 한 개만 리턴할 수 있다.
		return arr;
	}
}
