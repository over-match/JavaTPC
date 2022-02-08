import java.util.ArrayList;
import java.util.List;

import kr.tpc.BookDTO;

public class TPC38 {
	public static void main(String[] args) {
		
//		ArrayList list = new ArrayList();
//		List list = new ArrayList(1); // Object[]
		List<BookDTO> list = new ArrayList<BookDTO>(1); // Object[] -���׸�-> BookDTO[]
		
		list.add(new BookDTO("�ڹ�", 12000, "������", 600));
		list.add(new BookDTO("C���", 72000, "������", 700));
		list.add(new BookDTO("Python", 12000, "������", 690));
		// �Ϲ������� �Ѱ��� Ÿ�Ը� �����Ѵ�.
		
		// Type safety: The method add(Object) belongs to the raw type List. 
		// References to generic type List<E> should be parameterized
		
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			BookDTO dto = (BookDTO)obj;
			
			System.out.println(dto.toString());
		}
	}
}