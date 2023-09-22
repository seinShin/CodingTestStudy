package samsung.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sep3Week_14888_Kse {

    /**
     * +, -. x, /
     *
     * [입력] 수의 개수 / 수 / 연산자 수
     * [출력] 최대 / 최소
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n;
    static int[] numbers;
    static int[] operators = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main (String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        numbers = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
//            System.out.println(Arrays.toString(numbers));
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
//            System.out.println(Arrays.toString(operators));
        }

        backTracking(1, numbers[0]);
        System.out.println(max);
        System.out.println(min);
    }


    public static void backTracking(int depth, int value) { // value: 연산 값, depth 는 1 부터 시작, value 는 number 첫번째부터 시작
        if (depth == n) {
            max = Math.max(max, value);
            min = Math.min(min, value);
        }

        for (int i = 0; i < operators.length; i ++) { // + - x /
            if (operators[i] > 0) {
                operators[i]--;

                switch (i) {
                    case 0:
                        backTracking(depth + 1, value + numbers[depth]);
                        break;
                    case 1:
                        backTracking(depth + 1, value - numbers[depth]);
                        break;
                    case 2:
                        backTracking(depth + 1, value * numbers[depth]);
                        break;
                    case 3:
                        backTracking(depth + 1, value / numbers[depth]);
                        break;
                }

                operators[i]++; // 다음 가지를 위해 다시 원복 해줘야 함.
            }
        }
    }
}
