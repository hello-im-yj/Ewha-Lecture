#include<stdio.h>
#include<string.h>

//구조체
struct complex {
	double real;
	double img;
};
typedef struct complex complex;
//함수 프로토타입
complex paircomplex_call_by_value(complex com);
void paircomplex_call_by_ref(complex* com);
void printComplex(complex com, char []);

int main(void) {

	complex comp = { 3.4, 4.8 };
	complex pcomp;

	printComplex(comp, "Complex");
	pcomp = paircomplex_call_by_value(comp);
	printComplex(pcomp, "PairComplex");
	paircomplex_call_by_ref(&comp);
	printComplex(comp, "PairComplex");

}

void printComplex(complex com, char str[]) {
	printf("%s:\t%.1f+%.1f", str, com.real, com.img);
}
complex paircomplex_call_by_value(complex com) {
	com.img = -(com.img);
	return com;
}
void paircomplex_call_by_ref(complex* com) {
	com->img = -(com->img);
	return;
}


