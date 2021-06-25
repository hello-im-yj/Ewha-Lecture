#include <stdio.h>
//함수 프로토타입
void myInfo(void);
void multipleCheck(int int1, int int2);

int main(void) {
	myInfo();

	//변수선언
	int n, m;

	//초기화
	printf("첫번째 정수 : ");
	scanf("%d", &n); //사용자에게 첫번째 정수 입력받음
	printf("두번째 정수 : ");
	scanf("%d", &m); //사용자에게 두번째 정수 입력받음

	 while (n == 0 || m == 0 ||n<m) { //조건체크
		 // n이나 m값이 0이거나, n값이 m값보다 작을 경우에 계속 반복
		
		printf("잘못 입력하였습니다.\n\n");

		//사용자에게 다시 값을 입력받음 (조건변경)
		printf("첫번째 정수 : ");
		scanf("%d", &n);
		printf("두번째 정수 : ");
		scanf("%d", &m);
	}

	// 조건을 만족해 while문을 빠져나왔을 시에만 함수가 호출됨.
	multipleCheck(n, m);

}

//사용자에게 입력받은 값이 배수관계인지 판별하는 함수
void multipleCheck(int int1, int int2) {
	if (int1 % int2 == 0) //사용자에게 입력받은 값이 0으로 나누어 떨어지면 다음을 출력
		printf("%d는(은) %d의 배수입니다.", int1, int2);
	else //사용자에게 입력받은 값이 0으로 나누어 떨어지지 않으면 다음을 출력
		printf("%d는(은) %d의 배수가 아닙니다.", int1, int2);
	return; //반환값 없음.
}

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");
	return;
}
