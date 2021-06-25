n = int(input())

tri= []
for i in range(n) :
    tri.append([int(k) for k in input().split()])

#best = [[-1 for col in range(n)] for row in range(n)]
best = [[-1]*n]*n
maxResult =0

best[0][0] = tri[0][0]
print(best)
for i in range(1,n) :
    for j in range (0,i+1) :
        best[i][j] = tri[i][j]+ max(best[i-1][j-1],best[i-1][j])
print(best)
for i in range(0,n) :
    if (maxResult<best[n-1][i]) :
        maxResult = best[n-1][i]

print(maxResult)