# 14889 스타트와 링크
import sys

sys.stdin = open("input.txt", "r")
input = sys.stdin.readline

def dfs(depth, idx):
    global n, minV
    if depth == n//2:
        team1, team2 = 0,0
        for i in range(n):
            for j in range(n):
                if visited[i] and visited[j]:
                    team1 += arr[i][j]
                elif not visited[i] and not visited[j]:
                    team2 += arr[i][j]
        minV = min(minV, abs(team1-team2))
        return

    for i in range(idx, n):
        if not visited[i]:
            visited[i] = 1
            dfs(depth+1, i+1)
            visited[i] = 0


n = int(input())
arr=[]
for i in range(n):
    a = list(map(int, input().split()))
    arr.append(a)

visited=[0]*n
minV = 1e9
dfs(0,0)

print(minV)







