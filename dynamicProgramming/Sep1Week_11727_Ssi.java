package dynamicProgramming;

import java.io.*;

public class Sep1Week_11727_Ssi {

    static int[] dp = new int[1001];
    static int n;
    static int mod = 10007;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());

        dp[1] = 1;
        dp[2] = 3;

        for(int i=3; i<n+1; i++){
            dp[i] = (dp[i-1]+ 2*dp[i-2]) % mod;
        }
        System.out.println(dp[n]);
    }
}
