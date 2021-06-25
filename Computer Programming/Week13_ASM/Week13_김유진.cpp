#include<stdio.h>
#define SIZE 10

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");
	return;
}

//구조체 정의
struct student { 
	int score;
	char grade;
};
typedef struct student student;

//함수 프로토타입
void input_score(student*, int);
char grade_set(int);
void output(student*, int);

int main(void) {
	myInfo();

	//변수 선언
	student stu[SIZE];
	int num; //학생 수 입력할 변수
	
	do {
		printf("학생 수 입력(1~10) :");
		scanf("%d", &num); //사용자로부터 학생수를 입력받음.
	} while (num < 1 || num>10); //학생 수가 범위를 초과하면 다시 입력받음.

	input_score(stu, num); //점수 입력하는 함수 호출
	output(stu, num); //score,grade 출력하는 함수 호출

}

//구조체 배열을 받아서 score 입력 및 grade 입력
void input_score(student* stu, int n) {
	printf("\n<점수 입력>\n");
	for (int i = 0; i < n; i++) {
		do {
			printf("학생%d:", i + 1); //학생 번호 출력
			scanf("%d", &stu[i].score); //사용자로부터 점수를 입력받아, 구조체 변수의 score값에 학생 점수 입력
			if (stu[i].score < 0 || stu[i].score>100) printf("* 점수범위 : 0~100\n");
		} while (stu[i].score < 0 || stu[i].score>100); //점수가 범위를 초과하면 다시 입력받음.
		stu[i].grade = grade_set(stu[i].score); // grade_set함수를 호출하여, 구조체 변수의 grade값에 학생의 등급을 입력
	}
	return;
}

//input_score로부터 score 값을 받아서 grade를 반환하는 함수
char grade_set(int score) {
	//학생 점수에 따라 등급을 리턴
	switch (score/10) {
	case 10: case 9:
		return 'A';
	case 8: return 'B';
	case 7: return 'C';
	case 6: return 'D';
	default: return 'F';
	}

}

//구조체 배열명과 학생 수를 전달받아 score, grade를 출력하는 함수
void output(student* stu, int n) {
	//학생별 번호, 성적, 등급을 출력
	printf("\n<학점>\n");
	printf("번호\t성적\t등급\n");
	for (int i = 0; i < n; i++) {
		printf("%d\t%d\t%c\n", i + 1, (*(stu+i)).score, stu->grade); //stu[i]대신
	} 
	return;
}
