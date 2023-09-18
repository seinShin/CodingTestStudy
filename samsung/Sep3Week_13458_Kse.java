package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sep3Week_13458_Kse {

    /**
     * 총 N개의 시험장이 있고, 각각의 시험장마다 응시자들이 있다. i번 시험장에 있는 응시자의 수는 Ai명이다.
     * 감독관은 총감독관과 부감독관으로 두 종류가 있다. 총감독관은 한 시험장에서 감시할 수 있는 응시자의 수가 B명이고, 부감독관은 한 시험장에서 감시할 수 있는 응시자의 수가 C명이다.
     * 각각의 시험장에 총감독관은 오직 1명만 있어야 하고, 부감독관은 여러 명 있어도 된다.
     * 각 시험장마다 응시생들을 모두 감시해야 한다. 이때, 필요한 감독관 수의 최솟값을 구하는 프로그램을 작성하시오
     *
     * 첫째 줄에 시험장의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
     * 둘째 줄에는 각 시험장에 있는 응시자의 수 Ai (1 ≤ Ai ≤ 1,000,000)가 주어진다.
     * 셋째 줄에는 B와 C가 주어진다. (1 ≤ B, C ≤ 1,000,000)
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N; // 시험장의 개수
    static String[] A; // 응시자의 수
    static int[] candidats;
    static int B; // 총감독관 감시 학생 수
    static int C; // 부감독관 감시 학생 수
    static long answer; // 총 감독관 수

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        A = br.readLine().split(" ");
        candidats = new int[A.length];

        st = new StringTokenizer(br.readLine());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        for (int i = 0; i < A.length; i++) {
            candidats[i] = Integer.parseInt(A[i]);
        }

        for (int candidat : candidats) {
            candidat -= B;
            answer++;

            if (candidat <= 0) continue;

            answer += candidat / C;
            if (candidat % C > 0) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
