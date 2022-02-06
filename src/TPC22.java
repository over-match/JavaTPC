import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {
	public static void main(String[] args) {
		
		//upCasting
//		Cat ani = new Cat();
//		Object ani = new Cat(); //최상위 클래스
		
		Animal ani = new Cat(); //upCasting
		ani.eat(); // 컴파일 시점 -> Animal, 실행시점 -> Dog
		
//		ani.night(); //에러(존재하지X)
		((Cat)ani).night(); //downCasting
		
		ani = new Dog();
		ani.eat();
		// 다형성***
		// : 상위클래스가 하위클래스에게 동일한 메시지로 서로 다르게 동작시키는 객체지향의 원리이다!
		
		Object o = new Dog();
		// o.eat(); //에러, 존재하지X
		((Dog)o).eat();
	}
}
