package dynamicProgramming;

import java.util.Scanner;

public class Sep1Week_11727_Kse {

    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] memoization;

    public static void main(String[] args) {
        n = sc.nextInt();
        memoization = new int[n];

        // 조건문 안넣어주면런타임 에러 (ArrayIndexOutOfBounds) 발생
        if (n > 0) memoization[0] = 1;
        if (n > 1) memoization[1] = 3;

        for (int i = 2; i < n; i++) {
            memoization[i] = (memoization[i - 1] + memoization[i - 2] * 2) % 10007;
        }

        System.out.println(memoization[n - 1]);
    }
}
