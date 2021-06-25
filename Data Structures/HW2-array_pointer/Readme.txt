[hw2_1.cpp]
n*m 크기의 matrix B를 입력받아 transepose matrix를 출력하는 프로그램
전치하고자 하는 행렬을 scanf를 통해 따로 입력받지 않습니다. 
예시로 출력된 matrix가 아닌 다른 matrix의 전치행렬을 구하고 싶다면, 
main( ) 함수에 정의되어 있는 SparseMatrix 구조체 변수 B에 값을 초기화하는 부분을 직접 수정하여 사용해야주세요.

1) 구조체 정의
SparseMatrix 구조체
- data : matrix에 있는 모든 non-zero element의 위치와 값을 저장한 배열
- rows : 전체 matrix 의 행 크기
- cols : 전체 matrix의 열 크기
- terms : non-zero element의 개수

element 구조체
- row : non-zero element의 행 위치
- col : non-zero element의 열 위치
- value : non-zero element의 값

2) SparseMatrix transpose(SparseMatrix m)
: 인자로 전달된 SparseMatrix 구조체 m의 전치행렬(transpose matrix)을 구해주는 함수 

3) void printMatrix(SparseMatrix m) 
: non-zero element만 저장된 SparseMatrix를 dense matrix 형태로 출력해주는 함수 

[hw2_2.cpp]
3차원 double형 matrix 두 개를 입력받아 매트릭스의 합을 계산하여 출력하는 프로그램
프로그램이 실행되면, 먼저 3차원 배열의 크기 (l*m*n)를 입력해야합니다. 
반드시 3개의 정수(int)형태로 이루어져야 하며, 정수와 정수 사이는 space bar 또는 enter키로 구분해주세요. 

예를 들어, 1 2 3 과 같이 입력했다면, 1*2*3 크기의 3차원 행렬이 생성됩니다. 
그 다음은 출력되는 위치에 맞게, 계산하고싶은 matrix의 값을 차례로 입력해주시면 됩니다. 

1) double*** mem_alloc_3D_double()
: 3차원 배열의 크기(l*m*n)만큼 메모리를 할당하는 함수
2) void inputMatrix(double*** matrix)
: 사용자에게 3차원 배열의 값을 차례로 입력 받아 저장하는 함수
3) void addition_3D(double*** A, double*** B, double*** C)
: 3차원 배열 A와 B의 덧셈을 수행하여 C에 저장한 후, 출력하는 함수
4) void deallocate_3D(double*** matrix)
: 3차원 배열에 할당했던 메모리를 해제하는 함수

