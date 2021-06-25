// linked_stack.cpp : Defines the entry point for the console application.
//

//#include "stdafx.h"
#include "stdlib.h"
#include "stdio.h"
#include "string.h"

typedef int element;
typedef struct DlistNode {
	element data;
	struct DlistNode* llink;
	struct DlistNode* rlink;
} DlistNode;

typedef struct {
	DlistNode* top;
	DlistNode* head;
} LinkedStackType;

void init(LinkedStackType* s)
{
	s->head = (DlistNode*)malloc(sizeof(DlistNode));
	if (s->head == NULL) {
		fprintf(stderr, "Memory allocation error\n");
	}

	s->head->llink = s->head;
	s->head->rlink = s->head;
	s->top = s->head;
}

int is_empty(LinkedStackType* s)
{
	return (s->top == s->head);
}

void push(LinkedStackType* s, element item)
{
	DlistNode* temp = (DlistNode*)malloc(sizeof(DlistNode));
	if (temp == NULL) {
		fprintf(stderr, "Memory allocation error\n");
		return;
	}

	else {
		temp->data = item;

		temp->rlink = s->top;	//혹은 temp->rlink = s->head->rlink;
		s->top->llink = temp;	//혹은 s->head->rlink->llink = tmp; 
		s->head->rlink = temp;
		temp->llink = s->head;

		s->top = temp;	//혹은 s->top = s->head->rlink; 
	}
}

element pop(LinkedStackType* s)
{
	if (is_empty(s)) {
		fprintf(stderr, "Stack is empty\n");
		exit(1);
	}
	else {
		DlistNode* temp = s->top;
		int item = temp->data;

		s->head->rlink = s->top->rlink;
		s->top->rlink->llink = s->head;
		s->top = s->top->rlink;
		free(temp);
		
		return item;
	}
}

element peek(LinkedStackType* s)
{
	if (is_empty(s)) {
		fprintf(stderr, "Stack is empty\n");
		exit(1);
	}
	else {
		return s->top->data;
	}
}

void main()
{
	LinkedStackType s;
	init(&s);
	push(&s, 1);
	push(&s, 2);
	push(&s, 3);

	printf("%d\n", pop(&s));
	printf("%d\n", pop(&s));
	printf("%d\n", pop(&s));
}

