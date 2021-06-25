#include <stdio.h>

int main(void) {
	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");
	
	int menu,totalPrice=0;
	//사용자에게 정수를 입력받을 menu라는 변수 선언, 
	//총 금액을 계산할 totalPrice라는 변수 선언하고 초기화

	printf("=====   메뉴   =====\n");
	printf("1. 햄버거 : 4000원\n");
	printf("2. 콜라 : 2000원\n");
	printf("3. 치킨 : 3000원\n");
	printf("====================\n");
	printf("메뉴를 선택하세요 <주문 완료시 0 입력>\n");

	scanf("%d", &menu); //초기화

	while (menu != 0) { //조건체크 (menu가 0이 될 때 까지 반복)
		switch (menu) { //사용자가 입력한 menu값에 따라 다른 결과를 출력
		case 1: printf("햄버거를 주문하셨습니다.\n");
			totalPrice += 4000; //총 주문 금액에 햄버거 값을 더함.
			break; //switch문을 빠져나감.
		case 2: printf("콜라를 주문하셨습니다.\n");
			totalPrice += 2000; //총 주문 금액에 콜라 값을 더함.
			break; //switch문을 빠져나감.
		case 3: printf("치킨을 주문하셨습니다.\n");
			totalPrice += 3000; //총 주문 금액에 치킨 값을 더함.
			break; //switch문을 빠져나감.
		default : printf("잘못된 주문입니다.\n");
			//0이 아니면서 1,2,3 외의 값을 입력했을 때
			break;
		} 

		printf("=====   메뉴   =====\n");
		printf("1. 햄버거 : 4000원\n");
		printf("2. 콜라 : 2000원\n");
		printf("3. 치킨 : 3000원\n");
		printf("====================\n");
		printf("메뉴를 선택하세요 <주문 완료시 0 입력>\n");
		scanf("%d", &menu); //조건변경을 위해 한번 더 입력받음.
	} //0이 입력되면 조건 체크에 의해 반복문을 빠져나옴
	
	printf("총 금액 : %d원 \n", totalPrice); //반복문이 종료되면 총 금액 출력
	printf("맛있게 드세요~\n");



}