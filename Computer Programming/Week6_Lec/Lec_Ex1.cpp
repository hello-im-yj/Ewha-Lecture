#include <stdio.h>

int main(void) {

	int a, b;
	while (true) {
		printf("���� �� ���� �Է��ϼ���.\n");
		scanf("%d%d", &a, &b);
		if (a == 0 && b == 0) {
			break;
		}
		printf("%d+%d=%d\n", a, b, a + b);
	}
	printf("����Ǿ����ϴ�.\n");
}