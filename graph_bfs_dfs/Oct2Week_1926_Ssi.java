package graph_bfs_dfs;

import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Oct2Week_1926_Ssi {
    static int n,m=0;
    static int cnt=0;
    static int width=0;
    static int[][] paper;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static class Node{
        int x,y;
        public Node(int x, int y){
            this.x =x;
            this.y=y;
        }
    }
    public static int bfs(int i, int j, int[][] paper){
        Queue<Node> q = new LinkedList<>();
        paper[i][j] = 0;
        q.offer(new Node(i,j));
        int count=1;

        while(!q.isEmpty()){
            Node node = q.poll();

            for(int k=0; k<4;k++){
                int a = node.x + dx[k];
                int b = node.y + dy[k];

                if(a<0 | a>=paper.length| b<0 | b>=paper[0].length){
                    continue;
                }

                if(paper[a][b] == 1){
                    count++;
                    q.offer(new Node(a,b));
                    paper[a][b] = 0;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        paper = new int[n][m];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=0; j<m; j++){
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cnt=0;
        width=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(paper[i][j]==1){
                    cnt++;
                    width = Math.max(width, bfs(i,j,paper));
                }
            }
        }

        System.out.println(cnt);
        System.out.println(width);
    }
}
