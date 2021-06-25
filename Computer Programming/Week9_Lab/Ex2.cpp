//#include<stdio.h>
//void binary(int);
//int main(void) {
//
//	int n;
//	scanf("%d", &n);
//	binary(n);
//
//}
//
//void binary(int n) {
//
//	if (n == 0) return; 
//	binary(n / 2); //여기부터 if(n>0)으로 묶어도 같음!
//	printf("%d",n % 2);
//}
//
////
////int binary(int n) {
////
////	if (n > 0) {
////		if (n/2==0) return 0;
////		int result = binary(n % 2);
////		printf("%d",result);
////
////	}
////}