//import java.lang.String ������ ����, Java���� �����ϴ� API�̱� ����

public class TPC34 {
	public static void main(String[] args) {
		
		// String                01234....index
		String str = new String("APPLE");
		
		String v = str.toLowerCase(); // �ҹ��ڷ� ����
		System.out.println(v);

		System.out.println(str.charAt(3)); // index �ڸ�
		System.out.println(str.length()); // �� ����
		System.out.println(str.indexOf("PL"));
		System.out.println(str.indexOf("PX")); // -1
		System.out.println(str.replaceAll("P", "X")); //AXXLE
	}
}