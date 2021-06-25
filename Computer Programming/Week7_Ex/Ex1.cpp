//#include <stdio.h>
//void title(void);
//int sum(int);
//int mult(int);
//
//int main(void) {
//
//	int resultSum = 0;
//	int resultMult = 0;
//	resultSum = sum(10);
//	resultMult = mult(8);
//	title();
//	printf("Mult result : %d\n", resultMult);
//	printf("Sum result : %d\n", resultSum);
//
//}
//
//void title(void) {
//	printf("*COMPUTATION PROGRAM*\n");
//	printf("This program computes the sum(1~10) and multiplication(1~8).\n\n");
//}
//
//int sum(int n) {
//	int result = 0;
//	for (int i = 1; i <= n; i++) {
//		result += i;
//	}
//	return result;
//}
//
//int mult(int n) {
//	int result = 1; //곱셈 수행할 시에는 초기화 값 1로!
//	for (int i = 1; i <= n; i++) {
//		result *= i;
//	}
//	return result;
//}