import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC24 {
	public static void main(String[] args) {
		
		// 2. 다형성 배열
		// Dog, Cat 저장할 배열을 생성하시오
		
//		Object[] antAnimals =new Object[2]; //최상위 클래스
		Animal[] antAnimals =new Animal[2];
		antAnimals[0] = new Dog();
		antAnimals[1] = new Cat();
		
		for(int i=0; i<antAnimals.length; i++) {
			antAnimals[i].eat();
			
			if(antAnimals[i] instanceof Cat) {
				((Cat)antAnimals[i]).night();
			}
		} //for end
		System.out.println("---------------------");	
		
		display(antAnimals);
	
	}
	
	private static void display(Animal[] antAnimals) { // 다형성배열
		for(int i=0; i<antAnimals.length; i++) {
			antAnimals[i].eat();
			
			if(antAnimals[i] instanceof Cat) {
				((Cat)antAnimals[i]).night();
			}
		} //for end
	}
}
