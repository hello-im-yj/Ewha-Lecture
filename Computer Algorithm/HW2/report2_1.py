#입력 : 수열이 크기, 정수수열 s
#출력 : 최장 증가 부분 수열 lis, 그 길이 maxValue

#i=0인 경우도 저장할 수 있어야 하므로, 입력으로 받은 수열의 크기보다 1 큰 값을 MAX 변수에 저장한다.
MAX = int(input())+1
#입력받은 수열 s를 정수 리스트 형태로 저장한다.
s = [int(k) for k in (input()).split()]
s.insert(0,-10)     #0번째 수열에는 충분히 작은 -10을 저장

h=[0 for row in range(MAX)]  #h는 최장 증가 부분 수열의 길이를 저장하는 배열
p=[0 for row in range(MAX)]  #p는 부분수열에서 직전 값의 인덱스를 저장하는 배열

#해당 원소 전까지 최장 증가 부분 수열의 길이를 구하는 알고리즘
for i in range(1, MAX):
    for j in range(0, i):   #i인덱스 전에 있는 원소들만 비교
        # s[i]보다 작은 값을 갖는 원소 중에서 가장 큰 h 값을 갖는 원소의 값을 찾아서
        if (s[i] > s[j] and h[i] < h[j] + 1):
            h[i] = h[j] + 1     #그보다 1 큰 값으로 h값을 업데이트 한다.
            p[i] = j    #부분수열의 직전에 나오는 값의 index를 저장한다.

#부분수열의 가장 긴 길이 값을 찾는 알고리즘
maxValue = 0    #최장 증가 부분 수열의 길이를 나타내는 변수, 0으로 초기화
for i in range(1, MAX):
    if (maxValue < h[i]):
        maxValue = h[i]
        #index변수는 최장 증가 부분 수열의 마지막 원소의 인덱스로 설정해 놓는다.
        index = i
print(maxValue) #최장 증가 부분 수열의 길이값 출력

#최장 증가 부분 수열을 찾아 출력하는 알고리즘
lis = []    #최장 증가 부분 수열을 담을 변수 생성
while (index != 0) :    #0번째 인덱스에 도달할 때 까지 반복
    lis.append(s[index])    #최장 증가 부분 수열의 원소를 찾아 추가
    # p배열을 이용하여, 최장 증가 부분 수열 원소의 직전 원소들의 index값을 찾아 변수를 업데이트 시켜준다.
    index = p[index]
lis.reverse()   #가장 큰 수부터 거꾸로 담기게 되므로 역순으로 뒤집어준다.
print("longest increasing subseq :",lis)    #최장 증가 부분 수열 출력


