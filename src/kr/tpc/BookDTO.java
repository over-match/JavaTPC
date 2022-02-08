package kr.tpc;
public class BookDTO {
	
	public String title;
	public int price;
	public String company;
	public int page;
	
	// 디폴트 생성자 메소드(생략된 상태이지만 작성해보기)
	public BookDTO() {
		// 객체를 생성하는 작업을 한다. (기계어코드)
	}
	
	public BookDTO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}

	@Override
	public String toString() {
		return "BookDTO [title=" + title + ", price=" + price + ", company=" + company + ", page=" + page + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	
}
