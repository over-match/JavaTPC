import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC25 {
	public static void main(String[] args) {
		
		// eat() --재정의(override)--> eat()
		// Animal ani = new Animal(); 사용불가
		// ani.eat();
		// upcasting(부모의 역할로 사용 -> 명령을 내리는 쪽)
		Animal ani = new Dog();
		ani.eat(); // eat{?} -재정의-> eat{개}(다형성 보장O)
		ani.move(); //구현메소드 실행

		System.out.println("----------");
		
		ani = new Cat();
		ani.eat(); // eat{?} -재정의-> eat{고양이}
		ani.move(); //구현메소드 호출
		((Cat)ani).night(); //Cat class에만 있는 메소드 casting을 통해 호출
	}
}
