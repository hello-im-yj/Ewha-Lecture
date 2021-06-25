#include <stdio.h>
 
int main(void) {

	char gender; 
	int age;
	double asset;
	print("성별(M/F), 나이, 자산 입력\n");
	scanf(% c % d % lf, &gender, & age, & asset);
	printf("\n<나의정보>\n");
	printf("성별:%c\n 나이:%d\n 자산:$%lf\n", gender, age, asset);
	
}