package hash;

import java.util.HashMap;
import java.util.Scanner;

public class Sep2Week_2002_Kse {
    // 추월 차량 개수 구하기

    static Scanner sc = new Scanner(System.in);
    static int N;
    static HashMap<String, Integer> map;
    static int[] outOrder;
    static int cnt;

    public static void main (String[] args) {
        N = sc.nextInt();
        map = new HashMap<>();
        cnt = 0;

        // 자동차 넘버와 순서 저장
        for (int i = 0; i < N; i ++) {
            String carNumber = sc.next();
            map.put(carNumber, i);
        }

        outOrder = new int[N];

        // 나간 순서 저장
        for (int i = 0; i < N; i ++) {
            String carNumber = sc.next();
            outOrder[i] = map.get(carNumber);
        }

        // 비교
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j ++) {
                if (outOrder[i] > outOrder[j]) { // 두개 값 비교해서 앞이 더 크면 추월
                    cnt++;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}
