import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC25 {
	public static void main(String[] args) {
		
		// eat() --������(override)--> eat()
		// Animal ani = new Animal(); ���Ұ�
		// ani.eat();
		// upcasting(�θ��� ���ҷ� ��� -> ������ ������ ��)
		Animal ani = new Dog();
		ani.eat(); // eat{?} -������-> eat{��}(������ ����O)
		ani.move(); //�����޼ҵ� ����

		System.out.println("----------");
		
		ani = new Cat();
		ani.eat(); // eat{?} -������-> eat{������}
		ani.move(); //�����޼ҵ� ȣ��
		((Cat)ani).night(); //Cat class���� �ִ� �޼ҵ� casting�� ���� ȣ��
	}
}