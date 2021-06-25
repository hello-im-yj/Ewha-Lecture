#include<stdio.h>

int sum_of_num(int);
int main(void) {

	int number;
	printf("INPUT A NUMBER : \n");
	scanf("%d", &number);
	printf("The sum of odd numbers which is not the multiples of 5 between 1 and %d is %d.\n"
		, number, sum_of_num(number));

}

int sum_of_num(int num) {
	int sum = 0;
	for (int i = 1; i <= num; i++) {
		if (i % 2 == 1 && i % 5 != 0) sum += i;
	}
	return sum;

}