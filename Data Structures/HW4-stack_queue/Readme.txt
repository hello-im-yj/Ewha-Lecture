windows10 /Visual Studio 2019 환경에서 작성됨.

[hw4_1.cpp]
simple linked list로 구현된 Linked stack을 doubly linked list로 바꾸어 코드 작성.

- linked_stack.cpp 파일을 바탕으로 작성되었습니다. 
- simple linked list를 doubly linked list로 바꾸기 위해 ADT만 수정하였고, main함수는 수정하지 않았습니다.  
- #include "stdafx.h" 코드는 제가 사용한 Visual Studio 2019 IDE에서는 에러가 발생하여 주석처리 하였습니다. 

<ADT> linked Stack implemented by Doubly linked list
– is_empty(s) :: = Checks if the stack ‘s’ is empty.
– is_full(s) :: = Checks if the stack is full.
– push(s, e) :: = Add element ‘e’ to the top of the stack.
– pop(s) :: = Return element at the top of the stack and then
deletes it.
– peek(s) :: = Returns the element at the top of the stack without
deleting it.

<실행결과>는 linked_stack.cpp 파일의 출력 결과와 동일합니다. 
3
2
1

[hw4_2.cpp]
bank staff가 1명 -> 2명으로 늘어났을 때 Simulation 결과를 구하는 코드 작성.

- Simulation.cpp 파일을 바탕으로 작성되었습니다. 다른 함수는 수정하지 않고, main 함수만 수정하였습니다. 
- #include "stdafx.h" 코드는 제가 사용한 Visual Studio 2019 IDE에서는 에러가 발생하여 주석처리 하였습니다. 

<ADT> Circular queue
<Variables>
// Customer structure
typedef struct element {
	int id;
	int arrival_time;
	int service_time;
} element;	 	

// Various state variables needed for simulation
int duration = 10; // Simulation time
double arrival_prob = 0.7; // Average number of customers arriving in one time unit
int max_serv_time = 5; // maximum service time for one customer
int clock;

// Results of the simulation
int customers; // Total number of customers
int served_customers; // Number of customers served
int waited_time; // Time the customers waited

<Functions>
1) void insert_customer(int arrival_time) 
: 대기 중인 고객을 queue에 넣는다. -> circular queue의 insert function을 이용한다. 
2) int remove_customer() 
: 선입선출(FIFO) 방식으로 대기하고 있는 고객들 중 먼저 온 고객부터 queue에서 뽑아 서비스를 받도록 한다. 
-> circular queue의 delete function을 이용한다. 
3) int is_customer_arrived() 
: 0~1 사이 난수를 생성하여 고객이 도착할 확률인 arrival_prov 보다 작은 값이 나오면 true를 리턴한다. (= 손님이 도착한 것)
4) void print_stat() 
: 정해진 duration이 끝나면 서비스를 받은 고객 수, 총 대기 시간, 평균 대기 시간, 대기중인 고객 수를 출력한다. 

<실행결과>
Current time=1
Customer 0 comes in 1 minutes. Service time is 3 minutes.
Customer 0 starts service in 1 minutes. Wait time was 0 minutes.
Current time=2
Customer 1 comes in 2 minutes. Service time is 5 minutes.
Customer 1 starts service in 2 minutes. Wait time was 0 minutes.
Current time=3
Customer 2 comes in 3 minutes. Service time is 3 minutes.
Current time=4
Customer 3 comes in 4 minutes. Service time is 5 minutes.
Customer 2 starts service in 4 minutes. Wait time was 1 minutes.
Current time=5
Current time=6
Current time=7
Customer 4 comes in 7 minutes. Service time is 5 minutes.
Customer 3 starts service in 7 minutes. Wait time was 3 minutes.
Customer 4 starts service in 7 minutes. Wait time was 0 minutes.
Current time=8
Current time=9
Customer 5 comes in 9 minutes. Service time is 2 minutes.
Current time=10
Customer 6 comes in 10 minutes. Service time is 1 minutes.
============================================
Number of customers served = 5
Total wait time = 4 minutes
Average wait time per person = 0.800000 minutes
Number of customers still waiting = 2

