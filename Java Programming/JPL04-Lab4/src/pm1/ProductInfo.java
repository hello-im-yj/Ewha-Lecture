package pm1;

import java.util.Scanner;

public class ProductInfo {
	
	static int numofProduct=0;
	static Product[] productArr = new Product[10];
	
	public static void main (String args[]) {
		
		// static int numofProduct=0; //main �ȿ��� static �Ұ�(?) -> �翬.. Ŭ���� �����ϱ� (?)
		
		while(true) {
			System.out.println();
			System.out.print("��ǰ �߰�(1), ��� ��ǰ ��ȸ(2), ������(3)>>");
			System.out.println();
			Scanner sc = new Scanner(System.in);
			int input =sc.nextInt();
			
			switch (input) {
				
				case 1: //��ǰ�߰�
					
				if (numofProduct >= 9) {
				System.out.println("�� �̻� �߰��� �� �����ϴ�.");
				break;
				}
				
				System.out.println("��ǰ ���� : å(1), ����CD(2), ȸȭå(3)>>");
				int type = sc.nextInt();
				addProduct(type);
				numofProduct++;
					break;
					
				case 2: 
					for (int i =0;i<numofProduct;i++) {
						productArr[i].showInfo();
						System.out.println();
					}
					break;
				case 3: System.out.println("***The End***");
					break;
				default: System.out.println("�߸��� �Է��Դϴ�.");
					break;
					
			}//end of switch
			
		} //end of while 

	}//end of main
	
	public static void addProduct(int type) {
		
		//��ĳ�� ��ü ���� �����������.
		Scanner sc = new Scanner(System.in);
				
		System.out.print("��ǰ����>> ");
		String description = sc.nextLine();
		System.out.print("������>> ");
		String maker = sc.nextLine();
		System.out.print("����>> ");
		int price = Integer.parseInt(sc.nextLine());
		
		switch(type) { //�ٷ� �ڿ� case�� ����Ǿ����. �߰��� ���� �� �� X -> �ƴϸ� error

		case 1: case 3: 
			System.out.print("å ����>> ");
			String title = sc.nextLine();
			System.out.print("����>> ");
			String author = sc.nextLine();
			System.out.print("ISBN>> ");
			int ISBN = sc.nextInt();
			
			if (type == 1) { 
				productArr[numofProduct] = new Book(numofProduct, description, maker, price, ISBN, title, author);				
				break;
			}
			
			System.out.print("���>> ");
			String language = sc.nextLine();
			productArr[numofProduct] = new ConversationBook(numofProduct, description, maker, price, ISBN, title, author, language);
			break;
			
		case 2: 
			System.out.print("�ٹ� ����>> ");
			String albumTitle = sc.nextLine();
			System.out.print("����>> ");
			String artist = sc.nextLine();
			
			productArr[numofProduct] = new CompactDisk(numofProduct, description, maker, price, albumTitle,artist);
			break;		
		}

		
		
	}

}
