#include <stdio.h>
//�Լ� ������Ÿ��
void myInfo(void);
void multipleCheck(int int1, int int2);

int main(void) {
	myInfo();

	//��������
	int n, m;

	//�ʱ�ȭ
	printf("ù��° ���� : ");
	scanf("%d", &n); //����ڿ��� ù��° ���� �Է¹���
	printf("�ι�° ���� : ");
	scanf("%d", &m); //����ڿ��� �ι�° ���� �Է¹���

	 while (n == 0 || m == 0 ||n<m) { //����üũ
		 // n�̳� m���� 0�̰ų�, n���� m������ ���� ��쿡 ��� �ݺ�
		
		printf("�߸� �Է��Ͽ����ϴ�.\n\n");

		//����ڿ��� �ٽ� ���� �Է¹��� (���Ǻ���)
		printf("ù��° ���� : ");
		scanf("%d", &n);
		printf("�ι�° ���� : ");
		scanf("%d", &m);
	}

	// ������ ������ while���� ���������� �ÿ��� �Լ��� ȣ���.
	multipleCheck(n, m);

}

//����ڿ��� �Է¹��� ���� ����������� �Ǻ��ϴ� �Լ�
void multipleCheck(int int1, int int2) {
	if (int1 % int2 == 0) //����ڿ��� �Է¹��� ���� 0���� ������ �������� ������ ���
		printf("%d��(��) %d�� ����Դϴ�.", int1, int2);
	else //����ڿ��� �Է¹��� ���� 0���� ������ �������� ������ ������ ���
		printf("%d��(��) %d�� ����� �ƴմϴ�.", int1, int2);
	return; //��ȯ�� ����.
}

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("�а�: ���б�����\n");
	printf("�й�: 1748022\n");
	printf("����: ������\n");
	printf("== == == == == == == == == = \n\n");
	return;
}
