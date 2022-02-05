package kr.tpc;
// 책(Object) -> 제목, 가격, 출판사, 페이지수....
public class BookVO {
	
	public String title;
	public int price;
	public String company;
	public int page;
	
	// ### 디폴트 생성자메서드(생략)가 자동으로 생성되지 않는 경우! 
	// -> class 안에 생성자가 하나도 없을 경우는 자동 생성되지만, 생성자를 하나라도 생성할 경우는 자동 생성되지 않는다!
	public BookVO() {
		//초기화 작업
		this.title="자바";
		this.price=14000;
		this.company="이지스";
		this.page=780;
		// this는 자기자신을 가르키며 생략이 가능하다
	}
	
	//생성자 메서드의 중복정의(overloading)
	public BookVO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
}
