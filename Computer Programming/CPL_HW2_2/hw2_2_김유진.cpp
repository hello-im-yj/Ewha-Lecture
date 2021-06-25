#include <stdio.h>
void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");
	return;
}

//함수 프로토타입
void printAll(int [][3],int);

int main(void) {
	myInfo();

	//2차원 정수 배열 선언 및 초기화
	int score[5][3] =
	{ {78,80,89},
	{97,88,99},
	{86,91,87},
	{68,70,79},
	{78,83,82}
	};

	//정수배열과 배열의 길이를 전달하며 사용자 정의 함수 호출
	printAll(score,5); 
}

//2차원 정수배열 및 배열의 길이를 전달받아 결과를 출력하는 함수
void printAll(int score[][3], int n){

	//학생별 성적 출력
	printf("<학생별 성적>\n");
	printf("번호\t국어\t영어\t수학\t총점\t평균\n");
	for (int i=0; i < n; i++) {
		int sumStu = 0; //학생별 총점을 담을 변수 선언 및 초기화
		printf("%d\t", i + 1);
		for (int j=0; j < 3; j++) {
			printf("%d\t", score[i][j]); //학생의 각 과목 점수를 차례로 출력
			sumStu += score[i][j]; //학생의 과목별 점수를 모두 더함.
		}
		printf("%d\t", sumStu); //학생별 총점 출력
		printf("%.2lf\n",(double)sumStu / 3); //학생별 평균을 두자리까지 출력
	}

	//과목별 평균 출력
	printf("\n<과목별 평균>\n");
	printf("국어\t영어\t수학\n");

	for (int j = 0; j < 3; j++) {
		int sumSub = 0; //과목별 총점을 담을 변수 선언 및 초기화
		for (int i = 0; i < n; i++) {
			sumSub += score[i][j]; // 각 과목의 점수를 모두 더함.
		} printf("%.2lf\t", (double)sumSub / 5); //과목별 평균을 두자리까지 출력
	}
}