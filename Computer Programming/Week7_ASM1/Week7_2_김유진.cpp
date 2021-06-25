#include <stdio.h>

//함수 프로토타입
void myInfo(void);
void star(int, int);

int main(void) {

	myInfo();
	
	//변수 선언
	int a, b;
	
	//반복문
	while (true) { // while (a != 0 || b != 0)와 동일, 
		//if 에서 조건체크를 통해 (둘 다 0이 입력될 때 까지) 반복문을 빠져나갈 때까지 반복함.
		printf("양수 두 개 입력 (종료시 0 0 입력)\n");
		scanf("%d%d", &a, &b); //사용자로부터 정수 두개 입력받음.
		if (a == 0 && b == 0) break; //입력받은 정수가 모두 0이면 반복문 빠져나간 후 프로그램 종료
		star(a, b); //둘 다 0이 아니라면 star함수 호출, 사용자가 입력한 값을 인자로 전달해줌.

	} printf("프로그램 종료\n"); //반복문 빠져나가면 프로그램 종료됨.

}

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");
	return;
}

//별모양을 출력하는 함수
void star(int a, int b) {

	if (a <= 0 || b <= 0) { // a나 b가 음수이면 함수를 종료함.
		printf("잘못된 입력\n");
		return;
	}

	else { //a와 b가 모두 양수이면 다음을 실행
		for (int i = 0; i < a; i++) { //몇줄 실행할지 결정
			for (int j = 0; j < b; j++) { //별을 몇기 출력할지 결정
				printf("*"); 
			} printf("\n"); //안쪽 for문이 한번 돌면 다음 줄로 바꿔서 출력

		}
	}
}
