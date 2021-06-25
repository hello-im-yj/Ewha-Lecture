
#include "stdlib.h"
#include "stdio.h"
#include "string.h"

#define MAX_ELEMENT 100
#define KEYS 10

#define SWAP(x,y) { element t; t = x; x = y; y = t;}

typedef struct element {
	int key;
}element;

typedef struct HeapType {
	element heap[MAX_ELEMENT];
	int heap_size;
}HeapType;


void init(HeapType* h)
{
	h->heap_size = 0;
}

int is_empty(HeapType* h)
{
	if (h->heap_size == 0)
		return true;
	else
		return false;
}

void decrease_key_min_heap(HeapType* h, int location, int key) {

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

void increase_key_min_heap(HeapType* h, int location, int key) {
	if (key <= h->heap[location].key) {
		printf("error: new key is not larger than current key");
	}
	
	int parent = location; 
	int child = h->heap[2 * location].key < h->heap[2 * location + 1].key ? 2 * location : 2 * location + 1;
	
	while (child <= h->heap_size) {
		child = h->heap[2 * parent].key < h->heap[2 * parent + 1].key ? 2 * parent : 2 * parent + 1;
			if (key <= h->heap[child].key)
				break;
		h->heap[parent] = h->heap[child];
		parent = child;
		child *= 2;
	}	h->heap[parent].key = key;}

int main()
{
	int keys[] = { 1,4,2,7,5,3,3,7,8,9 };
	HeapType* h = (HeapType*)malloc(sizeof(HeapType));
	init(h);

	//hw8의 key 값으로 heap을 넣는다!
	for (int i = 0; i < KEYS; i++) {
		h->heap[i + 1].key = keys[i];
	}
	h->heap_size = KEYS + 1;

	//index 4 (key = 7)에 있는 값을 3으로 감소한다.
	decrease_key_min_heap(h, 4, 3);

	for (int i = 1; i < KEYS + 1; i++) {
		printf("%d ", h->heap[i].key);
	}
	printf("\n");

	//index 3 (key = 2)에 있는 값을 10으로 증가한다.
	increase_key_min_heap(h, 3, 10);

	for (int i = 1; i < KEYS + 1; i++) {
		printf("%d ", h->heap[i].key);
	}
	return 0;
}
