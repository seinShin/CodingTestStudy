# 13458 시험 감독
import sys
input = sys.stdin.readline

n = int(input())
people=list(map(int, input().split()))
b,c = map(int, input().split())
total = b+c


ans=0
for i in range(n):
    if people[i] <= total:
        ans+=1
        if people[i] > b:
            ans += 1
    else:
        tmp = (people[i]-total)
        ans+= tmp//c + 2
        if tmp%c:
            ans+=1

print(ans)
