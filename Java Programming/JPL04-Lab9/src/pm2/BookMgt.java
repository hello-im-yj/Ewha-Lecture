/* 1748022 ������
 * (�ǽ�2) å�� ����
 * */

package pm2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class BookMgt {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Book> booklist = new ArrayList<Book>();

	public static void main(String args[]) {

		System.out.println("�޴� ����: (1)å �߰�\t(2)��ü å �˻�");
		int n = Integer.parseInt(sc.nextLine());

		try {
			if (n == 1) {
				writeBooks();
			} // end of if
			else if (n == 2) {
				readBooks();
			}
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}// end of main

	public static void writeBooks() throws IOException {
		// ������ ������ ��ȭ��ȣ�θ� �о�´�. (�ִٸ�)
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("books.dat"));
			booklist = (ArrayList<Book>) in.readObject();
			in.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e){
			System.out.println("������ ����� ������ �����ϴ�.");;
		}
		
		while (true) {
			System.out.print("Title>> ");
			String title = sc.nextLine();
			if (title.equals("�׸�"))
				break;
			System.out.print("Author name>> ");
			String name = sc.nextLine();
			System.out.print("Career>> ");
			String career = sc.nextLine();
			System.out.print("Gender(M or W)>> ");
			String g = sc.nextLine();
			Gender gender = Gender.UNKNOWN;
			if (g.equals("W"))
				gender = Gender.WOMAN;
			else if (g.equals("M"))
				gender = Gender.MAN;
			Author author = new Author(name, gender, career);
			Book b = new Book(title, author);

			booklist.add(b);
			
			System.out.println();

		}
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("books.dat"));
		out.writeObject(booklist);
		out.close();
		System.out.println("å�� �����߽��ϴ�.");
	}

	public static void readBooks() throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("books.dat"));
		booklist = (ArrayList<Book>) in.readObject();

		for (int i = 0; i < booklist.size(); i++) {
			System.out.print("����>> ");
			System.out.println(booklist.get(i).getTitle());
			System.out.print("���� �̸�>> ");
			System.out.println(booklist.get(i).getAuthor().getName());
			System.out.print("���� ���>> ");
			System.out.println(booklist.get(i).getAuthor().getCareer());
			System.out.print("����>> ");
			System.out.println(booklist.get(i).getAuthor().getGender());
			System.out.println();
		}
		
		in.close();
		System.out.println("å�� ��� ����߽��ϴ�.");
	}

}
