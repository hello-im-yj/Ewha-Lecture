#include<stdio.h>
#include<string.h>

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("�а�: ���б�����\n");
	printf("�й�: 1748022\n");
	printf("����: ������\n");
	printf("== == == == == == == == == = \n\n");
	return;
}

int main(void) {

	myInfo();

	//���ڹ迭(ũ��:100) ����
	char str[100];
	
	//���ѹݺ��� �����
	while (true) {

		//���� ������ ���� ���� ����, �ݺ��� ������ 0���� �ʱ�ȭ
		int count = 0;

		puts("\n���ڿ��� �Է��ϼ���.");
		gets_s(str); //����ڰ� �Է��� ���� str �迭�� ����

		//�Է¹��� ���� "q"�̸� �ݺ��� ����
		if (strcmp(str,"q") == 0) break;

		//str�� ���̸�ŭ �ݺ����� ���鼭 ������ ���� Ȯ��
		for (int i = 0; i < strlen(str); i++) {

			//str�迭�� i��° ���ڰ� �����̸� count���� 1 ������Ŵ
			switch (str[i]) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
			case 'A': case 'E': case 'I': case 'O': case 'U':
				count++;  break; 
			default: break;
			}
		}
		// �Է��� ���ڿ��� �� ���ڼ��� ���� ���� ��� 
		printf("�� ���ڼ�: %d \t ���� ����: %d\n", strlen(str), count);

	}//end of while

	//�ݺ� ����� ����� �޼���
	puts("Program finished.\n"); 
	
}