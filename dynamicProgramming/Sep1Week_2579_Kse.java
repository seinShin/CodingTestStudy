package dynamicProgramming;

import java.util.Scanner;

public class Sep1Week_2579_Kse {

    /**
     * 계단은 한 번에 한 계단씩 또는 두 계단씩 오를 수 있다.
     * 연속된 세 개의 계단을 모두 밟아서는 안 된다. 단, 시작점은 계단에 포함되지 않는다.
     * 마지막 도착 계단은 반드시 밟아야 한다.
     * 각 계단에 쓰여 있는 점수가 주어질 때 이 게임에서 얻을 수 있는 총 점수의 최댓값을 구하는 프로그램을 작성하시오.
     * 계단의 개수는 300이하의 자연수
     */

    static Scanner sc = new Scanner(System.in);
    static int numberOfStairs;
    static int[] scoreOfEachStairs;
    static int[] memoizations;

    public static void main(String[] args) {
        numberOfStairs = sc.nextInt();
        scoreOfEachStairs = new int[numberOfStairs];
        memoizations = new int[numberOfStairs];

        for (int i = 0; i < numberOfStairs; i++) {
            scoreOfEachStairs[i] = sc.nextInt();
        }

        // 이 조건을 넣어주지 않으면 런타임 에러 (ArrayIndexOutOfBounds) 나옵니당
        if (numberOfStairs > 0) memoizations[0] = scoreOfEachStairs[0];
        if (numberOfStairs > 1) memoizations[1] = scoreOfEachStairs[0] + scoreOfEachStairs[1];
        if (numberOfStairs > 2) memoizations[2] = Math.max(scoreOfEachStairs[0] + scoreOfEachStairs[2], scoreOfEachStairs[1] + scoreOfEachStairs[2]);

        for (int i = 3; i < numberOfStairs; i ++) {
            memoizations[i] = Math.max(memoizations[i - 3] + scoreOfEachStairs[i - 1], memoizations[i - 2]) + scoreOfEachStairs[i];
        }

        System.out.println(memoizations[numberOfStairs - 1]);
    }
}
