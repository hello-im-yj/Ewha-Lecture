#include <stdio.h>

int main (void){
	//int score;
	char ch;
	printf("Input a letter.\n");
	scanf("%c", &ch);

	if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') 
		printf("%c is an alphabet.", ch);
	else if (ch >= '0' && ch <= '9')
		printf("%c is a number letter.", ch);
	else
		printf("%c is not an alphabet nor a number letter.", ch);

}