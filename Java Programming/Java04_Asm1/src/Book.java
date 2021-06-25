/* 1748022 김유진 */

public class Book {
	
	//필드 (캡슐화)
	private String title; //책 제목
	private String publisher; //출판사
	private String type; //책 종류(type)
	private Author author; //책 저자 -> new하면 안됨 ^_^
	
	//생성자
	
	//매개변수가 4개인 경우에는 각 필드에 값을 입력한다. 
	public Book(String title, String publisher, String type, Author author) {
		this.title = title;
		this.publisher = publisher;
		this.type = type;
		this.author = author;
	}
	
	//매개변수가 없는 생성자를 호출하는 경우에는 setter를 이용하여 필드들의 값을 직접 초기화해줘야한다. 
	public Book() {	}
	
	//메소드
	
	//getter&setter
	
	public String getTitle() {
		return title;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getType() {
		return type;
	}

	public Author getAuthor() {
		return author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	//print() 매소드 : 책의 정보를 간단히 출력 (제목, 출판사, 타입, 저자 이름)
	public void print() {
		System.out.println("<책 정보 출력>");
		System.out.println("제목 : " + title);
		System.out.println("출판사 : " + publisher);
		System.out.println("타입 : "+ type);
		System.out.println("저자 이름 : "+ author.getName());
	}
	
	//printDetail() 매소드 : 책의 정보를 자세히 출력 (제목,출판사,타입,저자 이름,성별,나이,경력)
	public void printDetail() {
		System.out.println("<책 정보 및 저자 정보 출력>");
		System.out.println("제목 : " + title);
		System.out.println("출판사 : " + publisher);
		System.out.println("타입 : "+ type);
		System.out.println("저자 이름 : "+ author.getName());
		System.out.println("저자 성별 : "+ author.getGender());
		System.out.println("저자 나이 : "+ author.getAge());
		System.out.println("저자 경력 : "+ author.getCareer());
		 
	}
	
	//update(제목) 메소드 : 책의 제목을 입력받아 수정한다.  
	public void update(String title) {
		this.title = title;
	}
	
	//update(제목,출판사) 메소드 : 책의 제목과 출판사를 새로 입력받아 제목과 출판사를 수정한다. 
	public void update(String title, String publisher) {
		this.title = title;
		this.publisher = publisher;
	}

}
