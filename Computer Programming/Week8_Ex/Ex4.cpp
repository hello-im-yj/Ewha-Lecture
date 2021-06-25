#include<stdio.h>

int a = 100;

void func1(void)
{
	int a = 200;
	printf("value a in func() ==> %d\n", a);

}

int main(void) {

	func1();
	printf("value a in main() ==> %d", a);

}