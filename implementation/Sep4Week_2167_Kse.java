package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sep4Week_2167_Kse {

    /**
     * N M => 배열의 크기
     * K : 합을 구할 부분의 개수
     * i , j , x , y
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int M;
    static int[][] dp;
    static int[][] arr;
    static int K;
    static int i, j, x, y;
    static int[] sums;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        dp = new int[N + 1][M + 1];
        arr = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i ++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= M; j ++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = arr[i][j] + dp[i][j -1];
            }
        }

        K = Integer.parseInt(br.readLine());
        sums = new int[K];
        for (int k = 0; k < K; k ++) {
            st = new StringTokenizer(br.readLine());

            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            for (int row = i; row <= x; row++) { // 행을 기준으로 판별
                sums[k] += dp[row][y] - dp[row][j  - 1];
            }
        }

        for (int sum : sums) {
            System.out.println(sum);
        }
    }
}
