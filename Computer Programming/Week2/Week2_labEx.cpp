

#include <stdio.h>

////Ex1
//int main(void) {
//
//	int num = 2147483647;
//	printf("num=%d\n", num);
//	printf("num=%d\n", num + 1);
//	printf("num=%d\n", num + 2);
//
//	//return 0;
//}


//Ex2
int main(void) {

	int dogs = 21;
	int cows = 32, goats = 14;
	dogs = 94; int cats = 94;

	printf("cows : %d\t goats : %d\n", cows, goats);
	printf("dogs : %d\t cats : %d\n", dogs,cats );

}

////Ex3
//int main(void) {
//
//	char ch = 'A';
//	printf("ch의 값:%c\t ch의 아스키코드 : %d\n", ch, ch);
//	ch = 98;
//	printf("ch의 값:%c\t ch의 아스키코드 : %d\n", ch, ch);
//	printf("ch의 바로 다음 값:%c\t ch의 바로 다음 아스키코드:%d\n ", ch + 1, ch + 1);
//		//ch에 연산도 가능^^...
//	
//	char ch2 = ch + 3; // 아스키코드에 101 저장
//	printf("ch로부터 세번째 뒤의 값:%c\n", ch2);
//
//
//}


////Ex4
//int main(void) {
//
//	int num = 100;
//	float pi = 3.14;
//
//	printf("num:%d num: %f\n", num, num);
//	printf("pi:%f pi:%d\n", pi, pi);
//}

////Ex5
//int main(void) {
//
//	float a = 3.14159;
//	printf("a:%f\na:%.2f\n", a, a);
//	a = 0.123456789;
//	printf("a:%.9f\n", a);
//	a = 9876.54321;
//	printf("a:%.9f\n", a);
//}