MAX = int(input())+1
#MAX = int(N)+1
'''A = input()
A_string = A.split()
s = [int (i) for i in A_string]'''
s = [int(k) for k in (input()).split()]
s.insert(0,-10)

h=[0]*MAX
#p=[0]*MAX

''' for i in range(0,MAX) :
    h.append(0)
    p.append(0) '''

for i in range (1,MAX) :
    for j in range (0,i) :
        if (s[i]>s[j] and h[i] < h[j]+1) :
            h[i] = h[j] +1
            #p[i] = j

maxValue =0
for i in range (1,MAX) :
    if (maxValue < h[i]) :
        maxValue =  h[i]

print (maxValue)
