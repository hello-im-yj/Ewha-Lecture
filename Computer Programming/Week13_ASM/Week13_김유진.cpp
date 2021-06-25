#include<stdio.h>
#define SIZE 10

void myInfo(void) {
	printf("== == == == == == == == == = \n");
	printf("�а�: ���б�����\n");
	printf("�й�: 1748022\n");
	printf("����: ������\n");
	printf("== == == == == == == == == = \n\n");
	return;
}

//����ü ����
struct student { 
	int score;
	char grade;
};
typedef struct student student;

//�Լ� ������Ÿ��
void input_score(student*, int);
char grade_set(int);
void output(student*, int);

int main(void) {
	myInfo();

	//���� ����
	student stu[SIZE];
	int num; //�л� �� �Է��� ����
	
	do {
		printf("�л� �� �Է�(1~10) :");
		scanf("%d", &num); //����ڷκ��� �л����� �Է¹���.
	} while (num < 1 || num>10); //�л� ���� ������ �ʰ��ϸ� �ٽ� �Է¹���.

	input_score(stu, num); //���� �Է��ϴ� �Լ� ȣ��
	output(stu, num); //score,grade ����ϴ� �Լ� ȣ��

}

//����ü �迭�� �޾Ƽ� score �Է� �� grade �Է�
void input_score(student* stu, int n) {
	printf("\n<���� �Է�>\n");
	for (int i = 0; i < n; i++) {
		do {
			printf("�л�%d:", i + 1); //�л� ��ȣ ���
			scanf("%d", &stu[i].score); //����ڷκ��� ������ �Է¹޾�, ����ü ������ score���� �л� ���� �Է�
			if (stu[i].score < 0 || stu[i].score>100) printf("* �������� : 0~100\n");
		} while (stu[i].score < 0 || stu[i].score>100); //������ ������ �ʰ��ϸ� �ٽ� �Է¹���.
		stu[i].grade = grade_set(stu[i].score); // grade_set�Լ��� ȣ���Ͽ�, ����ü ������ grade���� �л��� ����� �Է�
	}
	return;
}

//input_score�κ��� score ���� �޾Ƽ� grade�� ��ȯ�ϴ� �Լ�
char grade_set(int score) {
	//�л� ������ ���� ����� ����
	switch (score/10) {
	case 10: case 9:
		return 'A';
	case 8: return 'B';
	case 7: return 'C';
	case 6: return 'D';
	default: return 'F';
	}

}

//����ü �迭��� �л� ���� ���޹޾� score, grade�� ����ϴ� �Լ�
void output(student* stu, int n) {
	//�л��� ��ȣ, ����, ����� ���
	printf("\n<����>\n");
	printf("��ȣ\t����\t���\n");
	for (int i = 0; i < n; i++) {
		printf("%d\t%d\t%c\n", i + 1, (*(stu+i)).score, stu->grade); //stu[i]���
	} 
	return;
}
