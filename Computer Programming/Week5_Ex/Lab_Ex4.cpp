#include <stdio.h>

int main(void) {

	int i, num, score;
	int sum = 0;
	printf("How many students are there?");
	scanf("%d", &num);
	printf("input %d score.", num);
	for (i = 0; i < num; i++) {
		scanf("%d", &score);
		sum += score;
	}
	printf("Sum : %d\n", sum);
	printf("Average : %.2f", (float)sum / num);
}