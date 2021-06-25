#include<stdio.h> 
#define BASKET 7

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

	printf("달걀바구니가 7개 있습니다.\n");
	printf("각 바구니의 달걀 개수를 입력하세요.\n");

	//변수 선언& 초기화
	int egg[BASKET];
	int sum = 0, max, min;

	//총 basket 수(7개) 만큼 for문을 돌면서 사용자에게 값을 입력받아 배열에 저장.
	for (int i = 0; i < BASKET; i++) { 
		scanf("%d", &egg[i]); 
	} printf("\n");

	printf("바구니의 달걀 개수\n");
	for (int i = 0; i < BASKET; i++) {
		//배열에 저장된 바구니의 달걀 개수 차례로 출력
		printf("바구니 %d: %2d\n", i + 1, egg[i]); 
		sum += egg[i]; // 배열에 저장된 모든 달걀 개수를 sum 변수에 저장

		//최대 최소값의 초기값을 배열의 가장 처음 값(index==0에 저장된 값)으로 설정함
		if (i == 0) { 
			max = egg[i]; min = egg[i];
		}
		//달걀의 최대,최소값 구하기
		else { 
			if (max < egg[i]) {
				max = egg[i]; //배열의 값을 현재 최대값과 비교하며 업데이트
			}
			if (min > egg[i]) {
				min = egg[i]; //배열의 값을 현재 최소값과 비교하며 업데이트
			}
		}
	}

	printf("\n총 달걀 수: %d\n", sum);
	printf("평균 달걀 수: %.2f\n", (double)sum / BASKET); //double로 형변환하여 평균값 출력.
	printf("최대 달걀 수: %d\n", max);
	printf("최소 달걀 수: %d\n", min);
}