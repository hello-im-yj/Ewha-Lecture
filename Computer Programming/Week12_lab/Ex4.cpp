//#include <stdio.h>
//#include<string.h>
//
//int vowel(char []);
//
//int main(void) {
//	char mystring[100];
//
//	while (true) {
//		printf("Input a string. <Input 'q'to quit.>");
//		gets_s(mystring);
//		if (strcmp(mystring, "q") == 0) break;
//		printf("there are %d letters and %d vowels in the string.\n", strlen(mystring), vowel(mystring));
//	}
//}
//
//int vowel(char arr[]) {
//	int count=0;
//	for (int i = 0; i < strlen(arr); i++) {
//		switch (arr[i]) {
//		case 'a': case 'e': case 'i': case 'o': case 'u':
//			count++;
//		}
//	}
//	return count;
//}