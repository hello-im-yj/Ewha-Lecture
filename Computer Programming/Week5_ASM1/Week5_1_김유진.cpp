#include <stdio.h>

int main(void) {

	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");

	int a, b; //입력받을 두 정수 a,b를 선언.
	printf("Enter the lower and upper limits:"); 
	scanf("%d%d", &a, &b); //사용자에게 두 정수 a,b를 입력받음.

	if (a>b) {
	//if문을 이용하여 a값이 b값보다 큰 경우에는 프로그램이 다음 문장을 출력하고 종료되도록 함.
	printf("Wrong input.\n");
	}
	
	else { 
	//i-else문을 사용하여 a값이 b값보다 크지 않을때만 프로그램이 실행되도록 함.
		for (int i = 0; i < b; i++) { 
		//index값이 a에서 b까지 1씩 증가되면서 다음의 문장을 반복수행.
			//printf("number:%d The square:%d The cube:%d\n", i, i * i, i * i * i);
			printf("number:%d The square:%d The cube:%d\n", a+i, (a+i) * (a+i), (a + i) * (a + i)* (a + i));
		}
	}
	

}