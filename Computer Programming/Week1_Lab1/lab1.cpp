#include <stdio.h>

int main(void) {

	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");
	int age = 22; // 정수(integer) 형태의 변수 age를 선언하여, 22라는 데이터 값을 저장합니다. 
	double height = 162.1; // 실수(double) 형태의 변수 height를 선언하여, 162.1이라는 데이터 값을 저장합니다. 
	char blood_type = 'O'; // 문자(character) 형태의 변수 blood_type을 선언하여 'O'라는 데이터를 저장합니다.  

	printf("내 이름은 김유진입니다.\n");
	printf("나이는 %d살입니다.\n", age); // age라는 변수가 정수 형태이므로 정수의 포맷지정자인 %d를 이용하여 값을 받아옵니다. 
	printf("키는 %.1lfcm입니다.\n", height); // height라는 변수가 실수(double) 형태이므로 실수의 포맷지정자인 %lf를 이용하여 값을 받아옵니다. 
	printf("몸무게는 비밀입니다.^______^ \n");
	printf("혈액형은 %c형입니다.\n", blood_type); // blood_type라는 변수가 문자 형태이므로 문자의 포맷지정자인 %c를 이용하여 값을 받아옵니다. 

	return 0;
}