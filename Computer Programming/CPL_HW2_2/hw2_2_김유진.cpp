#include <stdio.h>
void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("�а�: ���б�����\n");
	printf("�й�: 1748022\n");
	printf("����: ������\n");
	printf("== == == == == == == == == = \n\n");
	return;
}

//�Լ� ������Ÿ��
void printAll(int [][3],int);

int main(void) {
	myInfo();

	//2���� ���� �迭 ���� �� �ʱ�ȭ
	int score[5][3] =
	{ {78,80,89},
	{97,88,99},
	{86,91,87},
	{68,70,79},
	{78,83,82}
	};

	//�����迭�� �迭�� ���̸� �����ϸ� ����� ���� �Լ� ȣ��
	printAll(score,5); 
}

//2���� �����迭 �� �迭�� ���̸� ���޹޾� ����� ����ϴ� �Լ�
void printAll(int score[][3], int n){

	//�л��� ���� ���
	printf("<�л��� ����>\n");
	printf("��ȣ\t����\t����\t����\t����\t���\n");
	for (int i=0; i < n; i++) {
		int sumStu = 0; //�л��� ������ ���� ���� ���� �� �ʱ�ȭ
		printf("%d\t", i + 1);
		for (int j=0; j < 3; j++) {
			printf("%d\t", score[i][j]); //�л��� �� ���� ������ ���ʷ� ���
			sumStu += score[i][j]; //�л��� ���� ������ ��� ����.
		}
		printf("%d\t", sumStu); //�л��� ���� ���
		printf("%.2lf\n",(double)sumStu / 3); //�л��� ����� ���ڸ����� ���
	}

	//���� ��� ���
	printf("\n<���� ���>\n");
	printf("����\t����\t����\n");

	for (int j = 0; j < 3; j++) {
		int sumSub = 0; //���� ������ ���� ���� ���� �� �ʱ�ȭ
		for (int i = 0; i < n; i++) {
			sumSub += score[i][j]; // �� ������ ������ ��� ����.
		} printf("%.2lf\t", (double)sumSub / 5); //���� ����� ���ڸ����� ���
	}
}