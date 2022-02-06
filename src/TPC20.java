import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
	public static void main(String[] args) {
		
		//��� ���� (�θ� = �ڽ�, �ڵ� ����ȯ(Object Casting)) 
		// �ڽ� -> �θ�(UpCasting)
		
		//���1.
		// Animal �θ�Ŭ������ ������� ����
		Dog d = new Dog();  
		d.eat(); // ? -> �������� ������� �Դ´�.
		
		Cat c = new Cat();
		c.eat(); // ? -> �����̴� ������ �Դ´�.
		c.night();
		
		System.out.println("----------------");
		
		//���2. ***
		// Dog.class, Cat.class -> �����ڰ� �ƴϱ� ������ � ������ �ִ��� ��
		Animal ani;
		
		ani = new Dog();
		ani.eat();

		ani = new Cat();
		ani.eat();
//		ani.night(); //Animal�� ���� �޼ҵ�
		((Cat)ani).night(); //�㿡 ������ ���̳���. --> down casting(��������ȯ)
	}
}