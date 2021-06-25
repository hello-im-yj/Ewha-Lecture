#include<stdio.h>
#define MONTH 12
#define YEAR 5

int main(void) {

	int year, month;
	float subtot, total;

	//배열 선언
	float rain[YEAR][MONTH] = { 
	{4.3,4.3,4.3,3.0,2.0,1.2,0.2,0.2,0.4,2.4,3.5,6.6},
	{8.5,8.2,1.2,1.6,2.4,0.0,5.2,0.9,0.3,0.9,1.4,7.3},
	{9.1,8.5,6.7,4.3,2.1,0.8,0.2,0.2,1.1,2.3,6.1,8.4},
	{7.2,9.9,8.4,3.3,1.2,0.8,0.4,0.0,0.6,1.7,4.3,6.2},
	{7.6,5.6,3.8,2.8,3.8,0.2,0.0,0.0,0.0,1.3,2.6,5.2}
	};

	printf("YEAR\tRAINFALL<inches>\n");

	for (year = 0, total = 0 ; year < YEAR; year++)
		//이 안에 쓴 변수는 for문 안에서만 유효한 변수가 됨.
	{
		for (month = 0, subtot = 0; month < MONTH; month++)
		{
			subtot += rain[year][month];
		}
		printf("%d\t%.1f\n", 2000 + year, subtot);
		total += subtot;
	
	}

	printf("the yearly average is %.1f inches.\n", total/YEAR);

	printf("monthly averages : \n");
	printf("JAN\t FEB\t MAR\t APR\t MAY\t JUN\t JUL\t AUG\t SEP\t OCT\t NOV\t DEC\n");

	for (month = 0; month < MONTH; month++) {
		for (year = 0; year < YEAR; year++) {
			subtot = rain[year][month];
		}printf("%.1f\t ", subtot);
	}

}