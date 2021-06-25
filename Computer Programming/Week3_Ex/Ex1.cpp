//#include <stdio.h>
//
//int main(void) {
//
//	float a = 2.14159;
//	printf("a:%f\n a:%.2f\n", a, a); //%f : 기본 여섯자리 출력
//	
//	a = 0.123456789; //유효숫자 9자리, float는 6-7자리만 저장 가능
//	printf("a:%.9f\n", a);
//
//	a = 9876.54321; //4까지만 저장(6-7자리 저장되지만 앞에숫자가 커서)
//	printf("a:%.9f\n", a);
//
//	a = 320000000000.0;
//	printf("a:%f\n a:%e\n a:%E\n", a, a, a);
//
//	a = 321e-4;
//	printf("a:%f\n", a);
//	printf("a:%e\n", a);
//
//
//}