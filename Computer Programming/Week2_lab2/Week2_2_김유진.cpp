
#include <stdio.h>

int main(void) {

	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");


	int a, b, result1; //a,b,result1을 int(정수) type으로 선언.
	float c, d, result2; // c,d,result2를 float(실수) type으로 선언.

	a = 3; // a에 3(정수이므로 앞에서 선언한 int type과 맞음)의 값을 넣어 초기화.
	b = 5; // b에 5(정수이므로 앞에서 선언한 int type과 맞음)의 값을 넣어 초기화.
	c = 1.5; // c에 1.5(실수이므로 앞에서 선언한 float type과 맞음)의 값을 넣어 초기화.
	d = 2.5; // d에 1.5(실수이므로 앞에서 선언한 float type과 맞음)의 값을 넣어 초기화.

	printf("a=%d, b=%d, c=%.1f, d=%.1f\n\n", a, b, c, d); 
	/*
	변수 a와 b는 int type이므로 포맷지정자 %d를 이용하여 출력함, 
	변수 c와 d는 float type이므로 포맷지정자 %f를 이용하여 출력함, 
	소수점 한자리까지만 출력할 것이므로 f앞에 .1을 붙여줌. 
	*/	
	result1 = a + b; // 변수 result1 안에 a와 b의 합을 저장해서 초기화. 
	//(정수+정수)의 연산이므로 result1도 int type임. (앞에서 int로 선언한 것과 일치)
	printf("%d + %d = %d\n", a, b, result1); 
	//a,b,result1 모두 int type이므로 포맷지정자 %d를 사용하여 출력함.
	result1 = a - b; // 변수 result1 안에 a와 b의 차를 저장. (앞에서 저장한 a+b의 결과값은 사라지고 새로운 값이 저장됨.)
	//(정수-정수)의 연산이므로 result1도 int type임. (앞에서 int로 선언한 것과 일치)
	printf("%d - %d = %d\n", a, b, result1); 
	//a,b,result1 모두 int type이므로 포맷지정자 %d를 사용하여 출력함.
	result1 = a * b; // 변수 result1 안에 a와 b를 곱한 결과값을 저장.
	//(정수*정수)의 연산이므로 result1도 int type임. (앞에서 int로 선언한 것과 일치)
	printf("%d * %d = %d\n", a, b, result1);
	//a,b,result1 모두 int type이므로 포맷지정자 %d를 사용하여 출력함.
	result2 = c / d; //변수 result2 안에 c와 d를 나눈 값을 저장.
	//(실수/실수)의 연산이므로 result2도 float type임. (앞에서 float로 선언한 것과 일치)
	printf("%.1f / %.1f = %.1f", c, d, result2);
	//c,d,result2 모두 float type이므로 포맷지정자 %f를 사용하여 출력함.
	//소수점 첫재짜리까지만 출력하기 위해 f앞에 .1을 붙여줌.
	
}

