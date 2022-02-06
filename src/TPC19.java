import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {
	public static void main(String[] args) {
		
		// Dog, Cat --> Animal
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		
		// Dog.java(X), Dog.class(O)
		
		//Animal <---[Dog.class, Cat.class]33
		// -> 소스코드를 제공해서는 안되기 때문 해결책은?
//		Dog d1 = new Dog();
//		d1.eat();

		
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		
	}
}
