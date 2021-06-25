#TSP 문제를 전수조사를 이용하여 해결하는 방법


def calcPath(currentdist) :
    #print("함수 시작")
    if len(path) == n :
        print("return :", currentdist ,"+", weight[path[len(path)-1]][path[0]],"=",currentdist + weight[path[len(path)-1]][path[0]])
        return currentdist + weight[path[len(path)-1]][path[0]]

    shortestdist = float('inf')

    for next in range (n) :
        print("next=: ",next)
        if visited [next] :
            continue

        currentindex = path[len(path)-1]
        path.append(next)
        visited[next] = True
        print("1:",path)
        print("1:",visited)
        print("current:",currentdist)
        print("current +", weight[currentindex][next])
        dist = calcPath(currentdist + weight[currentindex][next])
        print()
        print("비교:",shortestdist,dist)
        shortestdist= min (shortestdist, dist)
        print("change :", shortestdist)

        visited[next] = False
        path.remove(next)
        print("2:", path)
        print("2:",visited)

    return shortestdist


n = int(input())    #노드의 수 입력

weight = [ [] for row in range(n)]     #경로의 가중치를 저장하는 2차원 배열
visited =[]     #도시의 방문 여부를 체크하기 위한 1차원 배열
path = []       #방문한 실제 경로를 저장하기 위한 1차원 배열

#간선의 가중치 값 입력
for i in range (n) :
    weight[i] = [int(k) for k in (input()).split()]
    visited.append(False)

#0번(a)을 첫번째 시작점으로 한다.
visited[0] = True
path.append(0)

print(calcPath(0))
