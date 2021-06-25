package pm1;

import java.util.Scanner;

public class ProductInfo {
	
	static int numofProduct=0;
	static Product[] productArr = new Product[10];
	
	public static void main (String args[]) {
		
		// static int numofProduct=0; //main 안에는 static 불가(?) -> 당연.. 클래스 변수니까 (?)
		
		while(true) {
			System.out.println();
			System.out.print("상품 추가(1), 모든 상품 조회(2), 끝내기(3)>>");
			System.out.println();
			Scanner sc = new Scanner(System.in);
			int input =sc.nextInt();
			
			switch (input) {
				
				case 1: //상품추가
					
				if (numofProduct >= 9) {
				System.out.println("더 이상 추가할 수 없습니다.");
				break;
				}
				
				System.out.println("상품 종류 : 책(1), 음악CD(2), 회화책(3)>>");
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
				default: System.out.println("잘못된 입력입니다.");
					break;
					
			}//end of switch
			
		} //end of while 

	}//end of main
	
	public static void addProduct(int type) {
		
		//스캐너 객체 새로 생성해줘야함.
		Scanner sc = new Scanner(System.in);
				
		System.out.print("상품설명>> ");
		String description = sc.nextLine();
		System.out.print("생산자>> ");
		String maker = sc.nextLine();
		System.out.print("가격>> ");
		int price = Integer.parseInt(sc.nextLine());
		
		switch(type) { //바로 뒤에 case로 연결되어야함. 중간에 문장 쓸 수 X -> 아니면 error

		case 1: case 3: 
			System.out.print("책 제목>> ");
			String title = sc.nextLine();
			System.out.print("저자>> ");
			String author = sc.nextLine();
			System.out.print("ISBN>> ");
			int ISBN = sc.nextInt();
			
			if (type == 1) { 
				productArr[numofProduct] = new Book(numofProduct, description, maker, price, ISBN, title, author);				
				break;
			}
			
			System.out.print("언어>> ");
			String language = sc.nextLine();
			productArr[numofProduct] = new ConversationBook(numofProduct, description, maker, price, ISBN, title, author, language);
			break;
			
		case 2: 
			System.out.print("앨범 제목>> ");
			String albumTitle = sc.nextLine();
			System.out.print("가수>> ");
			String artist = sc.nextLine();
			
			productArr[numofProduct] = new CompactDisk(numofProduct, description, maker, price, albumTitle,artist);
			break;		
		}

		
		
	}

}
