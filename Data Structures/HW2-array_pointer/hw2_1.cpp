#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

#define ROWS 3
#define COLS 3
#define MAX_TERMS 10

typedef struct {
	int row;
	int col;
	int value;
} element;
typedef struct SparseMatrix {
	element data[MAX_TERMS];
	int rows; // row number
	int cols; // column number
	int terms; // element number
} SparseMatrix;

//transpose matrix
SparseMatrix transpose(SparseMatrix m) {

	SparseMatrix trans;

	trans.rows = m.cols;
	trans.cols = m.rows;
	trans.terms = m.terms;

	int save = 0;
	for (int i = 0; i < m.rows; i++) {
		for (int j = 0; j < m.terms; j++) {
			if (i == m.data[j].col) {
				trans.data[save].col = m.data[j].row;
				trans.data[save].row = m.data[j].col;
				trans.data[save++].value = m.data[j].value;
			}
		}
	}

	return trans;
}

//print all elenents of matrix
void printAllMatrix(SparseMatrix m) {

	int** all_element = (int**)malloc(sizeof(int*) * m.rows);
	for (int i = 0; i < m.rows; i++) {
		all_element[i] = (int*)malloc(sizeof(int) * m.cols);
	}

	//initialize with 0
	for (int i = 0; i < m.rows; i++) {
		for (int j = 0; j < m.cols; j++) {
			all_element[i][j] = 0;
		}
	}

	//input nonzero element
	for (int i = 0; i < m.terms; i++) {
		all_element[m.data[i].row][m.data[i].col] = m.data[i].value;
	}

	//print matrix with all element
	for (int i = 0; i < m.rows; i++) {
		for (int j = 0; j < m.cols; j++) {
			printf("%d ", all_element[i][j]);
		}
		printf("\n");
	}

	//deallocate
	if (all_element != NULL) {
		for (int i = 0; i < m.rows; i++) {
			free(all_element[i]);
		}
		free(all_element);
		all_element = NULL;
	}

}


void main() {
	//Add B as an input. Use your own example freely.
	SparseMatrix B = { {{ 0,3,7 }, { 1,0,9 }, { 1,5,8 }, { 3,0,6 }, { 3,1,5 }, { 4,5,1 }, { 5,2,2 } }, 6, 6, 7 };

	//Perform the transpose operation.
	SparseMatrix transposed_B = transpose(B);

	//Print out B and B^T in a sparse matrix matrix form
	printf("Sparse Matrix B : \n");
	for (int i = 0; i < B.terms; i++) {
		printf("%d %d %d\n", B.data[i].row, B.data[i].col, B.data[i].value);
	}
	printf("\n");
	printf("Sparse Matrix B^T : \n");
	for (int i = 0; i < B.terms; i++) {
		printf("%d %d %d\n", transposed_B.data[i].row, transposed_B.data[i].col, transposed_B.data[i].value);
	}
	printf("\n");

	//Print out B and B^T in a dense matrix form to check whether the operation works correctly.
	printf("Matrix B : \n");
	printAllMatrix(B);
	printf("\n");
	printf("Matrix B^T : \n");
	printAllMatrix(transposed_B);

}