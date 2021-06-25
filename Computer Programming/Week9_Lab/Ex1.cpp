//#include <stdio.h>
//
//int fact1(int);
//int fact2(int);
//
//int main(void) {
//
//	int n, m1,m2;
//	printf("Input a number: ");
//	scanf("%d", &n);
//	m1 = fact1(n);
//	printf("factofial(%d) = %d\n", n, m1);
//
//	m2 = fact2(n);
//	printf("factoreal(%d) = %d\n", n, m2);
//	
//}
//
//int fact1(int n) {
//	int result = 1, i;
//	for (i = n; i >= 1; i--) result *= i;
//	return result;
//}
//
//int fact2(int n) {
//
//	int result;
//	if (n == 1) return 1; //여기 n-1로 하면 안됨! 아래 n-1으로 들어가면 그게 n값이 되기 때문에
//	//하나 덜찍힘!
//	result = n * fact2(n - 1);
//	return result;
//}