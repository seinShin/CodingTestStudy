package graph_bfs_dfs;

import java.io.*;
import java.util.*;
public class Aug5Week_11403_Ssi {

    public static ArrayList<Integer>[] graph;
    public static void bfs(int v, boolean[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(v);

        while(!q.isEmpty()){
            int node = q.poll();
            for(int x : graph[node]){
                if(visited[x] == false){
                    visited[x] = true;
                    q.add(x);
                }
            }
        }

        for(int i=1;i<visited.length;i++){
            if(visited[i] == true){
                System.out.print(1 + " ");
            }else{
                System.out.print(0 + " ");
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        graph = new ArrayList[n+1];

        for(int i=1; i<n+1;i++){
            graph[i] = new ArrayList<Integer>();
        }

        for(int i=0;i<n+1;i++){
            String arr[] = bf.readLine().split(" ");

            for(int j=0;j<arr.length;j++){
                if(Integer.parseInt(arr[j]) == 1) {
                    graph[i + 1].add(j + 1);
                }
            }
        }

        for(int i=0;i<n+1;i++){
            boolean[] visited = new boolean[n+1];
            bfs(i+1, visited);
            System.out.println();
        }
    }
}
