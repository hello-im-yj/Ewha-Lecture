#include <stdio.h>

void myInfo(void);
int oddSum(int);

int main(void) {

	myInfo();

	//변수선언
	int n, m, firstNum;

	printf("양의 정수를 입력하세요 : ");
	scanf("%d", &n); //사용자에게 정수 입력받음.

	//0 이하의 값이 입력되면, 잘못된 입력 출력 후 함수 종료.
	if (n <= 0) {
		printf("잘못된 입력\n");
	}

	else {
		//짝수인지 홀수인지 체크
		if (n % 2 == 0) firstNum = n - 1; //짝수이면 -1 해준 후, 그 값으로 함수 호출.
		else firstNum = n; //홀수이면 그냥 호출
		m = oddSum(firstNum); //함수 호출 후 결과값 m에 저장.

		printf("1부터 %d까지의 홀수의 합은 %d입니다.\n", n, m); //결과 출력
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

int oddSum(int n) {

	int result;

	if (n == 1) return 1; // 마지막 값(1)이 호출되면, 1을 리턴. 
	result = n + oddSum(n - 2); //홀수의 합이므로 -2 해준 다음 홀수값 호출하여 더해줌.

	return result; //결과값 반환
}
