windows10 /Visual Studio 2019 환경에서 작성됨.

[hw8_1.cpp]

Description : stable한 selection sort를 실행하는 함수 ‘selection_sort_stable’ 구현.
최소 힙에서 decrease_key_min_heap() 함수와 increase_key_min_heap() 함수를 구현하였음.

예제 출력 : 
1 3 2 4 5 3 3 7 8 9 
1 3 3 4 5 3 10 7 8 9 

[hw8_2.cpp] : 미완성
Description : 1) unsorted list 대신 min heap을 이용하고, 2)부모 자식 관계를 출력할 수 있는 prim algorithm을 구현하는 문제.

‘DS-Lec10-Graph’ 강의자료 p.51에 있는 pseudo code를 다음과 같이 바꾸어 구현했다. 
- ‘build_min_heap’: use this at ‘Insert all vertices into the priority queue Q’
- ‘delete_min_heap’: use this at ‘Extract_Min(Q)’
- ‘Decrease_key_min_heap’: use this at ‘dist[v] ← weight[u][v]’


