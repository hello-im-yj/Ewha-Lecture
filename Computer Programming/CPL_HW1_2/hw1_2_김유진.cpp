#include <stdio.h>
void myInfo(void);

int main(void) {

	myInfo();

	//�������� �� �ʱ�ȭ
	int int1, int2, result=0; 
	char userOperator;  
	float floatResult=0; 
	// ������ ���� �� �Ҽ��� ����� ������ ������ float type ���� ���� ����

	printf("������ �Է��ϼ��� (��: 4+7) : ");
	scanf("%d%c%d", &int1, &userOperator, &int2); //����ڷκ��� ����,����,������ ���ʷ� �Է¹���.

	switch (userOperator) { //����ڰ� �Է��� ���ڿ��� ���Ͽ� ����� ���

	case '+': //����ڰ� ������ �ڸ��� �Է��� ���ڰ� +�� ���
		result = int1 + int2;//�Է��� ���ڸ� ���ϴ� ������ ������ �� ������� �����ϴ� ������ ����.
		printf("%d %c %d = %d", int1, userOperator, int2, result); //����� ���
		break;
	case '-': //����ڰ� ������ �ڸ��� �Է��� ���ڰ� -�� ���
		result = int1 - int2; //�Է��� ���ڸ� ���� ������ ������ �� ������� �����ϴ� ������ ����.
		printf("%d %c %d = %d", int1, userOperator, int2, result); //����� ���
		break;
	case '*': //����ڰ� ������ �ڸ��� �Է��� ���ڰ� *�� ���
		result = int1 * int2; //�Է��� ���ڸ� ���ϴ� ������ ������ �� ������� �����ϴ� ������ ����.
		printf("%d %c %d = %d", int1, userOperator, int2, result); //����� ���
		break;
	case '/': //����ڰ� ������ �ڸ��� �Է��� ���ڰ� /�� ���
		floatResult = (float)int1 / int2; //�Է��� ���ڸ� ������ ������ ������ �� ������� �����ϴ� ������ ����.
		// int�� �������� �����ϸ� ������� int�� ��ȯ�ǹǷ�, �� �� �ϳ��� ������ float type���� ����ȯ ���� �����Ѵ�. 
		printf("%d %c %d = %.2f", int1, userOperator, int2, floatResult); //����� ���, 
		break;
	case '%': //����ڰ� ������ �ڸ��� �Է��� ���ڰ� %�� ���
		result = int1 % int2; // �������� ���ϴ� ������ ������ �� ������� �����ϴ� ������ ����.
		printf("%d %c %d = %d", int1, userOperator, int2, result); //����� ���
		break;
	default: //�� ���� �����ڸ� �Է��� ���
		printf("����� �� �����ϴ�"); 
		break;
	}

}

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("�а�: ���б�����\n");
	printf("�й�: 1748022\n");
	printf("����: ������\n");
	printf("== == == == == == == == == = \n\n");
	return;
}


/*
int main (void){

	int int1,int2;
	char userOperator;
	
	printf("������ �Է��ϼ��� (��: 4+7) : ");
	scanf("%d%c%d", &int1, &userOperator, &int2);

	switch (userOperator) {

	case '+': printf("%d %c %d = %d", int1, userOperator, int2, int1 + int2);
		break;
	case '-': printf("%d %c %d = %d", int1, userOperator, int2, int1 - int2);
		break;
	case '*': printf("%d %c %d = %d", int1, userOperator, int2, int1 * int2);
		break;
	case '/': printf("%d %c %d = %.2f", int1, userOperator, int2, (float)int1 / int2);
		break;
	case '%': printf("%d %c %d = %d", int1, userOperator, int2, int1 % int2);
		break;
	default: printf("����� �� �����ϴ�");
		break;
	}

} */