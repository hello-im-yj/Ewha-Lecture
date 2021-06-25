#include <stdio.h>
#define SIZE 5
//��ó���ڷ� SIZE ���� ��� 5�� ��� ó��

//�Լ� ������Ÿ��
void func_avg(int[], int);
void func_mult(int[], int);
void func_largest(int[], int);

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

	//��������
	int intArr[SIZE]; //ũ�Ⱑ 5�� �����迭 ����
	char ch;
	
	//����ڿ��� 5���� ������ �Է¹���.
	printf("�迭 ���Ҹ� 5�� �Է��ϼ���.\n");
	//�迭�� ������� ����.
	for (int i = 0; i < SIZE; i++) {
		scanf("%d", &intArr[i]);
	}
	printf("������ �����ϼ���.\n");
	printf("A:���   M:��   L:�ִ�\n");
	//����('\n'���� �ذ��ϱ� ���� scanf�� �տ� ���� �߰�
	do {
		ch = getchar();
	} while (ch == '\n');
	//scanf(" %c", &ch);
	//������� �Է¿� ���� �˸��� ����� ���� �Լ� ȣ��
	switch (ch) {
	case 'A': func_avg(intArr, SIZE); break;
	case 'M': func_mult(intArr, SIZE); break;
	case 'L': func_largest(intArr, SIZE); break;
	default: //�� ���� �ܿ� �Է� �� 
		printf("�߸��� �Է��Դϴ�.\n");
	}
	
}
//��� ���ϴ� �Լ�
void func_avg(int arr[],int n) { //�迭�� �ּҰ��� ���̸� �޾ƿ�
	int sum =0 ;
	double avg;
	//�迭�� ����� ���� ���� ���ϱ�
	for (int i = 0; i < n; i++) {
		sum += arr[i];
	}
	//�迭�� ����� ���� ��� ���ϱ�
	avg = (double)sum / n;
	printf("��� : %.2lf\n", avg); //��� ���
}
//�� ���ϴ� �Լ�
void func_mult(int arr[], int n) {//�迭�� �ּҰ��� ���̸� �޾ƿ�
	int mult = 1;
	//�迭�� ����� ���� �� ���ϱ�
	for (int i = 0; i < n; i++) {
		mult *= arr[i];
	}
	printf("�� : %d\n", mult); //�� ���
}
void func_largest(int arr[], int n) {//�迭�� �ּҰ��� ���̸� �޾ƿ�
	//�迭�� ����� ���� �ִ밪���� ������Ʈ
	int max=arr[0];
	for (int i = 0; i < n; i++) {
		if (max < arr[i]) {
			max = arr[i];
		}
	}
	printf("�ִ� : %d", max); //�ִ밪 ���
}