#TSP 문제를 전수조사를 이용하여 해결하는 방법
import sys
sys.setrecursionlimit(10**6)

def calcPath(currentdist) :

    if len(path) == n :
        return currentdist + weight[path[len(path)-1]][path[0]]

    shortestdist = float('inf')

    for next in range (n) :
        if visited [next] :
            continue

        currentindex = path[len(path)-1]
        path.append(next)
        visited[next] = True
        dist = calcPath(currentdist + weight[currentindex][next])
        shortestdist= min (shortestdist, dist)

        visited[next] = False
        path.remove(next)

    return shortestdist


n = int(input())    #노드의 수 입력

weight = [ [] for row in range(n)]     #경로의 가중치를 저장하는 2차원 배열
visited =[]     #도시의 방문 여부를 체크하기 위한 1차원 배열
path = []       #방문한 실제 경로를 저장하기 위한 1차원 배열

#간선의 가중치 값 입력
for i in range (n) :
    weight[i] = [int(k) for k in (input()).split()]
    visited.append(False)

#갈 수 없는 경우는 0이 주어진다. -> 0으로 주어진 값만 무한대로 바꿔줌.
for i in range (n) :
    for j in range(n) :
        if weight[i][j] == 0 :
            weight[i][j] = float('inf')

#0번(a)을 첫번째 시작점으로 한다.
visited[0] = True
path.append(0)

print(calcPath(0))
