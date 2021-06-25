#include <stdio.h>

int main(void) {

	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");
	
	int a; //입력받을 정수 a를 선언.
	int sum = 0; // sum 값을 정수로 선언하고, 초기화한다. 

	printf("Input an integer.\n"); 
	scanf("%d", &a); //사용자에게 정수 값을 입력받아 a에 저정한다. 
	
	if (a > 0) { //if 문을 사용하여 a가 0보다 클때만 실행되게 한다. 
		for (int i = 1; i <= a; i++) 
		// index값이 1일때부터 a일때까지 index값을 1씩 증가시키면서 아래 문장을 반복실행한다. 
		{
			if (i % 2 == 1 && i % 5 != 0) 
			//i값을 2로 나눈 나머지가 0이면서(홀수이면서), 동시에 5로 나눈 나머지가 0이 아닐때 (5의 배수가 아닐 때)
				sum += i; //i값을 sum 값에 더한다. 
		}

		printf("Sum of odd numbers which is not the multiples of 5 between 1 and %d is %d", a, sum);
	}

	else { //if-else문을 사용하여 a가 0 이하이면 프로그램이 다음과 같은 문구를 출력한 후, 종료된다.  
		printf("Program finished.");
	}
	

}