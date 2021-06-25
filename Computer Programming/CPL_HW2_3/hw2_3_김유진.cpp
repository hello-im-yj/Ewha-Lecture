#include <stdio.h>
#include <string.h>

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");
	return;
}

//함수 프로토타입
void ceaser(char[], int, char[]);

int main(void) {
	myInfo();

	//변수 선언
	char original [100]; //원래 문장을 담을 배열
	char cipher[100]; //암호 문장을 담을 배열
	int n;

	//입력 받은 문자열의 길이가 범위를 초과할 시 다시 입력받음.
	do { 
		printf("암호화할 문자열 입력(1~10자): "); 
		gets_s(original); //암호화 할 문자를 사용자에게 입력받아 original 배열에 저장.
	} while (strlen(original) > 10);

	//입력 받은 숫자의 길이가 범위를 초과할 시 다시 입력받음.
	do {
		printf("암호화에 필요한 숫자입력(1~10): "); 
		scanf(" %d", &n); //암호화에 필요한 숫자를 사용자에게 입력받아 변수 n에 저장.
						//엔터 문제를 해결하기 위해 %d 앞에 공백 추가하였음.
	} while (n < 1 || n>10);
	
	//암호화 해주는 함수를 호출
	ceaser(original, n, cipher);
	//결과 출력
	printf("원래 문장:%s\n", original); 
	printf("암호 문장:%s\n", cipher);

}

//암호화 해주는 함수 정의
void ceaser(char ori[],int n,char ci[]) {

	//원래 배열에 담겨있는 char의 아스키코드 값보다 n만큼 큰 아스키코드 값을 cipher 배열에 저장함.
	for (int i = 0; i < strlen(ori); i++) {
		ci[i] = ori[i] + n;
	} 
	ci[strlen(ori)] = '\0'; // Cipher 배열의 마지막 null을 추가해 문자열로 만들어줌.
}
