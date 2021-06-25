#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int l, m, n = 0;

double*** mem_alloc_3D_double() {
	double*** matrix = (double***)malloc(sizeof(double**) * l);
	for (int i = 0; i < l; i++) {
		matrix[i] = (double**)malloc(sizeof(double*) * m);
		for (int j = 0; j < m; j++) {
			matrix[i][j] = (double*)malloc(sizeof(double) * n);
		}
	}
	return matrix;
}

void inputMatrix(double*** matrix) {
	for (int i = 0; i < l; i++) {
		for (int j = 0; j < m; j++) {
			for (int k = 0; k < n; k++) {
				printf("matrix[%d][%d][%d] : ", i, j, k);
				scanf_s("%lf", &matrix[i][j][k]);
			}
		}
	}
}

void addition_3D(double*** A, double*** B, double*** C) {
	printf("result of A+B >> \n");
	for (int i = 0; i < l; i++) {
		for (int j = 0; j < m; j++) {
			for (int k = 0; k < n; k++) {
				C[i][j][k] = A[i][j][k] + B[i][j][k];
				printf("matrix[%d][%d][%d] : %lf\n", i, j, k, C[i][j][k]);
			}
		}
	}
}


void deallocate_3D(double*** matrix) {
	if (matrix != NULL) {
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < m; j++) {
				free(matrix[i][j]);
			}
			free(matrix[i]);
		}
		free(matrix);
		matrix = NULL;
	}
}


int main() {

	//Define two matrices A and B using 'mem_alloc_3D_double'
	printf("input size of 3D matrix (format = int int int) : ");
	scanf_s("%d %d %d", &l, &m, &n);

	//allocate memory for matrix A,B,A+B
	double*** A = mem_alloc_3D_double();
	double*** B = mem_alloc_3D_double();
	double*** C = mem_alloc_3D_double();

	//input value of matrix A,B
	printf("input value of matrix A >> \n");
	inputMatrix(A);
	printf("\n");
	printf("input value of matrix B >> \n");
	inputMatrix(B);
	printf("\n");

	//Perform addtion of two matrices using 'addition_3D()'
	addition_3D(A, B, C);

	//Deallocate A and B
	deallocate_3D(A);
	deallocate_3D(B);

}
