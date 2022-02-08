
public class TPC35 {
	public static void main(String[] args) {
		
		// Heap Area
		String str1 = new String("APPLE");
		String str2 = new String("APPLE");
		
		if(str1==str2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		} 
		// 결과: NO -> 서로 다른 번지로 다른 영역을 가리킴
		
		if(str1.equals(str2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		// 결과: YES -> 서로의 객체를 비교하여 같다는 결과가 나옴
		
		//-----------------------------------------------
		
		//Literal Pool
		String str3 = "APPLE";
		String str4 = "APPLE";
		
		if(str3==str4) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		} 
		// 결과: YES
		
		if(str3.equals(str4)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		// 결과: YES
	}
}
