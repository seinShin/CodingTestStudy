package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Sep4Week_1475_Kse {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String[] numbers;
    static int[] cnts = new int[9];

    public static void main(String[] args) throws IOException {
        numbers = br.readLine().split("");
//        System.out.println(Arrays.toString(numbers));

        for (String number : numbers) {
            int temp = Integer.parseInt(number);
            if (temp == 9) {
                cnts[6] ++;
            } else {
                cnts[temp] ++;
            }
        }

        cnts[6] = (cnts[6] / 2) + (cnts[6] % 2);
        Arrays.sort(cnts);
        System.out.println(cnts[cnts.length - 1]);
    }
}
