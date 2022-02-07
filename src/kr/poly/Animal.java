package kr.poly;

//추상클래스(불안전한 객체)
// -> Animal ani = new Animal(); 객체를 생성할 수 없음!
// 스스로 동작은 불가능하지만, 슈퍼클래스로 다형성을 보장되어 서브클래스를 동작시킬 수 있다.
public abstract class Animal { 

	// 추상메소드(불안전한 메소드)
	public abstract void eat();
	
	// 구현 메소드
	// -> 기능이 비슷한 경우, 구현 메소드로 동일한 내용을 적용시켜서 작동시켜준다.
	public void move() {
		System.out.println("무리를 지어서 이동한다.");
	}
}
