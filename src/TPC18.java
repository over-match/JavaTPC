import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtil;

//import.java.lang.*;
public class TPC18 {
	public static void main(String[] args) {
		
		// 1. Java에서 제공해주는 class들... -> API
		// 문자열(String)
		String str = new String("APPLE");
		System.out.println(str.toLowerCase()); // 대문자 -> 소문자 출력, apple
		
		// 2. 직접 만들어서 사용하는 class들... DTO/VO, DAO, Utility .. API
		MyUtil my = new MyUtil();
		int sum = my.hap();
		
		System.out.println(sum);
		
		// 3. 다른 회사에서 생성해 둔 class들... API
		// Gson -> json : https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.2
		Gson gson = new Gson();
		
		BookVO vo = new BookVO("자바", 13000, "영진", 800);
		String json = gson.toJson(vo);

		// {"title":"자바","price":13000,"company":"영진","page":800}
		// -> 문자열 형태로 바꿔주는 Gson API
		System.out.println(json);
	}
}
