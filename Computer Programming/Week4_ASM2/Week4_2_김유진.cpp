#include <stdio.h>

int main(void) {

	printf("== == == == == == == == == = \n");
	printf("�а�: ���б�����\n");
	printf("�й�: 1748022\n");
	printf("����: ������\n");
	printf("== == == == == == == == == = \n\n");

	int month; 
	printf("Choose the month you like.\n");
	scanf("%d", &month); //����ڷκ��� ���ڸ� �Է¹޴´�. 
	//�Է¹��� ���ڰ� ���� �����̹Ƿ� %d ���������ڸ� ����Ѵ�. 
	
	switch (month) { 
	//switch���� �̿��Ͽ� ����ڰ� �Է��� ���� ���� ��� ����� �ٸ��� ��Ÿ������ �Ѵ�.
	case 3: case 4: case 5: //����ڰ� �Է��� ���� 3,4,5 �� �ϳ��̸� �Ʒ� ������ ����ȴ�. 
		printf("You like spring.\n");
		break; //break;�� �̿��Ͽ� ���� ������� ��µ��� �ʵ��� swich���� ����������. 
	case 6: case 7: case 8: //����ڰ� �Է��� ���� 6,7,8 �� �ϳ��̸� �Ʒ� ������ ����ȴ�.
		printf("You lkie summer.\n");
		break;
	case 9: case 10: case 11: //����ڰ� �Է��� ���� 9,10,11 �� �ϳ��̸� �Ʒ� ������ ����ȴ�.
		printf("You like fall.\n");
		break;
	case 12: case 1: case 2: //����ڰ� �Է��� ���� 12,1,2 �� �ϳ��̸� �Ʒ� ������ ����ȴ�.
		printf("You like winter.\n");
		break;
	default : //1~12 ������ ���ڰ� �ƴ� �ٸ� ���� �Է����� ���� �Ʒ� ������ ��µȴ�. 
		printf("Wrong input");
	}
}