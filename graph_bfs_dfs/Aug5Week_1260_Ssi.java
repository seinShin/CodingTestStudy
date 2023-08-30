package graph_bfs_dfs;

import java.util.*;
import java.io.*;

public class Aug5Week_1260_Ssi {

    //두개의 그래프를 출력해야 하기 때문에 변수 선언
    public static ArrayList<Integer>[] graph;
    public static boolean[] visited;

    //재귀를 활용한 dfs
    public static void dfs(int v){
        System.out.print(v+" ");
        visited[v] = true;
        for(int n: graph[v]){
            if(visited[n] == false){
                dfs(n);
            }
        }
    }

    public static void bfs(int v){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(v);
        visited[v] = true;

        while(!q.isEmpty()){
            int n = q.poll();
            System.out.print(n+" ");
            for(int i : graph[n]){
                if(visited[i] == false){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String [] input = bf.readLine().split(" ");

            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            int v = Integer.parseInt(input[2]);


            graph = new ArrayList[n+1];
            visited = new boolean[n+1];

            for(int i=1; i<n+1;i++){
                graph[i] = new ArrayList<Integer>();
            }

            for(int i=0; i<m; i++){
                StringTokenizer t = new StringTokenizer(bf.readLine());

                int x = Integer.parseInt(t.nextToken());
                int y = Integer.parseInt(t.nextToken());

                //양방향 그래프
                graph[x].add(y);
                graph[y].add(x);
            }

            // 정렬
            for(int i=1;i<n+1;i++){
                Collections.sort(graph[i]);
            }

            //출력
            dfs(v);
            Arrays.fill(visited, false);
            System.out.println();
            bfs(v);
    }

}
