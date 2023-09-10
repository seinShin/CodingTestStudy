package greedy;

import java.util.Scanner;

public class Sep1Week_1789_Kse {

    /**
     * 서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값 구하기
     * @Variable S: 자연수의 합
     */

    static Long idx;
    static Long cnt;
    static Long S;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = sc.nextLong();

        idx = 1L;
        cnt = 0L;

        while (S >= idx) {

            if (S == 1) {
                cnt ++;
                break;
            }
            S -= idx;
            idx ++;
            cnt ++;
        }

        System.out.println(cnt);
    }
}
