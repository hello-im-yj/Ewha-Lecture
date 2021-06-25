import sys
import heapq    #우선순위 큐(최소 힙)을 사용하기 위하여 heapq 를 import

def dijkstra(V,start,G):    #우선순위 큐를 이용하여 다익스트라 알고리즘을 수행하는 함수 정의

    result = [INF for i in range(V+1)]  # 최단 거리 계산 결과를 저장할 result 배열
    result[start] = 0   #출발 지점 주어짐 : 출발지점 -> 출발지점 까지 거리 0으로 초기화

    q = []  # 우선순위 큐 (최소 힙 사용)
    heapq.heappush(q, [0, start])  # 정점 사이의 거리값을 기준으로 우선순위 큐 정렬

    while q:    #큐에 원소가 없을 때 까지 반복
        dis, end = heapq.heappop(q)  # 큐에서 pop, vnear를 선택하는 작업과 동일

        for d, x in G[end]:  # end 인덱스를 이용하여 연결된 노드만 탐색
            d += dis  # 이전거리와 현재 연결된 노드의 거리를 더해서
            if d < result[x]:  # 거리비교 : 거리가 이전보다 짧으면
                result[x] = d  # 결과값으로 출력될 result 배열의 거리를 갱신시키고
                heapq.heappush(q, [d, x])  # 해당 간선과 노드를 우선순위 큐에 넣어준다.

    for i in range(1, V + 1):   #결과 출력
        # i번 정점까지 최단 경로의 경로값을 출력한다. 시작점 자신은 0으로 출력하고, 경로가 존재하지 않는 경우에는 INF를 출력
        print(result[i] if result[i] != INF else "INF")


#main()

INF = sys.maxsize   #INF 변수에 최댓값 저장
V, E = map(int, sys.stdin.readline().split())   #정점의 개수 V, 간선의 개수 E

K = int(sys.stdin.readline())   #시작점 K
G = [[] for i in range(V + 1)]  # 그래프 G

for i in range(E):  # 간선 정보를 그래프에 저장
    u, v, w = map(int, sys.stdin.readline().split())
    G[u].append([w, v])

dijkstra(V,K,G)     #다익스트라 알고리즘 실행

