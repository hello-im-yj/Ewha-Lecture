/* 1748022 ������ */

public class Book {
	
	//�ʵ� (ĸ��ȭ)
	private String title; //å ����
	private String publisher; //���ǻ�
	private String type; //å ����(type)
	private Author author; //å ���� -> new�ϸ� �ȵ� ^_^
	
	//������
	
	//�Ű������� 4���� ��쿡�� �� �ʵ忡 ���� �Է��Ѵ�. 
	public Book(String title, String publisher, String type, Author author) {
		this.title = title;
		this.publisher = publisher;
		this.type = type;
		this.author = author;
	}
	
	//�Ű������� ���� �����ڸ� ȣ���ϴ� ��쿡�� setter�� �̿��Ͽ� �ʵ���� ���� ���� �ʱ�ȭ������Ѵ�. 
	public Book() {	}
	
	//�޼ҵ�
	
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
	
	//print() �żҵ� : å�� ������ ������ ��� (����, ���ǻ�, Ÿ��, ���� �̸�)
	public void print() {
		System.out.println("<å ���� ���>");
		System.out.println("���� : " + title);
		System.out.println("���ǻ� : " + publisher);
		System.out.println("Ÿ�� : "+ type);
		System.out.println("���� �̸� : "+ author.getName());
	}
	
	//printDetail() �żҵ� : å�� ������ �ڼ��� ��� (����,���ǻ�,Ÿ��,���� �̸�,����,����,���)
	public void printDetail() {
		System.out.println("<å ���� �� ���� ���� ���>");
		System.out.println("���� : " + title);
		System.out.println("���ǻ� : " + publisher);
		System.out.println("Ÿ�� : "+ type);
		System.out.println("���� �̸� : "+ author.getName());
		System.out.println("���� ���� : "+ author.getGender());
		System.out.println("���� ���� : "+ author.getAge());
		System.out.println("���� ��� : "+ author.getCareer());
		 
	}
	
	//update(����) �޼ҵ� : å�� ������ �Է¹޾� �����Ѵ�.  
	public void update(String title) {
		this.title = title;
	}
	
	//update(����,���ǻ�) �޼ҵ� : å�� ����� ���ǻ縦 ���� �Է¹޾� ����� ���ǻ縦 �����Ѵ�. 
	public void update(String title, String publisher) {
		this.title = title;
		this.publisher = publisher;
	}

}
