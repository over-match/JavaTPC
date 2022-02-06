import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {
	public static void main(String[] args) {
		
		// 1. �������μ�
		Dog d = new Dog();
		display(d);
		Cat c = new Cat();
		display(c);
		
	} //upCasting

	//������ �μ�
	private static void display(Animal ani) {
		ani.eat();
		
//		ani.night(); //���� (��������X)
		if( ani instanceof Cat ) { //CatŸ������ ������ ani�� true, �ƴϸ� false
			((Cat)ani).night(); //downCasting
		}
	}
}