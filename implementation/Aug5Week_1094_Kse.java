package implementation;

import java.util.Scanner;

public class Aug5Week_1094_Kse {

    /**
     * 64 cm 막대를 이용하여 X cm 의 막대를 만들기 위해 필요한 막대 개수 구하기.
     * 2 등분 한 막대만 사용 가능.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        // 막대와 막대의 개수를 담은 배열
        int[][] barArr = {{64, 1}, {32, 2}, {16, 4}, {8, 8}, {4, 16}, {2, 32}, {1, 64}};

        int idx = 0;
        int cnt = 0;

        while (idx < barArr.length) {

            if (X < barArr[idx][0] || barArr[idx][1] == 0) {
                idx ++;

            } else {
                X -= barArr[idx][0];
                cnt ++;
                barArr[idx][1] -= 1;
            }

            if (X == 0) break;
        }

        System.out.println(cnt);
    }
}
