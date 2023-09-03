package graph_bfs_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Aug5Week_4963_Kse {

    /**
     * @Variable w : 지도의 너비
     * @Variable h : 지도의 높이
     * w와 h는 50보다 작거나 같은 양의 정수이다.
     * 둘째 줄부터 h 개 줄에는 지도가 주어진다. 1은 땅, 0은 바다.
     * 입력의 마지막 줄에는 0 이 두 개 주어진다. (EOF)
     * 대각선 가능 (주의)
     */


    public static StringTokenizer st;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int[][] map;
    public static boolean[][] visited;
    public static int w;
    public static int h;
    public static int cnt;
    public static int[] dx = {1, 1, 1, 0, 0, -1, -1, -1};
    public static int[] dy = {1, 0, -1, 1, -1, 1, 0, -1};


    public static void dfs (int y, int x) {
        visited[y][x] = true;

        // 8 방향 탐색
        for (int i = 0; i < 8; i ++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < w && ny >=0 && ny < h && map[ny][nx] == 1) { // 범위 벗어나면 무시하도록 조건 걸기, map 조건은 맨 마지막에
                if (visited[ny][nx]) continue;
                dfs(ny, nx);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) {
                break;
            }

            map = new int[h][w];
            visited  = new boolean[h][w];

            // 그래프 입력받기
            for(int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            cnt = 0;
            for (int i =0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                     if (map[i][j] == 1 && !visited[i][j]) {
                        dfs(i, j);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}
