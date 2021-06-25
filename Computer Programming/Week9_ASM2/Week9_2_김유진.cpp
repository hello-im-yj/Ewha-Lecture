#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void myInfo(void);

int main(void) {
	//변수 선언 및 초기화
	int user,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0;
	int rand_num;

	myInfo();
	//실행할 때 마다 다른 결과값을 얻기 위해 seed가 변하도록 설정해줌. 
	srand(time(NULL));

	printf("몇 번 던질까요? (1~100000000) ");
	scanf("%d", &user); //사용자에게 정수 입력받음.

	// 범위 외의 값이 들어오면 잘못된 입력 출력 후 종료
	if (user < 1 || user > 100000000) printf("잘못된 입력");

	else {
		//사용자가 입력한 만큼 난수 생성
		for (int i = 0; i < user; i++) {
			//주사위 값이므로 1~6 사이의 수가 나오도록 난수 값을 설정해줌.
			rand_num = rand() % 6 + 1;
			//1~6 사이 값이 나올 때 마다 각각의 수가 나온 횟수를 1씩 증가시킴.
			switch (rand_num) {
			case 1:n1++;
				break;
			case 2:n2++;
				break;
			case 3:n3++;
				break;
			case 4:n4++;
				break;
			case 5: n5++;
				break;
			case 6: n6++;
				break;

			}//end of switch

		} //end of for
		//printf("%d % d % d % d % d % d %d \n", n1, n2, n3, n4, n5, n6, user);
		
		// 각 수가 나온 비율 출력 (소수점까지 출력해야하므로 float 값으로 바꿔서 연산)
		printf("1의 비율 : %.2f%%\n", (float)n1 / user * 100);
		printf("2의 비율 : %.2f%%\n", (float)n2 / user * 100);
		printf("3의 비율 : %.2f%%\n", (float)n3 / user * 100);
		printf("4의 비율 : %.2f%%\n", (float)n4 / user * 100);
		printf("5의 비율 : %.2f%%\n", (float)n5 / user * 100);
		printf("6의 비율 : %.2f%%\n", (float)n6 / user * 100);

	}//end of else
	
}

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");
	return;
}
