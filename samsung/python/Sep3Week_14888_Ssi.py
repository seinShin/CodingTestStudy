# 14888 연산자 끼워넣기
import sys

input = sys.stdin.readline

n = int(input())
nums=list(map(int, input().split()))
codes = list(map(int, input().split()))

maxV = -1e9
minV = 1e9

def dfs(idx, total, plus, minus, multiply, divide):
    global maxV, minV
    if idx == n:
        maxV = max(total, maxV)
        minV = min(total, minV)
        return

    if plus:
        dfs(idx+1, total+nums[idx], plus-1, minus, multiply, divide)

    if minus:
        dfs(idx+1, total-nums[idx], plus, minus-1, multiply, divide)

    if multiply:
        dfs(idx+1, total*nums[idx], plus, minus, multiply-1, divide)

    if divide:
        dfs(idx+1, int(total / nums[idx]), plus, minus, multiply, divide-1)


dfs(1, nums[0], codes[0], codes[1], codes[2], codes[3])

print(maxV)
print(minV)