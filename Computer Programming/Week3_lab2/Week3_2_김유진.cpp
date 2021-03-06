
#include<stdio.h>

int main(void) {

	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");

	int user, won_10, won_50, won_100, won_500;
	//사용자가 입력하는 금액과 동전의 개수는 모두 정수이므로 int type으로 선언.
	
	printf("금액입력(10~10000):");
	scanf_s("%d",&user); //scanf를 이용하여 사용자의 입력값을 user라는 변수에 정수형태로 저장.
	printf("\n금액은 %d원 입니다.\n", user); //user은 정수형태의 data이므로 %d 포맷지정자를 이용하여 출력함. 
	
	won_500 = user / 500; 
	//금액을 500으로 나눈 결과가 500원 짜리의 개수가 된다.  
	//(int끼리의 연산이므로 결과값의 정수 부분만 저장됨.)
	won_100 = (user % 500) / 100;
	// 500원 동전으로 바꾸고 남은 금액을 다시 100으로 나누면 100원짜리 동전의 개수를 구할 수 있다. 
	won_50 = (user % 100) / 50;
	// 100원 동전으로 바꾸고 남은 금액을 다시 50으로 나누면 50원짜리 동전의 개수를 구할 수 있다.
	won_10 = (user % 50) / 10;
	// 50원 동전으로 바꾸고 남은 금액을 다시 10으로 나누면 10원짜리 동전의 개수를 구할 수 있다.	
	
	printf("\n<동전개수>\n");
	printf("500원 : %d개\n",won_500); 
	printf("100원 : %d개\n", won_100);
	printf("50원 : %d개\n", won_50);
	printf("10원 : %d개\n", won_10);
	printf("최소 동전의 개수 : %d개", won_500 + won_100 + won_50 + won_10);
	// 앞에서 구한 동전의 개수를 모두 더해서 최소 동전의 개수를 int로 출력한다. 
}