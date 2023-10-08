package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sep4Week_2167_Ssi {
    static int n;
    static int m;
    static int k;
    static int i,j,x,y;
    static int[][] arr;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        dp = new int[n+1][m+1];

        for(int i=0;i<n; i++){
            st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }


        for(int i=1; i< n+1 ;i++){
            for(int j=1; j< m+1 ;j++){
                dp[i][j] = dp[i][j-1]+dp[i-1][j]-dp[i-1][j-1]+arr[i-1][j-1];
            }
        }


        k = Integer.parseInt(bf.readLine());
        for(int m=0; m< k ;m++){
            st = new StringTokenizer(bf.readLine());

            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            System.out.println(dp[x][y]-dp[x][j-1]-dp[i-1][y]+dp[i-1][j-1]);
        }
    }
}
