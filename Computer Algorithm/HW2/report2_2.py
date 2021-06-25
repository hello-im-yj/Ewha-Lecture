#입력 :  n*n 2차원 배열 tri, 최대 레벨 n
#출력 : 최적의 경로의 값 - maxResult, 경로에 있는 수 - bestPath

n = int(input())    #삼각형의 크기 n을 입력받는다.

tri= []     # 빈 tri 배열 생성
# 정수 삼각형을 입력받아서 tri 배열 안에 정수 리스트 형태로 저장한다.
for i in range(n) :
    tri.append([int(k) for k in input().split()])

# 각 원소까지 최적 경로의 값을 저장할 best 배열을 생성, 모든 원소 -1로 초기화
best = [[-1 for col in range(n)] for row in range(n)]
# path 배열을 생성, 모든 원소는 빈 str값으로 초기화
path = [["" for col in range(n)] for row in range(n)]

#best의 첫번째 값에는 삼각형의 원소 값이 그대로 들어간다.
best[0][0] = tri[0][0]

maxResult =0    # 전체 숫자삼각형의 최적 경로 값, 0으로 초기화

# 각 원소까지 최적 경로를 택하는 알고리즘
for i in range(1,n) :
    for j in range (0,i+1) :
        best[i][j] = tri[i][j]+ max(best[i-1][j-1],best[i-1][j])

# 마지막 레벨의 best배열 안에 담긴 값 중 가장 큰 값을 maxResult로 저장
# 여기선 i가 0부터 시작하기 때문에 n-1 값이 마지막 레벨이 된다.
for i in range(0,n) :
    if (maxResult<best[n-1][i]) :
        maxResult = best[n-1][i]
        # 최적 경로의 도착지점에 해당하는 행의 index를 pathIndex변수에 저장
        pathIndex = i

#전체 숫자삼각형의 최적 경로 값 출력
print(maxResult)

#best배열의 값을 이용하여 각 원소까지 최적알고리즘이 지나온 경로('R','L')를 저장하는 알고리즘
for i in range(n) :
    for j in range (n) :
        # 제일 처음 원소는 출발점이므로 그대로 비워둔다.
        if (i == 0 and j == 0):
            pass
        # i=j일 경우, 무조건 왼쪽에서 내려오는 값을 택하게 된다.
        elif (j == i):
            path[i][j] = "L"
        # j=0일 경우, 무조건 오른쪽에서 내려오는 값을 택하게 된다.
        elif (j == 0):
            path[i][j] = "R"
        elif (j<= i):
            # 바로 위 level의 왼쪽 원소값이 더 클 경우 왼쪽의 값을 택한다.
            if (best[i-1][j-1] > best[i-1][j]):
                path[i][j] = "L"
            # 그렇지 않을 경우 오른쪽의 값을 택한다.
            else:
                path[i][j] = "R"

#path 배열에 저장된 값을 통해 최적의 경로를 찾아, bestPath 변수에 저장하는 알고리즘
#리스트는 인덱스가 0번부터 시작하므로, 최대 레벨 n에서 1 뺀 값을 level 변수에 저장한다.
level = n-1
bestPath = ""   #최적의 경로에 있는 수를 출력할 str type의 변수를 생성.
while(level != 0) :     #최상위 레벨에 도달할 때까지 반복한다.
    bestPath += str(tri[level][pathIndex]) +"->"    #경로의 원소 값을 추가한다.
    # 현재 지점의 path에 저장된 값이 L이면 (상위 level의 왼쪽에서 온 경로라면)
    if path[level][pathIndex] == "L":
        pathIndex -= 1  #pathIndex 변수를 1 감소시킨다.
        # 그렇지 않으면 pathIndex 값을 그대로 유지한다.
    level -= 1  #한 단계 위의 level로 옮겨간다.


#최적의 경로에 있는 수를 (제일 하위의 level부터) 출력한다.
#어떤 경로든 출발 지점은 일정하므로, 알고리즘을 이용해 찾은 경로값에 tri[0][0] 값을 추가하여 출력해주면 된다.
print("print optimal path from the bottom :",bestPath+str(tri[0][0])+"(starting point)")