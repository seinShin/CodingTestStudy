# 14501 퇴사
import sys
# sys.stdin = open("input.txt", "r")
input = sys.stdin.readline
n = int(input())
arr=[]
for i in range(n):
    t,p = map(int, input().split())
    arr.append((t,p))

dp=[0 for i in range(n+1)]
for i in range(n-1, -1, -1):
    # 범위 초과
    if i + arr[i][0] > n:
        dp[i] = dp[i+1]
    # 범위 이내
    else:
        dp[i] = max(dp[i+1], arr[i][1] + dp[i+arr[i][0]])

print(dp[0])




