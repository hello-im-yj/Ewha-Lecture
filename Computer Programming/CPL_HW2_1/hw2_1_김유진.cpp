#include <stdio.h>
#include <stdlib.h> //rand() �Լ��� �����ϴ� �������
#include <time.h> //time() �Լ��� �����ϴ� �������

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("�а�: ���б�����\n");
	printf("�й�: 1748022\n");
	printf("����: ������\n");
	printf("== == == == == == == == == = \n\n");
	return;
}

//�Լ� ������Ÿ��
int compare(int, int);

int main(void) {
	
	myInfo();

	int user; //����� �Է� ��
	int randNum; //�������� ������ ��
	int check;

	srand(time(NULL)); //����� ���� �ٸ� ���� ������ �ϱ� ���Ͽ� seed�� ����
	randNum = rand()%10+1; //1~10���� ���� ����

	//printf("%d\n",randNum); // ���α׷��� ���������� �۵��Ǵ��� Ȯ���� �� ����ߴ� �ڵ�
	printf("���� ���纸����.\n"); 
	
	do {
		scanf("%d", &user); //����ڷκ��� ���� �Է¹���.
		check = compare(randNum, user); // �Է°��� ������ ���ϴ� �Լ� ȣ��

	} while (check); //compare�Լ��� return���� 0�� �� false�� �Ǿ� ���α׷� ����.
	//�� ���� ���ڰ� ��ȯ�Ǹ� �ٽ� �Է¹���.
}

//���޵� �� ���� ���ϰ� ����� ����ϴ� �Լ�
int compare(int randNum, int user) {
	
	//����� �Է� ���� ������ ������, ���� ��� �� 0 ��ȯ
	if (randNum == user) {
		printf("����!\n");
		return 0; 
	}

	//����� �Է� ������ ������ ũ��, up ��� �� 1 ��ȯ
	else if (randNum > user) {
			printf("Up\n");
			return 1;
	}

	//����� �Է� ������ ������ ������, down ��� �� 2 ��ȯ
	else if (randNum < user)  {
			printf("Down\n");
			return 2;
	};
}