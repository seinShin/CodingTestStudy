package dynamicProgramming;

import java.util.Scanner;

public class Step1Week_9095_Kse {

    /**
     * 정수 n 이 주어졌을 때, n 을 1, 2, 3 의 합으로 나타내는 방법의 수를 구하기
     * n < 11
     * @Variable T : 테스트 케이스의 수
     */

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static int T;
    static int[] numbers;
    static int[] memoization;

    public static void main(String[] args) {
        T = sc.nextInt();
        numbers = new int[T];
        memoization = new int[11];

        for (int i = 0; i < T; i ++) {
            numbers[i] = sc.nextInt();
        }

        memoization[0] = 1;
        memoization[1] = 2;
        memoization[2] = 4;

        for (int i = 3; i < 11; i ++) {
            memoization[i] = memoization[i - 3] + memoization[i -2] + memoization[i - 1];
        }

        for (int number : numbers) {
            sb.append(memoization[number - 1]).append("\n");
        }

        System.out.println(sb);
    }
}
