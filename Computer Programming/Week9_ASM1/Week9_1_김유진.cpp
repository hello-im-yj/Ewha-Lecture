#include <stdio.h>

void myInfo(void);
int oddSum(int);

int main(void) {

	myInfo();

	//��������
	int n, m, firstNum;

	printf("���� ������ �Է��ϼ��� : ");
	scanf("%d", &n); //����ڿ��� ���� �Է¹���.

	//0 ������ ���� �ԷµǸ�, �߸��� �Է� ��� �� �Լ� ����.
	if (n <= 0) {
		printf("�߸��� �Է�\n");
	}

	else {
		//¦������ Ȧ������ üũ
		if (n % 2 == 0) firstNum = n - 1; //¦���̸� -1 ���� ��, �� ������ �Լ� ȣ��.
		else firstNum = n; //Ȧ���̸� �׳� ȣ��
		m = oddSum(firstNum); //�Լ� ȣ�� �� ����� m�� ����.

		printf("1���� %d������ Ȧ���� ���� %d�Դϴ�.\n", n, m); //��� ���
	}	

}

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("�а�: ���б�����\n");
	printf("�й�: 1748022\n");
	printf("����: ������\n");
	printf("== == == == == == == == == = \n\n");
	return;
}

int oddSum(int n) {

	int result;

	if (n == 1) return 1; // ������ ��(1)�� ȣ��Ǹ�, 1�� ����. 
	result = n + oddSum(n - 2); //Ȧ���� ���̹Ƿ� -2 ���� ���� Ȧ���� ȣ���Ͽ� ������.

	return result; //����� ��ȯ
}
