#include<stdio.h>

void func(int arr[][3], int n) {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < 3; j++) {
			//printf("%d",arr[i][j]);
			printf("%d", *(arr+i)[j]);
		}printf("\n");
	}
}

int main(void) {

	int A[2][3] = { {1,3,5},{2,4,6} };
	func(A, 2);
}