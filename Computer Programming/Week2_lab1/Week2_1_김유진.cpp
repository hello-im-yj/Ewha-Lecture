
#include <stdio.h>

int main(void) {

	printf("== == == == == == == == == = \n");
	printf("학과: 과학교육과\n");
	printf("학번: 1748022\n");
	printf("성명: 김유진\n");
	printf("== == == == == == == == == = \n\n");

	char A = 'A'; //문자를 저장하기 위해 char type 변수 A를 선언하고, 'A'라는 문자를 저장.
	// char type 변수에 문자값을 저장하기 위해서는 작은 따옴표(')를 이용한다.
	char X = 'X'; //char type 변수 X를 선언하고, 'X'라는 문자를 저장.
	char q = '?'; //char type 변수 q를 선언하고, '?'라는 문자를 저장.
	char a = '@'; //char type 변수 a를 선언하고, '@'라는 문자를 저장.

	char seven = 55; 
	char U = 85; 
	char d = 100; 
	char x = 120; 
			
	printf("문자 '%c'의 아스키코드는 %d 입니다.\n", A, A); 
	printf("문자 '%c'의 아스키코드는 %d 입니다.\n", X, X);
	printf("문자 '%c'의 아스키코드는 %d 입니다.\n", q, q);
	printf("문자 '%c'의 아스키코드는 %d 입니다.\n\n", a, a);

	/* char type 변수 안에 저장된 정보를 문자 형태로 출력하기 위해서는 포맷지정자 %c를 사용한다.
	 char type 안에 실제로 저장되는 값은 아스키코드이므로, 포맷지정자 %d를 이용하면 이를 정수 형태로 출력할 수도 있다. 
	 char type으로 선언된 변수는 포맷지정자에 따라 문자로 출력될수도, 숫자로 출력될수도 있다. */

	printf("아스키코드 %d에 해당하는 문자는 '%c'입니다.\n", seven, seven);
	printf("아스키코드 %d에 해당하는 문자는 '%c'입니다.\n", U, U);
	printf("아스키코드 %d에 해당하는 문자는 '%c'입니다.\n", d, d);
	printf("아스키코드 %d에 해당하는 문자는 '%c'입니다.\n", x, x);


}

