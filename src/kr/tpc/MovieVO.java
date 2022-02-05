package kr.tpc;

public class MovieVO {
	
	// 영화(제목, 가격, 주인공, 등급, 시간)
	private String title;
	private int price;
	private String author;
	private int level;
	private float time;
	
	// 디폴트 생성자
	public MovieVO() {}

	// 생성자 오버로딩
	public MovieVO(String title, int price, String author, int level, float time) {
		super();
		this.title = title;
		this.price = price;
		this.author = author;
		this.level = level;
		this.time = time;
	}

	// toString
	@Override
	public String toString() {
		return "MovieVO [title=" + title + ", price=" + price + ", author=" + author + ", level=" + level + ", time="
				+ time + "]";
	}

	// getters, setters
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}
}
