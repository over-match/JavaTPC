import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
	public static void main(String[] args) {
		
		//상속 관계 (부모 = 자식, 자동 형변환(Object Casting)) 
		// 자식 -> 부모(UpCasting)
		
		//경우1.
		// Animal 부모클래스를 사용하지 않음
		Dog d = new Dog();  
		d.eat(); // ? -> 강아지는 허겁지겁 먹는다.
		
		Cat c = new Cat();
		c.eat(); // ? -> 고양이는 얌전히 먹는다.
		c.night();
		
		System.out.println("----------------");
		
		//경우2. ***
		// Dog.class, Cat.class -> 설계자가 아니기 때문에 어떤 동작이 있는지 모름
		Animal ani;
		
		ani = new Dog();
		ani.eat();

		ani = new Cat();
		ani.eat();
//		ani.night(); //Animal에 없는 메소드
		((Cat)ani).night(); //밤에 눈에서 빛이난다. --> down casting(강제형변환)
	}
}
