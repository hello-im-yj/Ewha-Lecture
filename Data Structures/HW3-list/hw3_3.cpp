#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

typedef int element;
typedef struct ListNode {
	element data;
	struct ListNode* link;
} ListNode;

typedef struct {
	ListNode* head;// Head pointer
	ListNode* tail;// Tail pointer
	int length;// # of nodes
} ListType;

void error(const char* message) {
	fprintf(stderr, "%s\n", message);
	exit(1);
}

// Initialization
void init(ListType* list) {
	list->length = 0;
	list->head = list->tail = NULL;
}

int is_empty(ListType* list) {
	if (list->head == NULL) return 1;
	else return 0;
}

int get_length(ListType* list) {
	return list->length;
}

// Return node pointer of ¡®pos¡¯ in the list.
ListNode* get_node_at(ListType* list, int pos) {
	ListNode* tmp_node = list->head;
	if (pos < 0) return NULL;
	for (int i = 0; i < pos; i++) {
		tmp_node = tmp_node->link;
	}
	return tmp_node;
}


void insert_node(ListType* list, ListNode* before, ListNode* new_node) {
	if (is_empty(list)) {
		new_node->link = NULL;
		list->head = list->tail = new_node;
	}
	else {
		if (before == NULL) {
			error("The preceding node cannot be NULL.\n");
		}
		else {
			new_node->link = before->link;
			before->link = new_node;
		}
	}
}

void add_first(ListType* list, element data) {
	ListNode* temp = (ListNode*)malloc(sizeof(ListNode));
	if (temp == NULL) error("Memory allocation error");

	temp->data = data;
	if (list->head == NULL) {
		temp->link = NULL;
		list->head = temp;
		list->tail = temp;
	}
	else {
		temp->link = list->head;
		list->head = temp;
	}
	list->length++;
}

void add_last(ListType* list, int data) {
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


// Insert new data at the ¡®position¡¯
void add(ListType* list, int position, element data) {
	ListNode* p;
	if ((position >= 1) && (position <= list->length - 1)) {
		ListNode* node = (ListNode*)malloc(sizeof(ListNode));
		if (node == NULL) error("Memory allocation error");
		node->data = data;
		p = get_node_at(list, position - 1);
		insert_node(list, p, node);
		list->length++;
	}
	else if (position == 0) {
		add_first(list, data);
	}
	else if (position == list->length) {
		add_last(list, data);
	}
}

void remove_node(ListType* list, ListNode* before, ListNode* removed) {
	if (is_empty(list)) {
		printf("The list is blank.\n");
	}
	else {
		if (before == NULL)
			printf("The preceding node cannot be NULL.\n");
		else {
			before->link = removed->link;
			free(removed);
		}
	}
}

void delete_first(ListType* list) {
	if (is_empty(list)) {
		printf("The list is blank.\n");
	}
	else {
		ListNode* removed = list->head;
		list->head = removed->link;
		free(removed);
		list->length--;
	}
}

void delete_last(ListType* list) {
	if (is_empty(list)) {
		printf("The list is blank.\n");
	}
	else {
		ListNode* removed = list->tail;
		ListNode* p = get_node_at(list, list->length - 2);
		list->tail = p;
		p->link = NULL;
		free(removed);
		list->length--;
	}
}

// delete a data at the ¡®pos¡¯ in the list
void deletefunc(ListType* list, int pos) {
	if (!is_empty(list) && (pos >= 1) && (pos < list->length - 1)) {
		ListNode* p = get_node_at(list, pos - 1);
		ListNode* removed = get_node_at(list, pos);
		remove_node(list, p, removed);
		list->length--;
	}
	else if (!is_empty(list) && pos == 0) {
		delete_first(list);
	}
	else if (!is_empty(list) && pos == list->length) {
		delete_last(list);
	}
}

// Return the data at the ¡®pos¡¯.
element get_entry(ListType* list, int pos) {
	ListNode* p;
	if (pos >= list->length) error("Position error");
	p = get_node_at(list, pos);
	return p->data;
}

// Display data in the buffer.
void display(ListType* list) {
	int i;
	ListNode* node = list->head;
	printf("( ");
	for (i = 0; i < list->length; i++) {
		printf("%d ", node->data);
		node = node->link;
	}
	printf(" )\n");
}

// Find a node whose data = item
int is_in_list(ListType* list, element item) {
	ListNode* p;
	p = list->head;
	while ((p != NULL)) {
		if (p->data == item)
			break;
		p = p->link;
	}if (p == NULL) return false;
	else return true;
}

int main() {
	ListType list1;
	init(&list1);
	add_first(&list1, 20);
	add_last(&list1, 30);
	add_first(&list1, 10);
	add_last(&list1, 40);
	add(&list1, 2, 70);
	display(&list1);
	deletefunc(&list1, 2);
	delete_first(&list1);
	delete_last(&list1);
	display(&list1);
	printf("%s\n", is_in_list(&list1, 20) == true ? "TRUE" : "FALSE");
	printf("%d\n", get_entry(&list1, 0));
}