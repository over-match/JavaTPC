import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtil;

//import.java.lang.*;
public class TPC18 {
	public static void main(String[] args) {
		
		// 1. Java���� �������ִ� class��... -> API
		// ���ڿ�(String)
		String str = new String("APPLE");
		System.out.println(str.toLowerCase()); // �빮�� -> �ҹ��� ���, apple
		
		// 2. ���� ���� ����ϴ� class��... DTO/VO, DAO, Utility .. API
		MyUtil my = new MyUtil();
		int sum = my.hap();
		
		System.out.println(sum);
		
		// 3. �ٸ� ȸ�翡�� ������ �� class��... API
		// Gson -> json : https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.2
		Gson gson = new Gson();
		
		BookVO vo = new BookVO("�ڹ�", 13000, "����", 800);
		String json = gson.toJson(vo);

		// {"title":"�ڹ�","price":13000,"company":"����","page":800}
		// -> ���ڿ� ���·� �ٲ��ִ� Gson API
		System.out.println(json);
	}
}