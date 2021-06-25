//#include<stdio.h>
//
//int long_fibo(int);
//int main(void) {
//	int n;
//	scanf("%d", &n);
//	for (int i = 0; i <= n; i++) { //0~n번째 수열까지 print
//		printf("%d ", long_fibo(i));
//	}
//}
//
//int long_fibo(int n) {
//	int result;
//	if (n <= 1) return n;
//	else {
//		result = long_fibo(n - 1) + long_fibo(n - 2);
//	}
//	return result;
//}