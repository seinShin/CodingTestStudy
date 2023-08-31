package graph_bfs_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Aug5Week_1260_Kse {

    /**
     * 그래프를 DFS 와 BFS 로 탐색한 결과를 출력.
     * 정점이 여러개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더이상 방문 할 수 있는 점이 없는 경우 종료.
     * 정점 번호는 1 부터 N 까지 이다.
     *
     * @Variable N : 정점의 개수
     * @Variable M : 간선의 개수
     * @Variable V : 탐색 시작 번호
     *
     * 입력으로 주어지는 간선은 양방향이다.
     */

    public static ArrayList<Integer>[] graph;
    public static boolean[] visited;
    public static int N;
    public static int M;
    public static int V;
    public static StringBuilder sb;

    // BFS
    public static void bfs (int V) {

        Queue<Integer> queue = new LinkedList<>();
        visited[V] = true;
        queue.add(V);

        while (queue.size() != 0) {
            V = queue.poll(); // dequeue
            sb.append(V).append(" ");

            Iterator<Integer> iterator = graph[V].listIterator();
            while (iterator.hasNext()) {
                int next = iterator.next();
                if (!visited[next]) {
                    visited[next] = true; // 방문처리
                    queue.add(next); // enqueue
                }
            }
        }
    }

    // DFS
    public static void dfs (int index) {
        // 방문처리에 사용할 배열
        visited[index] = true;
        sb.append(index).append(" ");

        // 방문한 노드의 인접 노드 찾기
        for (int i : graph[index]) {

            if (!visited[i]) {
                dfs(i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        // 그래프 그리기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken()); // 정점의 개수
        M = Integer.parseInt(st.nextToken()); // 간선의 개수
        V = Integer.parseInt(st.nextToken()); // 탐색 시작 정점번호

        // 방문 검사
        visited = new boolean[N + 1];

        // 그래프
        graph = new ArrayList[N + 1];
        for(int i = 1; i < N + 1; i++){
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int V1 =Integer.parseInt(st2.nextToken());
            int V2 = Integer.parseInt(st2.nextToken());

            // 양방향 연결
            graph[V1].add(V2);
            graph[V2].add(V1);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]); // 오름차순 정렬
        }

        dfs(V);
        visited = new boolean[N + 1]; // 초기화
        sb.append("\n");
        bfs(V);

        System.out.println(sb);
    }
}
