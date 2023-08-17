package chapter08.ex.c;

public abstract class Book {
	// 필드
	private int number; // 관리번호
	private String title; // 책의 제목
	private String author; // 책의 저자
	private static int countOfBooks; // 만들어진 Book 객체 개수
	//static이 아니면 공유가 안됨.

	// 생성자
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		number = ++countOfBooks; 
//		 먼저 countOfBooks를 증가시키고 number에 대입
//		number = countOfBooks + 1;
//		countOfBooks++;
	}

	// 메소드
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return String.format("관리번호 %d번, 제목: %s, 작가: %s(일주일 연체료: %,d원)", getNumber(), getTitle(), getAuthor(),
				getLateFee(7));
	}

	// 추상메소드
	public abstract int getLateFee(int lateDays);

//	public boolean equals(Book b) {
//		return author.equals(b.author) && title.equals(b.title);
//	}
//	tr버전
	public boolean equals(Object obj) {
		// Object obj = new Book("책1", "작가1);
		// 1. 주소가 같으면 같은 객체이므로 참을 반환
		if (this == obj) {
			return true;
		}
		// 2. title과 author가 같으면 같은 객체
		// obj가 title을 부르려면 강제로 캐스팅 해야함
		// 캐스팅 하기전에 캐스팅 할 수 있는지 확인해야함 --> instanceof
		if (!(obj instanceof Book)) {
			return false;
		}
		Book book = (Book) obj;
		return title.equals(book.title) && author.equals(book.author);
	}

//		또다른 방법
//		return Object.equals(title, book.title) && Object.equals(author, book.author);
//		내가 한것
//		return author.equals(((Book)obj).author) && title.equals(((Book)obj).title);

	public int hashCode() { // 11장에서 배울것.
		return 0;
	}
	// equals와 hashCode 메소드도 소스메뉴에서 쉽게 만들 수 있음 

}
