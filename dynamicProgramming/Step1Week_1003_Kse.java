package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step1Week_1003_Kse {

    /**
     * @Variable T: test case
     * @Variable N: 피보나치 수의 인덱스
     */


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int T;
    static int[] numbers;
    static int[][] memoizations;
//    static int cntZero;
//    static int cntOne;

    // 시간 초과 함수
//    public static int fibonacciTimeOut (int number) {
//        if (number == 0) {
//            cntZero ++;
//            return 0;
//        } else if (number == 1) {
//            cntOne ++;
//            return 1;
//        } else {
//            return fibonacciTimeOut(number - 2) + fibonacciTimeOut(number - 1);
//        }
//    }

    public static void main(String[] args) throws IOException {
        T =Integer.parseInt(br.readLine());
        numbers = new int[T];
        memoizations = new int[41][2];
//        cntZero = 0;
//        cntOne = 0;

        for (int i = 0; i < T; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        memoizations[0][0] = 1;
        memoizations[0][1] = 0;

        memoizations[1][0] = 0;
        memoizations[1][1] = 1;

        for (int i = 2; i < 41; i ++) {
            memoizations[i][0] = memoizations[i - 2][0] + memoizations[i - 1][0];
            memoizations[i][1] = memoizations[i - 2][1] + memoizations[i - 1][1];
        }

        for (int number : numbers) {
            System.out.println(memoizations[number][0] + " " + memoizations[number][1]);
        }
    }
}
