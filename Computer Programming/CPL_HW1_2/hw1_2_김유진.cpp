#include <stdio.h>
void myInfo(void);

int main(void) {

	myInfo();

	//변수선언 및 초기화
	int int1, int2, result=0; 
	char userOperator;  
	float floatResult=0; 
	// 나누기 연산 시 소수점 결과를 저장할 변수를 float type 으로 따로 선언

	printf("수식을 입력하세요 (예: 4+7) : ");
	scanf("%d%c%d", &int1, &userOperator, &int2); //사용자로부터 정수,문자,정수를 차례로 입력받음.

	switch (userOperator) { //사용자가 입력한 문자열을 비교하여 결과를 출력

	case '+': //사용자가 연산자 자리에 입력한 문자가 +일 경우
		result = int1 + int2;//입력한 문자를 더하는 연산을 수행한 후 결과값을 저장하는 변수에 저장.
		printf("%d %c %d = %d", int1, userOperator, int2, result); //결과를 출력
		break;
	case '-': //사용자가 연산자 자리에 입력한 문자가 -일 경우
		result = int1 - int2; //입력한 문자를 빼는 연산을 수행한 후 결과값을 저장하는 변수에 저장.
		printf("%d %c %d = %d", int1, userOperator, int2, result); //결과를 출력
		break;
	case '*': //사용자가 연산자 자리에 입력한 문자가 *일 경우
		result = int1 * int2; //입력한 문자를 곱하는 연산을 수행한 후 결과값을 저장하는 변수에 저장.
		printf("%d %c %d = %d", int1, userOperator, int2, result); //결과를 출력
		break;
	case '/': //사용자가 연산자 자리에 입력한 문자가 /일 경우
		floatResult = (float)int1 / int2; //입력한 문자를 나누는 연산을 수행한 후 결과값을 저장하는 변수에 저장.
		// int형 변수끼리 연산하면 결과값이 int로 반환되므로, 둘 중 하나의 정수를 float type으로 형변환 시켜 연산한다. 
		printf("%d %c %d = %.2f", int1, userOperator, int2, floatResult); //결과를 출력, 
		break;
	case '%': //사용자가 연산자 자리에 입력한 문자가 %일 경우
		result = int1 % int2; // 나머지를 구하는 연산을 수행한 후 결과값을 저장하는 변수에 저장.
		printf("%d %c %d = %d", int1, userOperator, int2, result); //결과를 출력
		break;
	default: //그 외의 연산자를 입력할 경우
		printf("계산할 수 없습니다"); 
		break;
	}

}

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");
	return;
}


/*
int main (void){

	int int1,int2;
	char userOperator;
	
	printf("수식을 입력하세요 (예: 4+7) : ");
	scanf("%d%c%d", &int1, &userOperator, &int2);

	switch (userOperator) {

	case '+': printf("%d %c %d = %d", int1, userOperator, int2, int1 + int2);
		break;
	case '-': printf("%d %c %d = %d", int1, userOperator, int2, int1 - int2);
		break;
	case '*': printf("%d %c %d = %d", int1, userOperator, int2, int1 * int2);
		break;
	case '/': printf("%d %c %d = %.2f", int1, userOperator, int2, (float)int1 / int2);
		break;
	case '%': printf("%d %c %d = %d", int1, userOperator, int2, int1 % int2);
		break;
	default: printf("계산할 수 없습니다");
		break;
	}

} */