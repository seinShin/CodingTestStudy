package greedy;

import java.io.*;
import java.util.*;

public class Sep1Week_1026_Ssi {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(bf.readLine());

        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];

        st = new StringTokenizer(bf.readLine());
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(bf.readLine());
        for(int i=0;i<n;i++){
            b[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.asList(a);
        Arrays.asList(b);

        Arrays.sort(a);
        Arrays.sort(b, Comparator.reverseOrder());

        int min=0;
        for(int i=0; i<n;i++){
            min += a[i]*b[i];
        }

        System.out.print(min);

    }
}
