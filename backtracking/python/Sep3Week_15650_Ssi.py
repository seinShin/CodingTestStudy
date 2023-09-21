# 15650 N과 M(2)
import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr=[]


def backTracking():
    for i in range(1, n+1):
        if len(arr) == m:
            print(" ".join(map(str, arr)))
            break

        if i not in arr:
            if len(arr) == 0 or arr[-1] < i:
                arr.append(i)
                backTracking()
                arr.pop()

backTracking()
