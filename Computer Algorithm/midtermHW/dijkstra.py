
def dijkstra(start,stop) :
    for i in range(1, n+1) :
        length[i] = adj[start][i]

    for i in range (1,n+1) :
        min = float('inf')
        for i in range (1,n+1) :
            if (0<length[i]<min) :
                min = length[i]
                vnear = i

        for i in range (1,n+1) :
            if(length[vnear]+adj[vnear][i] < length[i]) :
                length[i] = length[vnear] + adj[vnear][i]
                touch[i] = vnear
        length[vnear] = -1

    print(totalcost(start,stop))

def totalcost(start, stop) :
    dist = 0
    while (stop != start) :
        dist += adj[touch[stop]][stop]
        stop = touch[stop]

    return dist

#main()

n = int(input())    #도시 개수
m = int(input())    #버스 개수

adj= [[float('inf') for col in range(n+1)] for row in range(n+1)]     #인접행렬
for i in range (1,n+1) :
    for j in range(1,n+1) :
        if i == j:
            adj[i][j] = 0

for i in range (1,m+1) :
    i, j, w = [int(i) for i in (input()).split()]
    if adj[i][j] > w :
        adj[i][j] = w

start , stop = [int(i) for i in (input()).split()]
touch = [start for i in range(n + 1)]
length = [-1 for i in range(n + 1)]

dijkstra(start,stop)