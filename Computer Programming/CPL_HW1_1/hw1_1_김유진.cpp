#include <stdio.h>

void myInfo(void);
int main(void) {
	
	myInfo();

	//정수형 변수 size 선언
	int size; 
	
	printf("<컵 사이즈 계산>\n");
	printf("용량을 입력하세요 ");
	scanf("%d", &size); //변수 초기화,사용자가 입력한 값을 size에 저장

	//if-else 문을 이용하여 size 값에 따라 다른 결과를 출력 
	if (size>0 && size<=100) { //size값이 0보다 크면서 100보다 작을 때
		//두 조건을 모두 만족하는 상황에서 실행되어야 하므로,&&연산자 사용
		printf("컵 사이즈는 Small입니다.");			
	}
	else if (size > 100 && size <= 200) {//size값이 100보다 크면서 200보다 작을 때
		printf("컵 사이즈는 Medium입니다.");
	}
	else if (size > 200 && size <= 300) {//size값이 200보다 크면서 300보다 작을 때
		printf("컵 사이즈는 Large입니다.");
	}
	else if (size <= 0 || size > 300) {
		//두 조건 중 하나라도 참이라면 실행되어야 하므로,||연산자 사용
		//else를 사용해도 됨. 
		printf("잘못된 입력입니다.");
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
