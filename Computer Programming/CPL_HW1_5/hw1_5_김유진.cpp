#include <stdio.h>

//함수 프로토타입
void myInfo(void);
void printList(void);
int deposit(int total);
int withdraw(int total);

int main(void) {

	myInfo();

	//변수 선언, 초기화
	bool endCheck = false;
	int num,total = 0 ;

	while (true) {
		
		printList(); //거래 종류를 보여주는 함수 호출

		scanf("%d", &num); //사용자가 거래 종류를 선택하면, 그 값을 num에 저장. 

		switch (num) { //저장된 num값에 따라 어떤 작업을 실행할지 결정함.
		case 1:  //num==1인 경우
			total = deposit(total); //입금작업을 수행하는 함수를 호출
			//입금 전 total값을 인자로 전달해줌.
			//함수를 실행한 후, 입금된 금액이 더해진 값으로 total 값을 바꿔줌.
			break;
		case 2 : //num==2인 경우
			total = withdraw(total); //출금작업을 수행하는 함수를 호출
			//출금 전 total값을 인자로 전달해줌.
			//함수를 실행한 후, 출금된 금액이 더해진 값으로 total 값을 바꿔줌.
			break;
		case 3: //num==3인 경우
			printf("현재 잔액은 : %d 입니다.\n", total);
			break;
		case 4: //num==4인 경우
			endCheck = true;
			break;
		default: printf("다시 선택하세요!\n"); //1~4 외의 값을 선택한 경우
		} if (endCheck == true) break; 
		//num==4인 경우에서 endCheck값이 true로 바뀌면서 switch문을 빠져나온 직후에 while문 빠져나감.

	}//while 무한루프 종료
	printf("거래가 종료되었습니다.\n");
}//main함수 종료

//거래 종류를 보여주는 함수
void printList(void) {
	printf("\n           *EWHA BANK*           \n");
	printf("====================================\n");
	printf("사용하실 거래를 선택해주세요.\n");
	printf("            1. 입금\n");
	printf("            2. 출금\n");
	printf("            3. 조회\n");
	printf("            4. 종료\n");
	printf("====================================\n");
	return;
}

//입금함수
int deposit(int total) { //입금 계산을 위해 total(현재 총 금액)값을 인자로 가져옴.
	int input;
	printf("입금 금액을 입력하세요. : ");
	scanf("%d", &input); //사용자로부터 입금할 금액 입력받음.
	total += input; //입력받은 값을 총 금액에 더해줌.
	printf("입금 후 잔액은 %d입니다.\n",total); 
	return total; //main함수에서 total값 변경을 위해 입금 후 금액을 반환해줌.
}

//출금함수
int withdraw(int total) { //출금 계산을 위해 total(현재 총 금액)값을 인자로 가져옴.
	int output;
	printf("출금 금액을 입력하세요 : ");
	scanf("%d", &output); //사용자로부터 출금할 금액 입력받음.
	if (total < output) { //만약 입력값이 총 금액보다 클 경우에는 출금을 수행하지 않음 .
		printf("출금 실패 : 잔액부족\n");
	}
	else { //입력값이 총 금액보다 작을 경우
		total -= output; //입력받은 값을 전체 금액에서 빼줌.
		printf("출금 후 잔액은 %d입니다.\n", total);
	}
	return total; //main함수에서 total값 변경을 위해 출금 후 금액을 반환해줌.
}

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");
	return;
}
