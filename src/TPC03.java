import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	public static void main(String[] args) {
		// ���踦 �����϶�. PDT VS UDDT
		// ���� 1���� �����ϱ� ���� ������ �����Ͻÿ�.
		int a;
		a=10;
		
		// å 1���� �����ϱ� ���� ������ �����Ͻÿ�.
		Book b;
		b = new Book(); //��ü ����
		
		b.title="�ڹ�";
		b.price=15000;
		b.company="�Ѻ��̵��";
		b.page=700;
		
		System.out.print(b.title+"\t");
		System.out.print(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.println(b.page);
		
		PersonVO p;
		p = new PersonVO();
		
		p.name="������ġ";
		p.age=20;
		p.weight=50.5f;
		p.height=160.8f;
		
		System.out.print(p.name+"\t");
		System.out.print(p.age+"\t");
		System.out.print(p.weight+"\t");
		System.out.println(p.height);
				
	}
}