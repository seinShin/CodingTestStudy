package samsung.java;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Sep3Week_14501_Kse {
    // dp 문제
    static Scanner sc = new Scanner(System.in);
    static int N; // 테스트 케이스
    static int[] time; // 소요 기간
    static int[] money; // 소요 금액
    static int[] dp;

    public static void main(String[] args) throws IOException {
        N = sc.nextInt();
        time = new int[N];
        money = new int[N];
        for(int i=0; i < N; i++) {
            time[i]=sc.nextInt();
            money[i]=sc.nextInt();
        }

        dp = new int[N + 1];

        for(int i = 0; i < N; i++) {
            if( i + time[i] <= N) {
                dp[i + time[i]] = Math.max(dp[i + time[i]], dp[i] + money[i]);
//                System.out.println(i + " " + Arrays.toString(dp));
            }
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
//            System.out.println(i + " " + Arrays.toString(dp));
        }
//        System.out.println(Arrays.toString(dp));
        System.out.println(dp[N]);
    }

}
