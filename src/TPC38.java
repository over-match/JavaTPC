import java.util.ArrayList;
import java.util.List;

import kr.tpc.BookDTO;

public class TPC38 {
	public static void main(String[] args) {
		
//		ArrayList list = new ArrayList();
//		List list = new ArrayList(1); // Object[]
		List<BookDTO> list = new ArrayList<BookDTO>(1); // Object[] -제네릭-> BookDTO[]
		
		list.add(new BookDTO("자바", 12000, "이지스", 600));
		list.add(new BookDTO("C언어", 72000, "에이콘", 700));
		list.add(new BookDTO("Python", 12000, "제이펍", 690));
		// 일반적으로 한가지 타입만 대입한다.
		
		// Type safety: The method add(Object) belongs to the raw type List. 
		// References to generic type List<E> should be parameterized
		
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			BookDTO dto = (BookDTO)obj;
			
			System.out.println(dto.toString());
		}
	}
}
