windows10 /Visual Studio 2019 환경에서 작성됨.

[hw3_1.cpp]
inserting a new node in the beginning or at the end of in doubly linked list 
by using `dinsert_node()` defined in p41 of ‘DS-Lec04-List.pdf’.

<Functions>
1)void init(DlistNode* phead) : head node를 초기화하는 함수
2)void display(DlistNode* phead)
: linked list에 저장되어 있는 모든 노드의 값을 <--- | p->llink | p->data | p->rlink | ---> 형태로 하나씩 출력
3) void dinsert_node(DlistNode* before, DlistNode* new_node)
삽입하고자 하는 위치의 직전 노드의 포인터 before과 새롭게 삽입될 노드의 포인터 new_node를 인자로 받아 linked list의 원하는 위치에 노드를 삽입

프로그램이 실행되면 for loop를 통해 0~4의 값을 가진 노드가 Doubly linked list의 맨 앞에 차례로 삽입됩니다. 
그 다음엔 5 값을 가진 노드가 맨 앞에, 9값을 가진 노드가 맨 뒤에 삽입되는 코드를 구현하였습니다. 
이 과정을 하나의 노드가 삽입될 때 마다 display() 함수를 통해 출력합니다. 

[hw3_2.cpp]
Implement a merge function using a linked list that generates a new linked list C by merging A and B.
elements in linked list C are sorted in an ascending order.

merge하고자 하는 linkedlist를 scanf를 통해 따로 입력받지 않습니다. 
예시로 입력되어있는 list가 아닌 다른 두 list의 merge 결과를 구하고 싶다면, 
main( ) 함수에 정의되어 있는 int a[] = { 1,2,5,10,15,20,25 }; int b[] = { 3,7,8,15,18,30 };부분을 직접 수정하여 사용해주세요.
단, 정수 배열 a와 b는 오름차순으로 정렬되어있어야 정상적인 결과가 출력됩니다. 
프로그램은 a와 b에 배열에 저장된 값을 하나의 linkedlist로 합치고 오름차순으로 정렬하여 출력합니다. 
현재는 C = {1  2  3  5  7  8  10  15  15  18  20  25  30  } 값이 출력됩니다.

<Functions>
1) void init(ListHeader* list)
: ListHeader의 초기값을 설정해주는 함수
2) void insert_node_last(ListHeader* list, int data)
: Linked list의 가장 마지막 노드에 데이터를 삽입하는 함수 
3)void mergesort(ListHeader* list1, ListHeader* list2, ListHeader* list3)
: linked list1과 2에 저장된 값을 오름차순으로 list3에 추가해주는 함수.
4) void list_print(ListHeader* list)
: ListHeader의 주소를 인자로 받아 linked list에 저장된 모든 data값을 차례로 출력하는 함수.

[hw3_3.cpp]
re-implement all functions in ‘List ADT’ (p55-p61).
주어진 ADT를 이용하여 예제 코드를 실행할 수 있는 함수를 구현했습니다. 

<example code> 
int main() { 
ListType list1;
init(&list1);
add_first(&list1, 20);
add_last(&list1, 30);
add_first(&list1, 10);
add_last(&list1, 40);
add(&list1, 2, 70);
display(&list1);
delete(&list1, 2);
delete_first(&list1);
delete_last(&list1);
display(&list1);
printf("%s\n", is_in_list(&list1, 20) == TRUE ? "TRUE": "FALSE");
printf("%d\n", get_entry(&list1, 0));
}

<예제 코드에서 일부 수정된 점> 
-1) c++ 개발환경에서는 delete 명령어가 이미 지정되어 있어, 
주어진 예제 코드의 delete() 함수 대신 deletefunc()로 이름을 바꾸어 구현했습니다.
-2) true, false 연산이 작동하기 위해 #include <stdbool.h>라이브러리를 포함하였습니다. 
그 후 대문자 TRUE, FALSE는 모두 소문자로 바꿔주었습니다. 

<Functions>
1) void error(const char* message) 
: (잘못된 명령이 들어왔을 때) 에러 메세지 출력 후 프로그램을 종료하는 함수.
2) void init(ListType* list)
: head node를 초기화하는 함수. 
3) int is_empty(ListType* list)
: Linked list가 비어있는지 확인하는 함수. 비어있으면 1(true), 아니면 0(false)를 리턴.
4) int get_length(ListType* list)
: 전체 노드의 개수를 알려주는 함수. 
5) ListNode* get_node_at(ListType* list, int pos)
: 인자로 들어온 list의 pos번째 노드를 찾아 노드의 포인터를 리턴해주는 함수. 
6) void insert_node(ListType* list, ListNode* before, ListNode* new_node)
: 삽입할 위치의 직전 노드인 before의 위치를 인자로 입력받아 그 뒤에 new_node를 삽입하는 함수. 
7) void add_first(ListType* list, element data)
: add 함수를 통해서는 linked list의 맨 앞에 노드를 삽입할 수 없다. (=position이 0일 경우) 따라서 add_first() 함수를 따로 정의해준다.
8) void add_last(ListType* list, int data)
: add 함수를 통해서는 linked list의 맨 뒤에 노드를 삽입할 수 없다. (=position이 length값과 동일할 경우) 따라서 add_last() 함수를 따로 정의해준다.
9) void add(ListType* list, int position, element data)
: linked list의 특정 position에 data를 삽입하는 함수. (단, position이 0과 length 값일 때는 각각 add_first, add_last 함수를 실행시킨다.)
10) void remove_node(ListType* list, ListNode* before, ListNode* removed)
: 삭제할 위치의 직전 노드인 before의 위치를 인자로 입력받아 그 뒤에 있는 removed를 제거하는 함수.
11) void delete_first(ListType* list)
: deletefunc() 함수를 통해서는 linked list의 맨 앞에 위치한 노드를 제거할 수 없다. (=position이 0일 경우) 따라서 delete_first() 함수를 따로 정의해준다.
12) void delete_last(ListType* list)
: deletefunc() 함수를 통해서는 linked list의 맨 뒤에 위치한 노드를 제거할 수 없다. (=position이 length일 경우) 따라서 delete_last() 함수를 따로 정의해준다.
13) void deletefunc(ListType* list, int pos)
: linked list의 특정 position에 위치한 노드를 제거하는 함수. (단, position이 0과 length 값일 때는 각각 delete_first, delete_last 함수를 실행시킨다.)
14) element get_entry(ListType* list, int pos)
: pos번째 노드의 data 값을 리턴하는 함수. 
15) void display(ListType* list)
: linked list에 있는 모든 노드가 가진 data 값을 차례로 출력하는 함수.
16) int is_in_list(ListType* list, element item)
: item 값과 일치하는 data 값을 가지는 노드가 있는지 탐색하는 함수. Linked list 안에 그러한 노드가 있으면 true, 없으면 false를 반환. 

<실행 결과>
( 10 20 70 30 40  )
( 20 30  )
TRUE
20