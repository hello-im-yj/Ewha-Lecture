#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void myInfo(void);

int main(void) {
	//���� ���� �� �ʱ�ȭ
	int user,n1=0,n2=0,n3=0,n4=0,n5=0,n6=0;
	int rand_num;

	myInfo();
	//������ �� ���� �ٸ� ������� ��� ���� seed�� ���ϵ��� ��������. 
	srand(time(NULL));

	printf("�� �� �������? (1~100000000) ");
	scanf("%d", &user); //����ڿ��� ���� �Է¹���.

	// ���� ���� ���� ������ �߸��� �Է� ��� �� ����
	if (user < 1 || user > 100000000) printf("�߸��� �Է�");

	else {
		//����ڰ� �Է��� ��ŭ ���� ����
		for (int i = 0; i < user; i++) {
			//�ֻ��� ���̹Ƿ� 1~6 ������ ���� �������� ���� ���� ��������.
			rand_num = rand() % 6 + 1;
			//1~6 ���� ���� ���� �� ���� ������ ���� ���� Ƚ���� 1�� ������Ŵ.
			switch (rand_num) {
			case 1:n1++;
				break;
			case 2:n2++;
				break;
			case 3:n3++;
				break;
			case 4:n4++;
				break;
			case 5: n5++;
				break;
			case 6: n6++;
				break;

			}//end of switch

		} //end of for
		//printf("%d % d % d % d % d % d %d \n", n1, n2, n3, n4, n5, n6, user);
		
		// �� ���� ���� ���� ��� (�Ҽ������� ����ؾ��ϹǷ� float ������ �ٲ㼭 ����)
		printf("1�� ���� : %.2f%%\n", (float)n1 / user * 100);
		printf("2�� ���� : %.2f%%\n", (float)n2 / user * 100);
		printf("3�� ���� : %.2f%%\n", (float)n3 / user * 100);
		printf("4�� ���� : %.2f%%\n", (float)n4 / user * 100);
		printf("5�� ���� : %.2f%%\n", (float)n5 / user * 100);
		printf("6�� ���� : %.2f%%\n", (float)n6 / user * 100);

	}//end of else
	
}

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("�а�: ���б�����\n");
	printf("�й�: 1748022\n");
	printf("����: ������\n");
	printf("== == == == == == == == == = \n\n");
	return;
}
