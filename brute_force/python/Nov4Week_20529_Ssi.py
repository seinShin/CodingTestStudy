#20529 가장 가까운 세 사람의 심리적 거리
from itertools import combinations
import sys
input = sys.stdin.readline
T = int(input())

def min_dist(x,y):
    dist=0
    for i, j in zip(x,y):
        if i != j:
            dist+=1
    return dist

for _ in range(T):
    N = int(input())
    mbti = input().strip().split()

    if N>32:
        print(0)
    else:
        answer=13

        for a,b,c in combinations(mbti,3):
            dist=0
            dist+=min_dist(a,b)
            dist+=min_dist(b,c)
            dist+=min_dist(a,c)

            answer = min(answer, dist)
        print(answer)


