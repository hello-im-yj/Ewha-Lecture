/* 1748022 ������
 * (�ǽ�2) å�� ����
 * */

package pm2;

import java.io.Serializable;

public class Book implements Serializable {
	
	String title;
	Author author;
	public Book(String title, Author author) {
		super();
		this.title = title;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
}
