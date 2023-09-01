package graph_bfs_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aug5Week_11403_Kse {

    /**
     * @Variable N : 정점의 개수
     *
     * 인접행렬 형식으로 출력
     * i -> j  간선 존재 = 1
     */

    public static int[][] graph;
    public static int[][] answer;
    public static boolean[] visited;
    public static int N; // 정점의 개수

    public static void dfs (int x, int y) {
        for (int i = 0; i < N; i++) {
            if (graph[y][i] == 1 && !visited[i]) {
                visited[i] = true; // 방문처리
                answer[x][i] = 1; // 경로 존재 처리

                dfs(x, i);
            }
        }

    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());

        graph = new int[N][N];
        answer = new int[N][N];
        visited = new boolean[N];

        // 그래프 그리기
        for(int i = 0; i < N; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < temp.length; j++) {
                graph[i][j] = Integer.parseInt(temp[j]);
            }
        }

        for (int i = 0; i < graph.length; i++) {
            visited = new boolean[N];
            dfs(i, i);
        }

        // 정답 출력
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                sb.append(answer[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
