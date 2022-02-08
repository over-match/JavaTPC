import kr.poly.A;

public class TPC28 {
	public static void main(String[] args) {
		
		A a = new A();
		a.display();
//		System.out.println(a.toString());
		System.out.println(a); // Object --> toString() :kr.poly.A@2a139a55
		
		System.out.println("-----------");
		
		Object obj = new A(); // upcasting
		((A)obj).display(); 
		System.out.println(obj.toString()); 
		
	}
}
