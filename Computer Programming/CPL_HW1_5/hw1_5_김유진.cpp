#include <stdio.h>

//�Լ� ������Ÿ��
void myInfo(void);
void printList(void);
int deposit(int total);
int withdraw(int total);

int main(void) {

	myInfo();

	//���� ����, �ʱ�ȭ
	bool endCheck = false;
	int num,total = 0 ;

	while (true) {
		
		printList(); //�ŷ� ������ �����ִ� �Լ� ȣ��

		scanf("%d", &num); //����ڰ� �ŷ� ������ �����ϸ�, �� ���� num�� ����. 

		switch (num) { //����� num���� ���� � �۾��� �������� ������.
		case 1:  //num==1�� ���
			total = deposit(total); //�Ա��۾��� �����ϴ� �Լ��� ȣ��
			//�Ա� �� total���� ���ڷ� ��������.
			//�Լ��� ������ ��, �Աݵ� �ݾ��� ������ ������ total ���� �ٲ���.
			break;
		case 2 : //num==2�� ���
			total = withdraw(total); //����۾��� �����ϴ� �Լ��� ȣ��
			//��� �� total���� ���ڷ� ��������.
			//�Լ��� ������ ��, ��ݵ� �ݾ��� ������ ������ total ���� �ٲ���.
			break;
		case 3: //num==3�� ���
			printf("���� �ܾ��� : %d �Դϴ�.\n", total);
			break;
		case 4: //num==4�� ���
			endCheck = true;
			break;
		default: printf("�ٽ� �����ϼ���!\n"); //1~4 ���� ���� ������ ���
		} if (endCheck == true) break; 
		//num==4�� ��쿡�� endCheck���� true�� �ٲ�鼭 switch���� �������� ���Ŀ� while�� ��������.

	}//while ���ѷ��� ����
	printf("�ŷ��� ����Ǿ����ϴ�.\n");
}//main�Լ� ����

//�ŷ� ������ �����ִ� �Լ�
void printList(void) {
	printf("\n           *EWHA BANK*           \n");
	printf("====================================\n");
	printf("����Ͻ� �ŷ��� �������ּ���.\n");
	printf("            1. �Ա�\n");
	printf("            2. ���\n");
	printf("            3. ��ȸ\n");
	printf("            4. ����\n");
	printf("====================================\n");
	return;
}

//�Ա��Լ�
int deposit(int total) { //�Ա� ����� ���� total(���� �� �ݾ�)���� ���ڷ� ������.
	int input;
	printf("�Ա� �ݾ��� �Է��ϼ���. : ");
	scanf("%d", &input); //����ڷκ��� �Ա��� �ݾ� �Է¹���.
	total += input; //�Է¹��� ���� �� �ݾ׿� ������.
	printf("�Ա� �� �ܾ��� %d�Դϴ�.\n",total); 
	return total; //main�Լ����� total�� ������ ���� �Ա� �� �ݾ��� ��ȯ����.
}

//����Լ�
int withdraw(int total) { //��� ����� ���� total(���� �� �ݾ�)���� ���ڷ� ������.
	int output;
	printf("��� �ݾ��� �Է��ϼ��� : ");
	scanf("%d", &output); //����ڷκ��� ����� �ݾ� �Է¹���.
	if (total < output) { //���� �Է°��� �� �ݾ׺��� Ŭ ��쿡�� ����� �������� ���� .
		printf("��� ���� : �ܾ׺���\n");
	}
	else { //�Է°��� �� �ݾ׺��� ���� ���
		total -= output; //�Է¹��� ���� ��ü �ݾ׿��� ����.
		printf("��� �� �ܾ��� %d�Դϴ�.\n", total);
	}
	return total; //main�Լ����� total�� ������ ���� ��� �� �ݾ��� ��ȯ����.
}

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("�а�: ���б�����\n");
	printf("�й�: 1748022\n");
	printf("����: ������\n");
	printf("== == == == == == == == == = \n\n");
	return;
}
