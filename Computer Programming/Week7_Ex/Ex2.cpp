//#include<stdio.h>
//
//int compute(char, int);
//
//int main(void) {
//
//	char ch;
//	int num;
//	printf("Choose M(multiplication) or S(summmation)\n");
//	ch = getchar();
//	printf("Input a number to compute.\n");
//	scanf("%d", &num);
//	printf("%d\n", compute(ch, num));
//
//}
//
//int compute(char ch, int num) {
//	
//	if (ch == 'M' || ch == 'm') {
//		int result = 1;
//		for (int i = 1; i <= num ; i++) {
//			result *= i;
//		}
//		return result;
//	}
//
//	else if (ch == 'S' || ch == 's') {
//		int result = 0;
//		for (int i = 1; i <= num; i++) {
//			result += i;
//		}return result;
//	}
//
//	else {
//		printf("Wrong Input\n");
//		return 0;
//	}
//}