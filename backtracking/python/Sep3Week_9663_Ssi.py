# 9663 N-Queen
import sys
input = sys.stdin.readline

n = int(input())
cnt=0
board = [0] * n


def position_chk(x):
    # 처음부터 현재 위치까지 검사
    # 양쪽 끝과 대각선 검사
    for i in range(x):
        if board[i] == board[x] or abs(board[x] - board[i]) == abs(x-i):
            return False
    return True

def n_queens(x):
    global cnt

    # x가 퀸 개수와 같아지면 증가
    if x == n:
        cnt+=1
        return

    else:
        # [x,i]에 i번째 퀸을 놓는다.
        for i in range(n):
            board[x] = i
            if position_chk(x):
                n_queens(x+1)

n_queens(0)
print(cnt)