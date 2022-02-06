import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {
	public static void main(String[] args) {
		
		// 1. 다형성인수
		Dog d = new Dog();
		display(d);
		Cat c = new Cat();
		display(c);
		
	} //upCasting

	//다형성 인수
	private static void display(Animal ani) {
		ani.eat();
		
//		ani.night(); //에러 (존재하지X)
		if( ani instanceof Cat ) { //Cat타입으로 만들어면 ani면 true, 아니면 false
			((Cat)ani).night(); //downCasting
		}
	}
}
