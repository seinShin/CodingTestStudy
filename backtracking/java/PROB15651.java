package backtracking.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB15651 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] combinations;
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        combinations = new int[M];

        backTracking(0);
        System.out.println(sb);
    }

    public static void backTracking (int depth) {
        if (depth == M) {
            for (int number : combinations) {
                sb.append(number).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i ++) {
            combinations[depth] = i;
            backTracking(depth + 1);
        }
    }
}

