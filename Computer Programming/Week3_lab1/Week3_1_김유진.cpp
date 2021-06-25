#include <stdio.h>

int main(void) {
	
	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");

	int a, b, c; //int type의 변수 a,b,c를 선언.
	
	printf("정수 세 개를 입력하세요.\n");
	scanf_s("%d%d%d", &a, &b, &c); //scanf를 이용하여 정수 3개를 입력받음. 그리고 각각 a,b,c에 차례로 저장.
	printf("입력된 세 정수: %d, %d, %d\n", a, b, c); //a,b,c모두 정수이므로 포맷지정자 %d를 이용하여 출력.
	printf("세 정수의 합계: %d\n",a+b+c); //a,b,c가 모두 정수이므로 셋을 더한 연산도 정수값으로 저장됨. %d를 이용하여 출력.
	printf("세 정수의 평균: %.2f", ((float)a + b +c) / 3); 
	// a,b,c를 float type으로 형변환 후 연산하면 결과값도 float type으로 저장됨. 따라서 포맷지정자 %f를 이용하여 출력.
	// 소수점 이하 두자리까지만 출력하기 위해 포맷지정자의 f앞에 .2를 붙여줌. 

}
