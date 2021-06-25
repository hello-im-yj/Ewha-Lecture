#include "stdlib.h"
#include "stdio.h"
#include "string.h"

#define MAX_ELEMENT 100
#define KEYS 10
#define SWAP(x,y) { element t; t = x; x = y; y = t;}


#define TRUE 1
#define FALSE 0
#define MAX_VERTICES 7
#define INF 1000L

int weight[MAX_VERTICES][MAX_VERTICES] = {
{ 0, 29, INF, INF, INF, 10, INF },
{ 29, 0, 16, INF, INF, INF, 15 },
{ INF, 16, 0, 12, INF, INF, INF },
{ INF, INF, 12, 0, 22, INF, 18 },
{ INF, INF, INF, 22, 0, 27, 25 },
{ 10, INF, INF, INF, 27, 0, INF },
{ INF, 15, INF, 18, 25, INF, 0 } };

int selected[MAX_VERTICES];
int dist[MAX_VERTICES];


typedef struct element {
	int key;
	int vertex;
}element;

typedef struct HeapType {
	element heap[MAX_ELEMENT];
	int heap_size;
}HeapType;

typedef struct TreeNode {
	element node; //vertex의 index값과 weight값이 담겨잇다.
	struct TreeNode* parent;
	struct TreeNode* child[MAX_VERTICES];
}TreeNode;

typedef struct TreeType {
	TreeNode* root;
}TreeType;

TreeType* t = (TreeType*)malloc(sizeof(TreeType));

void init(HeapType* h)
{
	h->heap_size = 0;
}

void t_init(TreeType* t) {
	t->root = NULL;
}

int is_empty(HeapType* h)
{
	if (h->heap_size == 0)
		return true;
	else
		return false;
}

void decrease_key_min_heap(HeapType* h, int vertex, int key) {
	
	int location;

	for (int i=1; i <= h->heap_size; i++) {
		if (vertex == h->heap[i].vertex) 
			location = i;
	}

	if (key >= h->heap[location].key) {
		printf("error: new key is not smaller than current key");
		return;
	}
	h->heap[location].key = key;
	while (location > 1 && h->heap[location].key < h->heap[location/2].key) {
		SWAP(h->heap[location], h->heap[location / 2]);
		location /= 2;
	}
}

void build_min_heap(HeapType* h) {
	int half_size = h->heap_size / 2;

	for (int i = half_size; i > 0; i--) {
		element temp = h->heap[i];

		int parent = i;
		int child = 2 * i;

		while (child <= h->heap_size) {
			if ((child < h->heap_size) && (h->heap[child].key > h->heap[child + 1].key))
				child++;
			if (temp.key <= h->heap[child].key)
				break;
			h->heap[parent] = h->heap[child];
			parent = child;
			child *= 2;
		}

		h->heap[parent] = temp;
	}

}

void insert_min_heap(HeapType* h, element item)
{
	int i;
	i = ++(h->heap_size);

	// The process of comparing with the parent node as it traverses the tree
	while ((i != 1) && (item.key < h->heap[i / 2].key)) {
		h->heap[i] = h->heap[i / 2];
		i /= 2;
	}
	h->heap[i] = item; // Insert new node
}

element delete_min_heap(HeapType* h) {

	element item = h->heap[1];
	element temp = h->heap[(h->heap_size)--];
	int parent = 1;
	int child = 2;
	
	while (child <= h->heap_size) {
		if ((child <h->heap_size) && (h->heap[child].key > h->heap[child + 1].key))
			child++;
		if (temp.key <= h->heap[child].key)
			break;
		h->heap[parent] = h->heap[child];
		parent = child;
		child *= 2;
	}
		
	h->heap[parent] = temp;
	return item;
}

// n: the number of vertices on the graph
void prim(int s, int n)
{
	int i, u, v;
	for (u = 0; u < n; u++)
	{
		dist[u] = INF;
		selected[u] = FALSE;
	} 

	dist[s] = 0;
	
	HeapType* q = (HeapType*)malloc(sizeof(HeapType));
	init(q);

	for (u = 0; u < n; u++)
	{
		element e[MAX_VERTICES];
		e[u].key = dist[u];
		e[u].vertex = u;
		insert_min_heap(q, e[u]);
		//printf("%d", e[u].key);
	}

	build_min_heap(q);

	for (i = 0; i < n; i++) {
		
		u = delete_min_heap(q).key;
		selected[u] = TRUE;
		if (dist[u] == INF) return;
		printf("%d ", u);

		for (v = 0; v < n; v++) {
			if (weight[u][v] != INF)
				if (!selected[v] && weight[u][v] < dist[v]) {
					dist[v] = weight[u][v];
					decrease_key_min_heap(q, v, weight[u][v]);
				}
		}
	}
}


void print_prim(TreeNode* node) {
	if (node != NULL && node->parent != NULL) {
		printf("Vertex %d -> %d\t edge: %d\n", node->parent->node.vertex, node->node.vertex, node->node.key);
		for (int i = 0; i < MAX_VERTICES; i++) {
			print_prim(node->child[i]);
		}
	}
}

int main(void)
{
	t_init(t);
	prim(0, MAX_VERTICES);
	print_prim(t->root);
}
