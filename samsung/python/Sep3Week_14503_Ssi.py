# 14503 로봇 청소기
import sys
#sys.stdin = open("input.txt", "r")
input = sys.stdin.readline
n, m = map(int, input().split())
r,c,d = map(int, input().split())
rooms = [list(map(int, input().split())) for _ in range(n)]
visited=[[0] * m for _ in range(n)]
visited[r][c] = 1
dx=[-1,0,1,0]
dy=[0,1,0,-1]
cnt=1

while True:
    flag = 0

    for i in range(4):
        d = (d+3)%4
        x = r+dx[d]
        y = c+dy[d]

        if 0<=x<n and 0<=y<m and rooms[x][y] == 0:
            if visited[x][y] == 0:
                visited[x][y] = 1
                cnt+=1
                r = x
                c = y
                flag = 1
                break

    # 다 청소
    if flag == 0:
        if(rooms[r-dx[d]][c-dy[d]] == 1):
            print(cnt)
            break
        else:
            r,c = r-dx[d], c-dy[d]