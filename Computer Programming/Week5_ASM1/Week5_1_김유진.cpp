#include <stdio.h>

int main(void) {

	printf("== == == == == == == == == = \n");
	printf("�а�: ���б�����\n");
	printf("�й�: 1748022\n");
	printf("����: ������\n");
	printf("== == == == == == == == == = \n\n");

	int a, b; //�Է¹��� �� ���� a,b�� ����.
	printf("Enter the lower and upper limits:"); 
	scanf("%d%d", &a, &b); //����ڿ��� �� ���� a,b�� �Է¹���.

	if (a>b) {
	//if���� �̿��Ͽ� a���� b������ ū ��쿡�� ���α׷��� ���� ������ ����ϰ� ����ǵ��� ��.
	printf("Wrong input.\n");
	}
	
	else { 
	//i-else���� ����Ͽ� a���� b������ ũ�� �������� ���α׷��� ����ǵ��� ��.
		for (int i = 0; i < b; i++) { 
		//index���� a���� b���� 1�� �����Ǹ鼭 ������ ������ �ݺ�����.
			//printf("number:%d The square:%d The cube:%d\n", i, i * i, i * i * i);
			printf("number:%d The square:%d The cube:%d\n", a+i, (a+i) * (a+i), (a + i) * (a + i)* (a + i));
		}
	}
	

}