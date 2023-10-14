package graph_bfs_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Oct2Week_1926_Kse {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Queue<int[]> queue = new LinkedList<>();
    static StringTokenizer st;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0}; // 좌 우 위 아래
    static int[] dy = {0, 0, 1, -1}; // 좌 우 위 아래
    static int x, y;
    static int nx, ny;
    static int area;
    static int cnt;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        y = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        graph = new int[y][x];
        visited = new boolean[y][x];

        for (int i = 0; i < y; i ++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < x; j ++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < y; i ++) {
            for (int j = 0; j < x; j ++) {
                if (graph[i][j] == 1 && !visited[i][j]) {
                    visited[i][j] = true;
                    queue.add(new int[] {i, j});
                    bfs();
                    cnt ++;
                }
            }
        }

        System.out.println(cnt);
        System.out.println(max);
    }

    public static void bfs() {
        area = 0; // 초기화
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int i = 0; i < 4; i ++) { // 4 방향 탐색
                ny = current[0] + dy[i];
                nx = current[1] + dx[i];

                if (0 <= nx && nx < x && 0 <= ny && ny < y) {
                    if (graph[ny][nx] == 1 && !visited[ny][nx]) {
                        visited[ny][nx] = true;
                        queue.add(new int[]{ny, nx});
                    }
                }
            }
            area ++;
        }

        max = Math.max(max, area);
    }
}
