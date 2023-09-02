package graph_bfs_dfs;

import java.io.*;
import java.util.*;
public class PROB4963 {
    // dfs
    static boolean visited[][];
    static int w, h;
    static int[] dy = new int[] {1, 0, -1, 1, -1, 1, 0, -1};
    static int[] dx = new int[] {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[][] map;
    static StringTokenizer st;
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static void dfs(int y, int x) {
        visited[y][x] = true;
        for (int k = 0; k < 8; k++){
            int ny = y + dy[k];
            int nx = x + dx[k];
            if (ny >=0 && ny < h && nx >= 0 && nx < w && map[ny][nx] == 1) {
                if (visited[ny][nx]) continue;
                dfs(ny, nx);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        while(true) {
            st = new StringTokenizer(bf.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if (w == 0 && h == 0) {
                break;
            }
            map = new int[h][w];
            visited = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(bf.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int cnt = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1 && !visited[i][j]) {
                        cnt++;
                        dfs(i, j);
                    }
                }
            }
            System.out.println(cnt);
        }

    }
}

