//#include <stdio.h>
//
//int main(void) {
//
//	int x;
//	double y;
//
//	x = -(2 + 5) * 6 + (4 + 3 * (2 + 3)); //-23
//	printf("x=%5d\n", x);
//	y = 3 + 2 * (x = 7 / 2); //9
//	printf("x=%5d,y=%5.2f\n", x, y);
//
//	x = (int)3.8 + 300000.3; //6, %5에서 자리수 넘치면 그냥 자리수설정 무시
//	printf("x=%5d\n", x);
//	x = 3 / 5 * 22.0; //0
//	printf("x=%5d\n", x);
//	y = (double)(x = 4) * 3 / 5; //2.40 , 여기서 대입한 x도 x값 데이터를 바꿈.
//	printf("y=%5.2f\n", y);
//	y = x * 3 / 5; //2.00
//	printf("y=%5.2f\n", y);
//
//}