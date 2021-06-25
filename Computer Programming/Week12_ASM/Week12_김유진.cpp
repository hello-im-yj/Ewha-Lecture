#include <stdio.h>
#define SIZE 5
//전처리자로 SIZE 값을 모두 5로 상수 처리

//함수 프로토타입
void func_avg(int[], int);
void func_mult(int[], int);
void func_largest(int[], int);

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");
	return;
}

int main(void) {	
	
	myInfo();

	//변수선언
	int intArr[SIZE]; //크기가 5인 정수배열 선언
	char ch;
	
	//사용자에게 5개의 정수를 입력받음.
	printf("배열 원소를 5개 입력하세요.\n");
	//배열에 순서대로 저장.
	for (int i = 0; i < SIZE; i++) {
		scanf("%d", &intArr[i]);
	}
	printf("연산을 선택하세요.\n");
	printf("A:평균   M:곱   L:최대\n");
	//엔터('\n'문제 해결하기 위해 scanf문 앞에 공백 추가
	do {
		ch = getchar();
	} while (ch == '\n');
	//scanf(" %c", &ch);
	//사용자의 입력에 따라 알맞은 사용자 정의 함수 호출
	switch (ch) {
	case 'A': func_avg(intArr, SIZE); break;
	case 'M': func_mult(intArr, SIZE); break;
	case 'L': func_largest(intArr, SIZE); break;
	default: //세 문자 외에 입력 시 
		printf("잘못된 입력입니다.\n");
	}
	
}
//평균 구하는 함수
void func_avg(int arr[],int n) { //배열의 주소값과 길이를 받아옴
	int sum =0 ;
	double avg;
	//배열에 저장된 수의 총합 구하기
	for (int i = 0; i < n; i++) {
		sum += arr[i];
	}
	//배열에 저장된 수의 평균 구하기
	avg = (double)sum / n;
	printf("평균 : %.2lf\n", avg); //평균 출력
}
//곱 구하는 함수
void func_mult(int arr[], int n) {//배열의 주소값과 길이를 받아옴
	int mult = 1;
	//배열의 저장된 수의 곱 구하기
	for (int i = 0; i < n; i++) {
		mult *= arr[i];
	}
	printf("곱 : %d\n", mult); //곱 출력
}
void func_largest(int arr[], int n) {//배열의 주소값과 길이를 받아옴
	//배열의 저장된 수의 최대값으로 업데이트
	int max=arr[0];
	for (int i = 0; i < n; i++) {
		if (max < arr[i]) {
			max = arr[i];
		}
	}
	printf("최대 : %d", max); //최대값 출력
}