#include<stdio.h> 
#define BASKET 7

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

	printf("�ް��ٱ��ϰ� 7�� �ֽ��ϴ�.\n");
	printf("�� �ٱ����� �ް� ������ �Է��ϼ���.\n");

	//���� ����& �ʱ�ȭ
	int egg[BASKET];
	int sum = 0, max, min;

	//�� basket ��(7��) ��ŭ for���� ���鼭 ����ڿ��� ���� �Է¹޾� �迭�� ����.
	for (int i = 0; i < BASKET; i++) { 
		scanf("%d", &egg[i]); 
	} printf("\n");

	printf("�ٱ����� �ް� ����\n");
	for (int i = 0; i < BASKET; i++) {
		//�迭�� ����� �ٱ����� �ް� ���� ���ʷ� ���
		printf("�ٱ��� %d: %2d\n", i + 1, egg[i]); 
		sum += egg[i]; // �迭�� ����� ��� �ް� ������ sum ������ ����

		//�ִ� �ּҰ��� �ʱⰪ�� �迭�� ���� ó�� ��(index==0�� ����� ��)���� ������
		if (i == 0) { 
			max = egg[i]; min = egg[i];
		}
		//�ް��� �ִ�,�ּҰ� ���ϱ�
		else { 
			if (max < egg[i]) {
				max = egg[i]; //�迭�� ���� ���� �ִ밪�� ���ϸ� ������Ʈ
			}
			if (min > egg[i]) {
				min = egg[i]; //�迭�� ���� ���� �ּҰ��� ���ϸ� ������Ʈ
			}
		}
	}

	printf("\n�� �ް� ��: %d\n", sum);
	printf("��� �ް� ��: %.2f\n", (double)sum / BASKET); //double�� ����ȯ�Ͽ� ��հ� ���.
	printf("�ִ� �ް� ��: %d\n", max);
	printf("�ּ� �ް� ��: %d\n", min);
}