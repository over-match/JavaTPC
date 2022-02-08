//import java.lang.String 생략된 상태, Java에서 제공하는 API이기 때문

public class TPC34 {
	public static void main(String[] args) {
		
		// String                01234....index
		String str = new String("APPLE");
		
		String v = str.toLowerCase(); // 소문자로 변경
		System.out.println(v);

		System.out.println(str.charAt(3)); // index 자리
		System.out.println(str.length()); // 총 길이
		System.out.println(str.indexOf("PL"));
		System.out.println(str.indexOf("PX")); // -1
		System.out.println(str.replaceAll("P", "X")); //AXXLE
	}
}
