package graph_bfs_dfs;

import org.w3c.dom.Node;

import java.io.*;
import java.sql.Array;
import java.util.*;
public class Aug5Week_4963_Ssi {
    /***
     * 그래프 크기 변동이 없을 경우 배열 사용하는 것이 편리
     * 배열을 사용할 경우 dfs를 돌며 값을 바꾸기 보다 check 배열을 하나 더 만들자
     * 어레이리스트는 그래프 입력받을 때 불편함.
     *
     * 큐 사용시 add : 예외 발생 // offer : false 리턴
     */
    static int graph[][];
    static boolean visit[][];
    static int dx[] = {0,0,1,-1, 1, -1, 1, -1};
    static int dy[] = {1,-1,0,0, -1, 1, 1, -1};
    static class Node{
        int x , y;

        public Node(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    public static int bfs(int i, int j, int w, int h){
        Queue<Node> q = new LinkedList<Node>();
        visit[i][j] = true;
        q.offer(new Node(i,j));

        while(!q.isEmpty()){
            Node node = q.poll();

            for(int k=0;k<8;k++){
                int x2 =dx[k]+ node.x;
                int y2= dy[k]+node.y;

                if(x2<0 || x2>=h || y2 <0 || y2 >=w){ continue; }
                if(graph[x2][y2] == 1 && !visit[x2][y2]){
                    visit[x2][y2] = true;
                    q.offer(new Node(x2, y2));
                }
            }
        }
        return 1;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        while (true){
            st = new StringTokenizer(bf.readLine());

            // w, h 입력
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            // 종료 조건
            if (w == 0 && h == 0){
                break;
            }

            // 그래프
            graph = new int[h][w];
            visit = new boolean[h][w];

            for(int i=0; i<h;i++){
                st = new StringTokenizer(bf.readLine());
                for(int j=0; j<w;j++){
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt=0;
            for(int i=0; i<h;i++){
                for(int j=0;j<w;j++){
                    if(graph[i][j] == 1 && !visit[i][j]){
                        cnt += bfs(i, j, w, h);
                    }
                }
            }
            System.out.println(cnt);

        }
    }
}
