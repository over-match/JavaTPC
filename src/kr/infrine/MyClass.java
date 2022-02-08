package kr.infrine;

// default 생성자가 생략되어 있는 상태 
//class MyClass { // 외부에서 사용할 수 없는 접근제한자
public class MyClass {
	public int sum(int a, int b) {
		int hap = 0;
		for(int i=a; i<=b; i++) {
			hap+=i;
		}
		return hap;
	}
}
