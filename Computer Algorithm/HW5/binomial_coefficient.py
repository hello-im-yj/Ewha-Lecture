#BOJ 11401
#자연수 n,k와 정수 nCk가 주어졌을 때 이항 계수 를 1,000,000,007로 나눈 나머지를 구하는 프로그램
import sys

#제곱-곱 연산 방법을 구현한 함수 mul()
def mul (x,y,p) :
    ans = 1
    while (y > 0) :
        # 2진수로 나타낸 지수값의 마지막 자리수가 1이라면
        if (y % 2 != 0) :
            ans *= x    # X값을 한번 더 곱해준다.
            ans %= p
        # (지수를 2진수로 나타내기 위하여)
        # Y값을 2로 나눌 때 마다 X값을 제곱한 후 mod연산을 취해준다.
        x *= x
        x %= p
        y //= 2
    return ans  #계산 결과 리턴

#n,k값 입력
N, K = map(int, sys.stdin.readline().split())
mod = 1000000007

ans = None  #결과 출력을 위한 변수, 아직 초기화 하지 않았다.
t1 = 1      #A,B 값의 factorial 계산을 위한 변수 t1,t2 / 1로 초기화
t2 = 1

#n! 계산 = t1
for i in range (1,N+1) :
    t1 *= i
    t1 %= mod

#k!(n-k)! 계산 = t2
for i in range (1,K+1) :
    t2 *= i
    t2 %= mod

for i in range (1,N-K+1) :
    t2 *= i
    t2 %= mod

#제곱-곱 연산 방법을 통해 B^(M-2)를 계산하여 t3 변수에 저장
t3 = mul(t2, mod-2, mod)
t3 %= mod
#A*B^(M-2)를 계산하여 ans에 저장
ans = t1 * t3
#이를 modM 연산을 취해준다.
ans %= mod

print(ans)  #결과값 출력
