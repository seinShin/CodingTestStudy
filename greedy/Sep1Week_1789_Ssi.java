package greedy;

import java.io.*;
import java.util.*;
public class Sep1Week_1789_Ssi {
    static Long cnt;
    static Long total;
    static Long s;

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        s = (long) Integer.parseInt(bf.readLine());

        cnt = 0L;
        total = 0L;

        while(true){
            cnt +=1;
            total += cnt;
            if (total > s){
                break;
            }

        }
        System.out.println(cnt-1);

    }
}
