#include <stdio.h>
#include <stdlib.h>

typedef int element;
typedef struct DlistNode {
	element data;
	struct DlistNode* llink;
	struct DlistNode* rlink;
} DlistNode;

void init(DlistNode* phead) {
	phead->llink = phead;
	phead->rlink = phead;
}

void display(DlistNode* phead) {
	DlistNode* p;
	for (p = phead->rlink; p != phead; p = p->rlink)
	{
		printf("<--- | %x | %d | %x | --->\n", p->llink, p->data, p->rlink);
	} printf("\n");
}

// Insert ¡®new_node¡¯ into the right of ¡®before¡¯
void dinsert_node(DlistNode* before, DlistNode* new_node)
{
	new_node->llink = before;
	new_node->rlink = before->rlink;
	before->rlink->llink = new_node;
	before->rlink = new_node;
}

// Delete ¡®removed¡¯
void dremove_node(DlistNode* phead_node, DlistNode* removed)
{
	if (removed == phead_node) return;
	removed->llink->rlink = removed->rlink;
	removed->rlink->llink = removed->llink;
	free(removed);
}

void main()
{
	DlistNode* head_node = (DlistNode*)malloc(sizeof(DlistNode));
	DlistNode* p[10];
	init(head_node);

	for (int i = 0; i < 5; i++)
	{
		p[i] = (DlistNode*)malloc(sizeof(DlistNode));
		p[i]->data = i;
		dinsert_node(head_node, p[i]);
		display(head_node);
		printf("\n");
	}

	//inserting a new node in the beginning by using dinsert_node
	p[5] = (DlistNode*)malloc(sizeof(DlistNode));
	p[5]->data = 5;
	dinsert_node(head_node, p[5]);
	display(head_node);
	printf("\n");

	//inserting a new node at the end by using dinsert_node
	p[9] = (DlistNode*)malloc(sizeof(DlistNode));
	p[9]->data = 9;
	dinsert_node(head_node->llink, p[9]);

	display(head_node);
}
