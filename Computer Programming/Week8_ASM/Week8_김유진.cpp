#include<stdio.h>
#include<math.h>

//함수 프로토타입
void myInfo(void);
void func(char*, double*,double*);

int main(void) {
	myInfo();

	//변수 선언
	char ch;
	double a, b;
	printf("문자(R또는 P)와 양수 두 개 입력\n");
	//사용자로부터 문자 1, 양수2(부동소수점수) 입력받음.
	scanf("%c%lf%lf",&ch, &a, &b);
	//입력받은 값의 주소를 &연산자를 이용하여 func로 전달.
	func(&ch, &a, &b);
	//바뀐 결과값 출력
	printf("a=%.2lf b=%.2lf",a, b);

}

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");
	return;
}

//주소값을 전달받아서 포인터변수 값에 저장
void func(char* ptrc, double* ptra, double* ptrb) {
	//사용자가 입력한 값이 r 또는 R인 경우
	if (*ptrc == 'r' || *ptrc == 'R') {
		printf("<결과>\n");
		printf("루트값\n");
		//sqrt 함수 사용하여 ptra, ptra이 가리키는 곳에 저장된 변수 값에 각각 루트 연산을 해줌.
		*ptra = sqrt(*ptra);
		*ptrb = sqrt(*ptrb);

	}
	//사용자가 입력한 값이 p 또는 P인 경우
	else if (*ptrc == 'p' || *ptrc == 'P') {
		printf("<결과>\n");
		printf("5승값\n");
		//pow 함수 사용하여 ptra, prtb이 가리키는 곳에 저장된 변수 값에 각각 5승을 해줌.
		*ptra = pow(*ptra, 5);
		*ptrb = pow(*ptrb, 5);
	}
	//그 외의 문자를 입력받은 경우
	else {
		printf("'%c'는 잘못된 문자입니다.\n", *ptrc);
	}

}