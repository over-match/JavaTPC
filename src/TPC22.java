import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {
	public static void main(String[] args) {
		
		// upCasting
//		Cat ani = new Cat();
//		Object ani = new Cat(); //�ֻ��� Ŭ����
		
		Animal ani = new Cat(); //upCasting
		ani.eat(); // ������ ���� -> Animal, ������� -> Dog
		
//		ani.night(); //����(��������X)
		((Cat)ani).night(); //downCasting
		
		ani = new Dog();
		ani.eat();
		// ������***
		// : ����Ŭ������ ����Ŭ�������� ������ �޽����� ���� �ٸ��� ���۽�Ű�� ��ü������ �����̴�!
		
		Object o = new Dog();
		// o.eat(); //����, ��������X
		((Dog)o).eat();
	}
}