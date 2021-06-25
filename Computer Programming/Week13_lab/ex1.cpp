//#include <stdio.h>
//
//struct book {
//	char title[50];
//	char author[50];
//	int pages;
//	int price;
//};
//typedef struct book book;
//
//int main(void) {
//
//	book book1, book2;
//	printf("책 제목:");
//	gets_s(book1.title);
//	printf("저자: ");
//	gets_s(book1.author);
//	printf("페이지 수: ");
//	scanf("%d", &book1.pages);
//	printf("가격: ");
//	scanf("%d", &book1.price);
//
//	book2 = book1;
//	printf("\n<book1>\n");
//	printf("제목:%s\t저자:%s\t페이지 수:%d\t가격:%d\n", book1.title, book1.author, book1.pages, book1.price);
//	printf("\n<book2>\n");
//	printf("제목:%s\t저자:%s\t페이지 수:%d\t가격:%d\n", book2.title, book2.author, book2.pages, book2.price);
//
//
//}