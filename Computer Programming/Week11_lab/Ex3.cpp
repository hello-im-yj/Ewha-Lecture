//#include <stdio.h>
//#include <string.h>
//
//int main(void) {
//
//	char ss[20];
//	char tt[20];
//	int r1, r2;
//
//	puts("Input first string.");
//	gets_s(ss);
//
//	puts("Input second string.");
//	gets_s(tt);
//
//	r1 = strlen(ss);
//	r2 = strlen(tt);
//
//	printf("Length of first string ==> %d\n", r1);
//	printf("Length of second string ==> %d\n", r2);
//
//	//if (strcmp(ss, tt)) puts("same string.\n");
//	//같으면 false!!! 0이랑 비교해야함. 결과 반대로 나옴.
//	//if (ss==tt) puts("same string.\n"); 오류는 아닌데 원하는결과 안나옴
//
//	if (strcmp(ss, tt) == 0) puts("same string.\n"); 
//	else puts("diffirent string.\n");
//
//	if (r1 == r2) puts("same length. \n");
//	else puts("different length.\n");
//
//}