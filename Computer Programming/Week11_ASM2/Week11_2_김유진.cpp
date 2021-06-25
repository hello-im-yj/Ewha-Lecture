#include<stdio.h>
#include<string.h>

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

	//문자배열(크기:100) 선언
	char str[100];
	
	//무한반복문 만들기
	while (true) {

		//모음 개수를 세는 변수 선언, 반복할 때마다 0으로 초기화
		int count = 0;

		puts("\n문자열을 입력하세요.");
		gets_s(str); //사용자가 입력한 값을 str 배열에 저장

		//입력받은 값이 "q"이면 반복문 종료
		if (strcmp(str,"q") == 0) break;

		//str의 길이만큼 반복문을 돌면서 모음의 개수 확인
		for (int i = 0; i < strlen(str); i++) {

			//str배열의 i번째 문자가 모음이면 count변수 1 증가시킴
			switch (str[i]) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
			case 'A': case 'E': case 'I': case 'O': case 'U':
				count++;  break; 
			default: break;
			}
		}
		// 입력한 문자열의 총 글자수와 모음 개수 출력 
		printf("총 글자수: %d \t 모음 개수: %d\n", strlen(str), count);

	}//end of while

	//반복 종료시 출력할 메세지
	puts("Program finished.\n"); 
	
}