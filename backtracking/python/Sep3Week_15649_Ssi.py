# 15649 N과 M(1)
import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr=[]


def backTracking():
    for i in range(1, n+1):
        if len(arr) == m:
            print(" ".join (map(str, arr)))
            break
        if i not in arr:
            arr.append(i)
            backTracking()
            arr.pop()

backTracking()
