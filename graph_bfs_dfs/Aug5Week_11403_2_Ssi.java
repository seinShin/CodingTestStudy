package graph_bfs_dfs;

import java.io.*;
import java.util.*;
public class Aug5Week_11403_2_Ssi {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        //행렬
        int[][] graph = new int[n][n];

        for(int i=0; i<n;i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j=0; j< n; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        /***
         *  플로이드 워셜
         k - 거쳐가는 노드, i - 시작 노드, j - 끝 노드
         최단 거리를 구할 경우는 k를 거쳐갈 때와 아닐때의 값을 비교하여 최단거리를 구합니다.
         이 문제에서는 최단거리가 아닌 경로 여부만 판단합니다.
         ***/

        for(int k=0; k<n;k++){
            for(int i=0; i<n;i++){
                for(int j=0; j<n; j++){
                    if(graph[i][k] == 1 && graph[k][j] == 1){
                        graph[i][j] = 1;
                    }
                }
            }
        }


        //출력
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                sb.append(graph[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
