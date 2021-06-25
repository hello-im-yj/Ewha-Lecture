#include <stdio.h>

int main(void) {

	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");

	int month; 
	printf("Choose the month you like.\n");
	scanf("%d", &month); //사용자로부터 숫자를 입력받는다. 
	//입력받을 숫자가 정수 형태이므로 %d 포맷지정자를 사용한다. 
	
	switch (month) { 
	//switch문을 이용하여 사용자가 입력한 값에 따라 출력 결과가 다르게 나타나도록 한다.
	case 3: case 4: case 5: //사용자가 입력한 값이 3,4,5 중 하나이면 아래 문장이 수행된다. 
		printf("You like spring.\n");
		break; //break;를 이용하여 다음 문장들이 출력되지 않도록 swich문을 빠져나간다. 
	case 6: case 7: case 8: //사용자가 입력한 값이 6,7,8 중 하나이면 아래 문장이 수행된다.
		printf("You lkie summer.\n");
		break;
	case 9: case 10: case 11: //사용자가 입력한 값이 9,10,11 중 하나이면 아래 문장이 수행된다.
		printf("You like fall.\n");
		break;
	case 12: case 1: case 2: //사용자가 입력한 값이 12,1,2 중 하나이면 아래 문장이 수행된다.
		printf("You like winter.\n");
		break;
	default : //1~12 사이의 숫자가 아닌 다른 값을 입력했을 때는 아래 문장이 출력된다. 
		printf("Wrong input");
	}
}