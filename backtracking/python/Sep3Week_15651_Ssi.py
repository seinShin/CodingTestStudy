# 15651 N과 M(3)
import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr=[]

def backTracking():

    for i in range(1, n+1):
        if len(arr) == m:
            print(" ".join(map(str, arr)))
            return

        arr.append(i)
        backTracking()
        arr.pop()

backTracking()
