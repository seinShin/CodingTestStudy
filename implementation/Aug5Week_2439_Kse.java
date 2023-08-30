package implementation;

import java.util.Scanner;

public class Aug5Week_2439_Kse {

    // 오른쪽을 기준으로 정렬한 별

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++ ) {
            // 공백 찍기
            for (int j = 1; j <= N - i; j++) {
                sb.append(" ");
            }

            // 별 찍기
            for (int j = N - i + 1; j <= N; j++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
