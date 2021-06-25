//#include<stdio.h>
//#define NUM 5
//
//struct student {
//	char name[20];
//	int score;
//};
//typedef struct student student;
//double avg(student* st);
//
//int main(void) {
//
//	student stu[NUM] = { {"Tom",0},{"Jane",0},{"Ted",0},{"Candy",0},{"John",0} };
//	int i;
//	int max;
//	printf("Input score.\n");
//	for (i = 0; i < NUM; i++) {
//		printf("%s: ", stu[i].name);
//		scanf("%d", &stu[i].score);
//	}
//	printf("\nNAME\tSCORE\n");
//	for (i = 0; i < NUM; i++) {
//		printf("%s\t%d\n", stu[i].name, stu[i].score);
//	}
//	printf("Average: %.2lf", avg(stu));
//
//}
//
//double avg(student* stu) {
//	int i, sum = 0;
//	for (i = 0; i < NUM; i++) {
//		sum += stu[i].score;
//	}
//	return (double)sum/NUM;
//}