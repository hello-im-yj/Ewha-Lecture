#include <stdio.h> 

int main(void) {

	printf("== == == == == == == == == = \n");
	printf("�а�: ���б�����\n");
	printf("�й�: 1748022\n");
	printf("����: ������\n");
	printf("== == == == == == == == == = \n\n");

	int menu, totalPrice = 0;
	//����ڿ��� ������ �Է¹��� menu��� ���� ����, 
	//�� �ݾ��� ����� totalPrice��� ���� �����ϰ� 0���� �ʱ�ȭ

	while (true) { //���ѷ���

		printf("=====   �޴�   =====\n");
		printf("1. �ܹ��� : 4000��\n");
		printf("2. �ݶ� : 2000��\n");
		printf("3. ġŲ : 3000��\n");
		printf("====================\n");
		printf("�޴��� �����ϼ��� <�ֹ� �Ϸ�� 0 �Է�>\n");

		scanf("%d", &menu);  //�ʱ�ȭ �� ���Ǻ���
		if (menu == 0) break; //menu�� 0�� �ԷµǸ� �ݺ����� ��������

		switch (menu) {
		case 1: printf("�ܹ��Ÿ� �ֹ��ϼ̽��ϴ�.\n");
			totalPrice += 4000;//�� �ֹ� �ݾ׿� �ܹ��� ���� ����.
			break; //switch���� ��������.
		case 2: printf("�ݶ� �ֹ��ϼ̽��ϴ�.\n"); 
			totalPrice += 2000;//�� �ֹ� �ݾ׿� �ݶ� ���� ����.
			break;//switch���� ��������.
		case 3: printf("ġŲ�� �ֹ��ϼ̽��ϴ�.\n");
			totalPrice += 3000;//�� �ֹ� �ݾ׿� ġŲ ���� ����.
			break;//switch���� ��������.
		default: printf("�߸��� �ֹ��Դϴ�.\n"); // 1,2,3 ���� ���� �Է����� ��
			break;
		}
	}

	//�ݺ����� ����Ǹ� �� �ݾ� ���
	printf("�� �ݾ� : %d�� \n", totalPrice);
	printf("���ְ� �弼��~\n");

}