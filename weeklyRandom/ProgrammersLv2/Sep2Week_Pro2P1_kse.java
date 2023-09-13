package weeklyRandom.ProgrammersLv2;

import java.util.*;

public class Sep2Week_Pro2P1_kse {
    public String solution(String s) {
        String[] strList = s.split(" ");
        int[] numbers = new int[strList.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(strList[i]);
        }

        Arrays.sort(numbers);

        int lastIdx = numbers.length - 1;

        return numbers[0] + " " + numbers[lastIdx];
    }
}
