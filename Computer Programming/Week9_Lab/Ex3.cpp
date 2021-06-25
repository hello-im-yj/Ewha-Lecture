//#include <stdio.h>
//
//int fibo_iterative(int);
//int fibo_recursive(int);
//
//int main(void) {
//	int num;
//	scanf("%d", &num);
//	printf("%dth number of the sequence is %d\n", num, fibo_iterative(num));
//	printf("%dth number of the sequence is %d\n", num, fibo_recursive(num));
//}
//
////0,1,1,2,3,5,8,13,21,34 .... (앞에 두자리 수 더한 값)
//int fibo_iterative(int n) {
//	int fn, fn_1, fn_2;
//
//	if (n <= 1) return n;
//
//	else {
//		for (int i = 0; i <= n; i++) { //수열이 0부터 시작함.  
//			if (i == 0) fn_2 = 0; 
//			else if (i == 1) fn_1 = 1;
//			else {
//				fn = fn_1 + fn_2; 
//				fn_2 = fn_1;
//				fn_1 = fn;
//			}
//		}
//		return fn;
//	}
//}
//
//int fibo_recursive(int n) {
//	if (n == 0) return 0;
//	else if (n == 1) return 1; //두개 합쳐서 if (n<=1) return n;으로 쓸수도. 
//	else {
//		int fn = fibo_recursive(n - 1) + fibo_recursive(n - 2);
//		return fn;
//	}
//}
//
