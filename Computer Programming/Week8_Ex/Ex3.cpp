//#include<stdio.h>
//
//void func1(char a, char b) {
//	char temp;
//	temp = a;
//	a = b;
//	b = temp;
//	printf("In func1 : x=%c, y=%c\n",a,b);
//}
//
//void func2(char* a, char* b) {
//	char temp;
//	temp = *a;
//	*a = *b;
//	*b = temp;
//}
//
//int main(void) {
//
//	char x = 'A', y = 'Z';
//	printf("Original : x=%c, y=%c\n", x, y);
//	func1(x, y);
//	printf("call by values : x=%c, y=%c\n", x, y);
//	func2(&x, &y);
//	printf("call by references : x=%c, y=%c\n", x, y);
//
//
//
//}