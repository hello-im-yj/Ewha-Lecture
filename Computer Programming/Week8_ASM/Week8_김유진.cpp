#include<stdio.h>
#include<math.h>

//�Լ� ������Ÿ��
void myInfo(void);
void func(char*, double*,double*);

int main(void) {
	myInfo();

	//���� ����
	char ch;
	double a, b;
	printf("����(R�Ǵ� P)�� ��� �� �� �Է�\n");
	//����ڷκ��� ���� 1, ���2(�ε��Ҽ�����) �Է¹���.
	scanf("%c%lf%lf",&ch, &a, &b);
	//�Է¹��� ���� �ּҸ� &�����ڸ� �̿��Ͽ� func�� ����.
	func(&ch, &a, &b);
	//�ٲ� ����� ���
	printf("a=%.2lf b=%.2lf",a, b);

}

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("�а�: ���б�����\n");
	printf("�й�: 1748022\n");
	printf("����: ������\n");
	printf("== == == == == == == == == = \n\n");
	return;
}

//�ּҰ��� ���޹޾Ƽ� �����ͺ��� ���� ����
void func(char* ptrc, double* ptra, double* ptrb) {
	//����ڰ� �Է��� ���� r �Ǵ� R�� ���
	if (*ptrc == 'r' || *ptrc == 'R') {
		printf("<���>\n");
		printf("��Ʈ��\n");
		//sqrt �Լ� ����Ͽ� ptra, ptra�� ����Ű�� ���� ����� ���� ���� ���� ��Ʈ ������ ����.
		*ptra = sqrt(*ptra);
		*ptrb = sqrt(*ptrb);

	}
	//����ڰ� �Է��� ���� p �Ǵ� P�� ���
	else if (*ptrc == 'p' || *ptrc == 'P') {
		printf("<���>\n");
		printf("5�°�\n");
		//pow �Լ� ����Ͽ� ptra, prtb�� ����Ű�� ���� ����� ���� ���� ���� 5���� ����.
		*ptra = pow(*ptra, 5);
		*ptrb = pow(*ptrb, 5);
	}
	//�� ���� ���ڸ� �Է¹��� ���
	else {
		printf("'%c'�� �߸��� �����Դϴ�.\n", *ptrc);
	}

}