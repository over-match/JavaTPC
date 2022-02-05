import kr.tpc.Inflearn;

public class TPC13 {
	public static void main(String[] args) {
		
//		Inflearn inf = new Inflearn();
		
		// static이 없는 instance Method 접근 방법
		Inflearn inf = new Inflearn();
		inf.tpc();
//		inf.java();
		
		// static이 붙은 class Method 접근 방법
		Inflearn.java();

		// Java API 생성자 private
//		System sys = new System();
		System.out.println("출력");
//		Math m = new Math();
		int v = Math.max(10, 20); // 두 수 중에서 최대값을 넘겨주기
		System.out.println(v); // 20
		
	}
}
