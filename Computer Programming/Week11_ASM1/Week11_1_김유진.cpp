#include<stdio.h>
#include<string.h>

int main(void) {

	int count = 0;
	char str[100];
	
	puts("문자열을 입력하세요.");
	gets_s(str);

	for (int i = 0; i < strlen(str); i++) {
		switch (str[i]) {
		case 'a': case 'e': case 'i': case 'o': case 'u' :
		case 'A': case 'E': case 'I': case 'O': case 'U':
			count++;  break;
		default: break;
		}
	}

	printf("총 글자수: %d %t 모음 개수: %d\n", strlen(str), count);

}