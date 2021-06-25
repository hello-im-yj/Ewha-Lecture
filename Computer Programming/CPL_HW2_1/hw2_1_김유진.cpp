#include <stdio.h>
#include <stdlib.h> //rand() 함수를 포함하는 헤더파일
#include <time.h> //time() 함수를 포함하는 헤더파일

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");
	return;
}

//함수 프로토타입
int compare(int, int);

int main(void) {
	
	myInfo();

	int user; //사용자 입력 값
	int randNum; //랜덤으로 생성한 값
	int check;

	srand(time(NULL)); //실행시 마다 다른 값이 나오게 하기 위하여 seed값 설정
	randNum = rand()%10+1; //1~10사이 난수 생성

	//printf("%d\n",randNum); // 프로그램이 정상적으로 작동되는지 확인할 때 사용했던 코드
	printf("수를 맞춰보세요.\n"); 
	
	do {
		scanf("%d", &user); //사용자로부터 수를 입력받음.
		check = compare(randNum, user); // 입력값과 난수를 비교하는 함수 호출

	} while (check); //compare함수의 return값이 0일 때 false가 되어 프로그램 종료.
	//그 외의 숫자가 반환되면 다시 입력받음.
}

//전달된 두 수를 비교하고 결과를 출력하는 함수
int compare(int randNum, int user) {
	
	//사용자 입력 값과 난수가 같으면, 정답 출력 후 0 반환
	if (randNum == user) {
		printf("정답!\n");
		return 0; 
	}

	//사용자 입력 값보다 난수가 크면, up 출력 후 1 반환
	else if (randNum > user) {
			printf("Up\n");
			return 1;
	}

	//사용자 입력 값보다 난수가 작으면, down 출력 후 2 반환
	else if (randNum < user)  {
			printf("Down\n");
			return 2;
	};
}