#include<stdio.h>
#include<string.h>

int main(void) {

	int count = 0;
	char str[100];
	
	puts("���ڿ��� �Է��ϼ���.");
	gets_s(str);

	for (int i = 0; i < strlen(str); i++) {
		switch (str[i]) {
		case 'a': case 'e': case 'i': case 'o': case 'u' :
		case 'A': case 'E': case 'I': case 'O': case 'U':
			count++;  break;
		default: break;
		}
	}

	printf("�� ���ڼ�: %d %t ���� ����: %d\n", strlen(str), count);

}