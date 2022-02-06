import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat(); 
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		System.out.println("------------");
		
		//��Ӱ���(extends)�̾�� Ȱ�� ����
		// �θ�� �ڽ� ���� ������(Override)�Ǿ�� ����� �����ϴ�.
		Animal ani = new Dog(); //UpCasting
		ani.eat();
		
		ani = new Cat();
		ani.eat();
//		ani.night(); //����
		
		//�� �ٷ� �ۼ��� downCasting
		Cat cc = (Cat)ani;
		cc.night();
		
		//�� �ٷ� �ۼ��� downCasting
		((Cat)ani).night(); //downCasting
	}
}