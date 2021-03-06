#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <time.h>

#define BUCKETS 64
#define DIGITS 4
#define SIZE 1000
#define RAND_MAX 16777215


typedef struct {
	int num;
	int d[DIGITS]; //d3 d2 d1 d0 순서
}element;


void print(element* arr) {
	for (int i = 0; i < SIZE; i++) {
		printf("%d :", arr[i].num);
		printf("%d ", arr[i].d[3]);
		printf("%d ", arr[i].d[2]);
		printf("%d ", arr[i].d[1]);
		printf("%d \n", arr[i].d[0]);
	}
}

//난수 =  rand()%(종료값-시작값+1) + 시작값
void make_rand_number(element input[]) {
	srand(time(NULL));
	for (int i = 0; i < SIZE; i++) {
		int num = rand() % (RAND_MAX + 1) + 1;
		input[i].num = num;
		for (int j = 0; j < DIGITS; j++) {
			input[i].d[j] = num % int(pow(2,6));
			num /= int(pow(2, 6));
		}
	}
}


void counting_sort(element input[], const int numdigit, element result[]) {

	int digit[BUCKETS];

	for (int i = 0; i < BUCKETS; i++) {
		digit[i] = 0;
	}

	for (int i = 0; i < SIZE; i++) {
		int index = input[i].d[numdigit];
		digit[index] += 1;
	}

	for (int i = 1; i < BUCKETS; i++) {
		digit[i] = digit[i] + digit[i - 1];
	}

	for (int i = (SIZE - 1); i >= 0; i--) {
		int index = input[i].d[numdigit];
		int c_index = digit[index];
		result[c_index - 1] = input[i];
		digit[index] -= 1;
	}

}

void radix_sort(element input[]) {
	element result_a[SIZE];
	element result_b[SIZE];

	counting_sort(input, 0, result_a);
	counting_sort(result_a, 1, result_b);
	counting_sort(result_b, 2, result_a);
	counting_sort(result_a, 3, result_b);

	printf("\n=== radix_sort result ===\n");
	print(result_b);
}

int main() {
	element input[SIZE];
	make_rand_number(input);
	printf("\n=== input data ===\n");
	print(input);
	radix_sort(input);

}