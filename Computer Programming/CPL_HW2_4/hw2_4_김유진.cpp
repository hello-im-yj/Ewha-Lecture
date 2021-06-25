#include<stdio.h>
#include<math.h> //sqrt�� pow�Լ��� �����ϴ� �������

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("�а�: ���б�����\n");
	printf("�й�: 1748022\n");
	printf("����: ������\n");
	printf("== == == == == == == == == = \n\n");
	return;
}

//����ü ����
struct point {
	//���
	int x;
	int y;
};
typedef struct point point;

//�Լ� ������Ÿ��
double dist(point, point);

int main(void) {	myInfo();

	//����ü ���� ����
	point p1, p2;
	
	//����ڷκ��� ù��° ��ǥ �Է¹���.
	printf("p1�� x,y��ǥ�� �Է��ϼ��� : ");
	scanf("%d%d", &p1.x, &p1.y); //.�����ڸ� �̿��Ͽ� point����ü ������ ����� ���� ����
	//����ڷκ��� �ι�° ��ǥ �Է¹���.
	printf("p2�� x,y��ǥ�� �Է��ϼ��� : ");
	scanf("%d%d", &p2.x, &p2.y);//.�����ڸ� �̿��Ͽ� point����ü ������ ����� ���� ����
	//��� ���
	printf("p1�� ��ǥ: (%d,%d)\n",p1.x,p1.y);
	printf("p2�� ��ǥ: (%d,%d)\n", p2.x, p2.y);
	printf("�� �� ������ �Ÿ�: %.2lf\n",dist(p1, p2)); //dist�Լ��� ȣ���Ͽ�, �Ÿ����� ���Ϲ޾� ���ڸ����� ���
}

//�� ��ǥ ������ �Ÿ��� ����Ͽ� ��ȯ�ϴ� ����� ���� �Լ�
double dist(point p1, point p2) {
	return sqrt(pow((p2.x - p1.x), 2) + pow((p2.y - p1.y), 2)); //�Ÿ��� ����Ͽ� ������.
}