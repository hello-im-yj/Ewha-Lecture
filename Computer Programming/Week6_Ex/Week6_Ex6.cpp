#include <stdio.h>

int main(void) {
	int score=0;
	char grade;

	while (score >=0 && score <= 100){
		printf("Input score <0~100>. to quit, input negative numner.");
		scanf("%d", &score);

		switch (score / 10) {
		case 10: case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		case 5: case 4: case 3: case 2:case 1: case 0: grade = 'F'; break;
			//default·Î ½áµµ µÊ.
		}
		if (score >= 0 && score <= 100)
		printf("Score : %d\nGrade : %c\n", score, grade);
	} 


}