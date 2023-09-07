package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Step1Week_1912_Kse {

    // 연속합 최대 구하기

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n;
    static int[] numbers;
    static int[] memoizations;
    static int max;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        memoizations = new int[n];
        memoizations[0] = numbers[0];
        max = memoizations[0];

        for (int i = 1; i < n; i++) {
            memoizations[i] = Math.max(memoizations[i - 1] + numbers[i], numbers[i]);
            max = Math.max(memoizations[i], max);
        }

        System.out.println(max);
    }
}
