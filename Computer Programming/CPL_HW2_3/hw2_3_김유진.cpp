#include <stdio.h>
#include <string.h>

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("�а�: ���б�����\n");
	printf("�й�: 1748022\n");
	printf("����: ������\n");
	printf("== == == == == == == == == = \n\n");
	return;
}

//�Լ� ������Ÿ��
void ceaser(char[], int, char[]);

int main(void) {
	myInfo();

	//���� ����
	char original [100]; //���� ������ ���� �迭
	char cipher[100]; //��ȣ ������ ���� �迭
	int n;

	//�Է� ���� ���ڿ��� ���̰� ������ �ʰ��� �� �ٽ� �Է¹���.
	do { 
		printf("��ȣȭ�� ���ڿ� �Է�(1~10��): "); 
		gets_s(original); //��ȣȭ �� ���ڸ� ����ڿ��� �Է¹޾� original �迭�� ����.
	} while (strlen(original) > 10);

	//�Է� ���� ������ ���̰� ������ �ʰ��� �� �ٽ� �Է¹���.
	do {
		printf("��ȣȭ�� �ʿ��� �����Է�(1~10): "); 
		scanf(" %d", &n); //��ȣȭ�� �ʿ��� ���ڸ� ����ڿ��� �Է¹޾� ���� n�� ����.
						//���� ������ �ذ��ϱ� ���� %d �տ� ���� �߰��Ͽ���.
	} while (n < 1 || n>10);
	
	//��ȣȭ ���ִ� �Լ��� ȣ��
	ceaser(original, n, cipher);
	//��� ���
	printf("���� ����:%s\n", original); 
	printf("��ȣ ����:%s\n", cipher);

}

//��ȣȭ ���ִ� �Լ� ����
void ceaser(char ori[],int n,char ci[]) {

	//���� �迭�� ����ִ� char�� �ƽ�Ű�ڵ� ������ n��ŭ ū �ƽ�Ű�ڵ� ���� cipher �迭�� ������.
	for (int i = 0; i < strlen(ori); i++) {
		ci[i] = ori[i] + n;
	} 
	ci[strlen(ori)] = '\0'; // Cipher �迭�� ������ null�� �߰��� ���ڿ��� �������.
}
