# 15652 N과 M(4)
import sys
input = sys.stdin.readline

n, m = map(int, input().split())
arr=[]

def backTracking():

    for i in range(1, n+1):
        if len(arr) == m:
            print(" ".join(map(str, arr)))
            return

        if len(arr) == 0:
            arr.append(i)
            backTracking()
            arr.pop()
        else:
            if arr[-1] <= i:
                arr.append(i)
                backTracking()
                arr.pop()

backTracking()