#include <stdio.h>
#include <stdlib.h>

typedef struct ListNode {
	int data;
	struct ListNode* link;
} ListNode;

// Header in the linked list
typedef struct ListHeader {
	int length;
	ListNode* head;
	ListNode* tail;
} ListHeader;

void error(const char* message) {
	fprintf(stderr, "%s\n", message);
	exit(1);
}

// Initialization
void init(ListHeader* list) {
	list->length = 0;
	list->head = list->tail = NULL;
}

void insert_node_last(ListHeader* list, int data) {
	ListNode* temp = (ListNode*)malloc(sizeof(ListNode));
	if (temp == NULL) error("Memory allocation error");

	temp->data = data;
	temp->link = NULL;
	if (list->tail == NULL) {
		list->head = list->tail = temp;
	}
	else {
		list->tail->link = temp;
		list->tail = temp;
	}
	list->length++;
}

// list3 = list1 + list2
void mergesort(ListHeader* list1, ListHeader* list2, ListHeader* list3) {
	ListNode* a = list1->head;
	ListNode* b = list2->head;

	while (a && b) {
		if (a->data == b->data) { // a data == b data : 둘 다 추가
			insert_node_last(list3, a->data);
			insert_node_last(list3, b->data);
			a = a->link; b = b->link;
		}
		else if (a->data < b->data) { // a data < b data : a 추가
			insert_node_last(list3, a->data);
			a = a->link;
		}
		else { // a data > b data : b 추가
			insert_node_last(list3, b->data);
			b = b->link;
		}
	}

	for (; a != NULL; a = a->link)
		insert_node_last(list3, a->data);
	for (; b != NULL; b = b->link)
		insert_node_last(list3, b->data);
}

void list_print(ListHeader* list) {
	ListNode* p = list->head;
	for (; p; p = p->link) {
		printf("%d  ", p->data);
	}
}

void main()
{
	ListHeader list_a, list_b, list_c;
	// Initialization of linked list
	init(&list_a);
	init(&list_b);
	init(&list_c);

	// Generate linked list a,b
	int a[] = { 1,2,5,10,15,20,25 };
	int b[] = { 3,7,8,15,18,30 };

	for (int i = 0; i < sizeof(a) / sizeof(int); i++) {
		insert_node_last(&list_a, a[i]);
	}
	for (int i = 0; i < sizeof(b) / sizeof(int); i++) {
		insert_node_last(&list_b, b[i]);
	}

	// List c = List a + List b
	mergesort(&list_a, &list_b, &list_c);
	printf("C = {");
	list_print(&list_c);
	printf("}");
}
