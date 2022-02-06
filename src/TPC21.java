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
		
		//상속관계(extends)이어야 활용 가능
		// 부모와 자식 간의 재정의(Override)되어야 사용이 가능하다.
		Animal ani = new Dog(); //UpCasting
		ani.eat();
		
		ani = new Cat();
		ani.eat();
//		ani.night(); //에러
		
		//두 줄로 작성한 downCasting
		Cat cc = (Cat)ani;
		cc.night();
		
		//한 줄로 작성한 downCasting
		((Cat)ani).night(); //downCasting
	}
}
