#include<stdio.h>

void myInfo(void);
int main(void) {

	myInfo();

	//변수 선언
	int h;

	printf("높이입력 : ");
	scanf("%d", &h); //사용자로부터 높이값을 입력받음

	if (h < 1 || h>20) { //만약 입력된 h값이 1미만이거나 20을 초과할 경우 다음을 출력
		printf("잘못된 입력");
	}

	else { //입력된 h값이 1이상 20 이하일 때 다음의 작업을 수행

		for (int i = 0; i < h; i++) {//사용자가 입력한 만큼 반복, 전체 몇줄이 출력될지 결정
			for (int j = h-1 ; j > i; j--) { //공백이 몇개 출력될지 결정
				printf(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) { //*이 몇개 출력될지 결정
				printf("*");
			}printf("\n"); //바깥 for문을 한번 돌면 다음 줄로 이동하여 출력
		}
	}
}//main함수 종료

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");
	return;
}
