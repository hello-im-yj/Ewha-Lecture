#include<stdio.h>
#include<math.h> //sqrt와 pow함수를 포함하는 헤더파일

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");
	return;
}

//구조체 선언
struct point {
	//멤버
	int x;
	int y;
};
typedef struct point point;

//함수 프로토타입
double dist(point, point);

int main(void) {	myInfo();

	//구조체 변수 선언
	point p1, p2;
	
	//사용자로부터 첫번째 좌표 입력받음.
	printf("p1의 x,y좌표를 입력하세요 : ");
	scanf("%d%d", &p1.x, &p1.y); //.연산자를 이용하여 point구조체 변수의 멤버에 값을 저장
	//사용자로부터 두번째 좌표 입력받음.
	printf("p2의 x,y좌표를 입력하세요 : ");
	scanf("%d%d", &p2.x, &p2.y);//.연산자를 이용하여 point구조체 변수의 멤버에 값을 저장
	//결과 출력
	printf("p1의 좌표: (%d,%d)\n",p1.x,p1.y);
	printf("p2의 좌표: (%d,%d)\n", p2.x, p2.y);
	printf("두 점 사이의 거리: %.2lf\n",dist(p1, p2)); //dist함수를 호출하여, 거리값을 리턴받아 두자리까지 출력
}

//두 좌표 사이의 거리를 계산하여 반환하는 사용자 정의 함수
double dist(point p1, point p2) {
	return sqrt(pow((p2.x - p1.x), 2) + pow((p2.y - p1.y), 2)); //거리를 계산하여 리턴함.
}