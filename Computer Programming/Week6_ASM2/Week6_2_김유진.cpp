#include <stdio.h>

int main(void) {

	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");

	int menu, totalPrice = 0;
	//사용자에게 정수를 입력받을 menu라는 변수 선언, 
	//총 금액을 계산할 totalPrice라는 변수 선언하고 0으로 초기화

	do { 
		printf("=====   메뉴   =====\n");
		printf("1. 햄버거 : 4000원\n");
		printf("2. 콜라 : 2000원\n");
		printf("3. 치킨 : 3000원\n");
		printf("====================\n");
		printf("메뉴를 선택하세요 <주문 완료시 0 입력>\n");

		scanf("%d", &menu);
		//일단 한번 실행하여 사용자가 menu를 입력함. -> 초기화이면서 조건변경의 역할

		switch (menu) { //사용자가 입력한 menu값에 따라 다른 결과를 출력

		case 1: printf("햄버거를 주문하셨습니다.\n");
			totalPrice += 4000; //총 주문 금액에 햄버거 값을 더함.
			break;//switch문을 빠져나감.
		case 2: printf("콜라를 주문하셨습니다.\n");
			totalPrice += 2000; //총 주문 금액에 콜라 값을 더함.
			break;//switch문을 빠져나감.
		case 3: printf("치킨을 주문하셨습니다.\n");
			totalPrice += 3000; //총 주문 금액에 치킨 값을 더함.
			break;//switch문을 빠져나감.
		default: // 1,2,3 외의 값을 입력했을 때
			if (menu == 0) break; 
			//0을 입력했을 때 "잘못된 주문입니다"를 출력하지 않고 바로 종료하기위해!
			printf("잘못된 주문입니다.\n");
			break;
		}

	} while (menu != 0);  //조건체크 (menu가 0일때 까지 반복)

	//반복문이 종료되면 총 금액 출력
	printf("총 금액 : %d원 \n", totalPrice);
	printf("맛있게 드세요~\n");
}