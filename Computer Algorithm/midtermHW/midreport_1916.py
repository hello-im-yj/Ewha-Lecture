import sys

def dijkstra(start,stop) :  #다익스트라 알고리즘을 수행하는 함수 정의

    for connect in range (n-1) :    #모든 정점이 선택될 때 까지 n-1번 반복
        min = float('inf')  #초기값을 매우 큰 값으로 할당

        #length[i] 를 모두 검사하여, Y에서 가장 가까이 있는 노드 vnear을 찾는다.
        for i in range (1,n+1) :
            if (0<length[i]<min) :  #이미 선택된 값은 고려하지 않는다.
                min = length[i]
                vnear = i

        #현재까지의 가중치와 새로 추가된 vnear에서 갈 수 있는 가중치를 비교한다.
        for i in range (1,n+1) :
            if(length[vnear]+adj[vnear][i] < length[i]) :   #만약 현재 값보다 더 작은 값을 가진다면
                length[i] = length[vnear] + adj[vnear][i]   #length와 touch 배열을 업데이트한다.
                touch[i] = vnear

        length[vnear] = -1  #vnear의 인덱스를 음수 값으로 바꿔, 노드를 Y에 추가한다.

    print(totalcost(start,stop))    #결과값 출력

def totalcost(start, stop) :    #결과값을 계산하는 함수 정의
    dist = 0

    # 도착점까지의 최단 경로에 존재하는 가중치를 모두 더함.
    while (stop != start) :     #출발지점으로 돌아올 때 까지 반복
        dist += adj[touch[stop]][stop]
        stop = touch[stop]

    return dist     #결과값 리턴

#main()

n = int(sys.stdin.readline())    #도시 개수 n
m = int(sys.stdin.readline())    #버스 개수 m

# <인접행렬 초기화>
#인접행렬 adj, 도시 번호가 1부터 주어지므로 n+1개의 배열 생성
adj= [[float('inf') for col in range(n+1)] for row in range(n+1)]
#1번부터 n번 도시까지, i ==j 일 경우에는 거리에 0을 대입, 그렇지 않을 경우 무한대로 초기화
for i in range (1,n+1) :
    for j in range(1,n+1) :
        if i == j:
            adj[i][j] = 0
#인접행렬 값을 입력받아 저장함.
for i in range (1,m+1) :
    i, j, w = map(int, sys.stdin.readline().split())
    if adj[i][j] > w :
        adj[i][j] = w

#시작점 start, 도착점 stop 입력 받음.
start , stop = map(int, sys.stdin.readline().split())

#이미 선택된 노드들의 집합을 Y라고 할 때
#touch 배열 : Y에 속한 노드들만 거쳐서 i번째 도시로 가는 최단 경로 상의 마지막 이음선을 만들 수 있는 인덱스를 저장
touch = [start for i in range(n + 1)]   #시작점으로 초기화

#length 배열 : Y에 속한 노드들만 거쳐서 i번째 도시로 가는 현재 최단경로의 길이
length = [-1 for i in range(n + 1)]     #아직 실제 값 할당 전, 음수로 임시 값을 할당함.
for i in range(1, n + 1):  # 현재는 Y에 시작점만 들어있으므로, 시작점과의 가중치로 초기화
    length[i] = adj[start][i]


dijkstra(start,stop)    #다익스트라 알고리즘을 수행하여 결과 출력
