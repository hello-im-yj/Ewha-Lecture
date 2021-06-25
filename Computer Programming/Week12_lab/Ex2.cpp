//#include<stdio.h>
//
//int main(void) {
//
//	int arr[] = { 10,20,30 };
//	int* ptr;
//	ptr = arr;
//	printf("sizeof arr: %d\n", sizeof arr);
//	printf("sizeof ptr: %d\n", sizeof ptr);
//
//	for (int i = 0; i < sizeof arr / sizeof arr[0]; i++) printf("arr[%d] = %d\n", i, arr[i]);
//	for (int i = 0; i < sizeof arr / sizeof (int); i++) printf("arr[%d] = %d\n", i, *(ptr+i));
//	for (int i = 0; i < sizeof arr / sizeof arr[0]; i++) printf("arr[%d] = %d\n", i, ptr[i]);
//	for (int i = 0; i < sizeof arr / sizeof arr[0]; i++) printf("arr[%d] = %d\n", i, *(arr+i));
//
//}