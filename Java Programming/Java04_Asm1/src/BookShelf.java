/* 1748022 ������ */

import java.util.Scanner;

public class BookShelf {
	
	//�ʵ� (ĸ��ȭ)
	final int MAXCOUNT = 100; //��� 100���� �ʱ�ȭ
	private Book[] booklist = new Book[MAXCOUNT]; //�ִ� 100���� Book type�� ���� �� �ִ� å ��� �迭�� �����Ѵ�.  
	private int numofBook=0; //���� ������ å�� ��, 0���� �ʱ�ȭ�Ѵ�. 

	//�޼ҵ�
	
	//getter - ���� ������ å�� ���� ��ȯ�Ѵ�. 
	public int getNumofBook() {
		return numofBook;
	}
	
	//getBooks()�޼ҵ� : å�忡 �ִ� ��� å�� ������ ������ ����Ѵ�. 
	public void getBooks() {
		/* ����ó�� : ���� ������ å�� ������ 0���� �� �迭�� ������ ���ܰ� �߻��ϱ� ������, 
		������ å�� ���� ������ å�� ���ٴ� �޽����� ����� �� �Լ��� �����Ų��.   */
		if (numofBook==0) {
			System.out.println("������ å�� �����ϴ�.");
			return;
		}
		//������ å�� ���� ������ å�� ä���� �迭�� ĭ�� ��� ���鼭 print()�żҵ带 ���� å ������ ����Ѵ�. 
		for (int i=0; i<numofBook; i++) {
			booklist[i].print();
			System.out.println();
		}
	}
	
	//selectBook(����) �޼ҵ� : ����ڰ� �Է��� å�� ���� �ش��ϴ� å�� ã�� ����� ��, �ش� ��ü�� ��ȯ�Ѵ�. 
	public Book selectBook(String title) {
		//å�� ä���� �迭�� ��� ���鼭, �Է��� å�� ����� ���� ������ ���� å�� ������ printDetail() �޼ҵ带 �̿��Ͽ� ����Ѵ�. 
		for (int i=0; i<numofBook; i++) {
			if (booklist[i].getTitle().equals(title)) {
				booklist[i].printDetail();
				return booklist[i]; //�˻��� å�� �ش��ϴ� Book ��ü�� ���Ͻ�Ų��.  
			} 
		}
		//���� �˻��� å�� ���ٸ� �Ʒ� �޼����� ����� ��, �ش��ϴ� ��ü�� �����Ƿ� null�� �����Ѵ�. 
		System.out.println("�˻��� å�� �����ϴ�.");
		return null; 
	}
	
	//addBook(Book) �޼ҵ� : main���� ����ڰ� �Է��� ���� �޾� Book ��ü�� �����ϸ�, �̸� å�忡 å�� �߰��Ѵ�. 
	public void addBook(Book book) {
		//������� å�� ä���� ĭ �ٷ� ������ book��ü�� �����Ѵ�.  
		booklist[numofBook] = book;
		numofBook++; //������ å�� ���� 1 ������Ų��. 

	}
	
	//deleteBook(����) �޼ҵ� : ����ڰ� ������ book��ü�� å�忡�� �����Ѵ�. 
	public void deleteBook(String title) {
		//����ڰ� �Է��� ����� ������ ������ ���� Book��ü�� index�� ã��, �ش� index �ڿ� �ִ� �迭�� ��ĭ�� ������ �̵���Ų��. 
		for (int i=0; i<numofBook;i++) {
			if (booklist[i].getTitle() == title) {
				for (int j=i;j<numofBook-1;j++) {
					booklist[j]=booklist[j+1];
				} //�迭�� index�� ����� ��Ȳ�� ���ϱ� ���� ������ å���� null�� ���� �ʱ�ȭ�Ѵ�. 
				booklist[numofBook-1] = null;
			}
		}
		numofBook--; //������ å�� ���� 1 ���ҽ�Ų��. 
	}
	
	//clearBookShelf() �޼ҵ� : 
	public void clearBookShelf() {
		for (int i =0; i<numofBook; i++) {
			booklist[i] = null; //��� å���� å�� ����. 
			numofBook = 0; //������ å�� ���� 0���� �����Ѵ�.  
		}
	}

}
