#include <stdio.h>

int main(void) {

	printf("== == == == == == == == == = \n");
	printf("�а�: ���б�����\n");
	printf("�й�: 1748022\n");
	printf("����: ������\n");
	printf("== == == == == == == == == = \n\n");
	
	int a; //�Է¹��� ���� a�� ����.
	int sum = 0; // sum ���� ������ �����ϰ�, �ʱ�ȭ�Ѵ�. 

	printf("Input an integer.\n"); 
	scanf("%d", &a); //����ڿ��� ���� ���� �Է¹޾� a�� �����Ѵ�. 
	
	if (a > 0) { //if ���� ����Ͽ� a�� 0���� Ŭ���� ����ǰ� �Ѵ�. 
		for (int i = 1; i <= a; i++) 
		// index���� 1�϶����� a�϶����� index���� 1�� ������Ű�鼭 �Ʒ� ������ �ݺ������Ѵ�. 
		{
			if (i % 2 == 1 && i % 5 != 0) 
			//i���� 2�� ���� �������� 0�̸鼭(Ȧ���̸鼭), ���ÿ� 5�� ���� �������� 0�� �ƴҶ� (5�� ����� �ƴ� ��)
				sum += i; //i���� sum ���� ���Ѵ�. 
		}

		printf("Sum of odd numbers which is not the multiples of 5 between 1 and %d is %d", a, sum);
	}

	else { //if-else���� ����Ͽ� a�� 0 �����̸� ���α׷��� ������ ���� ������ ����� ��, ����ȴ�.  
		printf("Program finished.");
	}
	

}