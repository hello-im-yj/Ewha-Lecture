#include <stdio.h>

int main(void) {

	int int1, int2;

	while (int1 != 0 ) {
		pirntf("더하고자 하는 두 수 입력 (종료시 0 입력)\n");
		scanf("%d%d", &int1, &int2);
		printf("%d + %d = %d", int1, int2, int1 + int2);
	}
}