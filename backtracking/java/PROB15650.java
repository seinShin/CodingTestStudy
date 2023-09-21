package backtracking.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB15650 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;
    static int[] combinations;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        combinations = new int[M];

        backTracking(0, 1);
        System.out.println(sb);
    }

    public static void backTracking(int depth, int value) {
        if (depth == M) {
            for (int number : combinations) {
                sb.append(number).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = value; i <= N; i ++) {
            combinations[depth] = i;
            backTracking(depth + 1, i + 1);
        }
    }
}
