#include <stdio.h>

void myInfo(void);
int main(void) {
	
	myInfo();

	//������ ���� size ����
	int size; 
	
	printf("<�� ������ ���>\n");
	printf("�뷮�� �Է��ϼ��� ");
	scanf("%d", &size); //���� �ʱ�ȭ,����ڰ� �Է��� ���� size�� ����

	//if-else ���� �̿��Ͽ� size ���� ���� �ٸ� ����� ��� 
	if (size>0 && size<=100) { //size���� 0���� ũ�鼭 100���� ���� ��
		//�� ������ ��� �����ϴ� ��Ȳ���� ����Ǿ�� �ϹǷ�,&&������ ���
		printf("�� ������� Small�Դϴ�.");			
	}
	else if (size > 100 && size <= 200) {//size���� 100���� ũ�鼭 200���� ���� ��
		printf("�� ������� Medium�Դϴ�.");
	}
	else if (size > 200 && size <= 300) {//size���� 200���� ũ�鼭 300���� ���� ��
		printf("�� ������� Large�Դϴ�.");
	}
	else if (size <= 0 || size > 300) {
		//�� ���� �� �ϳ��� ���̶�� ����Ǿ�� �ϹǷ�,||������ ���
		//else�� ����ص� ��. 
		printf("�߸��� �Է��Դϴ�.");
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
