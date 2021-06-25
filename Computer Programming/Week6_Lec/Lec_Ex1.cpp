#include <stdio.h>

int main(void) {

	int a, b;
	while (true) {
		printf("더할 두 수를 입력하세요.\n");
		scanf("%d%d", &a, &b);
		if (a == 0 && b == 0) {
			break;
		}
		printf("%d+%d=%d\n", a, b, a + b);
	}
	printf("종료되었습니다.\n");
}