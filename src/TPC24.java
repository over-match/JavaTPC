import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC24 {
	public static void main(String[] args) {
		
		// 2. ������ �迭
		// Dog, Cat ������ �迭�� �����Ͻÿ�
		
//		Object[] antAnimals =new Object[2]; //�ֻ��� Ŭ����
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
	
	private static void display(Animal[] antAnimals) { // �������迭
		for(int i=0; i<antAnimals.length; i++) {
			antAnimals[i].eat();
			
			if(antAnimals[i] instanceof Cat) {
				((Cat)antAnimals[i]).night();
			}
		} //for end
	}
}