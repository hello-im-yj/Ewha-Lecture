#include<stdio.h>
#include<time.h>
#include<stdlib.h>

int main(void) {
	srand(time(NULL));

	int rand_num;
	for (int i = 0; i < 10; i++) {
		rand_num = rand() % 6 + 1;
		printf("%d\n", rand_num);
	}

}