package dynamicProgramming;

import java.util.*;
import java.io.*;

public class Sep1Week_1003_Ssi {

    static ArrayList<Integer> zero = new ArrayList<>();
    static ArrayList<Integer> one = new ArrayList<>();
    static int t;
    static int num;

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(bf.readLine());

        for(int i=0; i<t;i++){
            zero.add(1);
            zero.add(0);
            one.add(0);
            one.add(1);

            num = Integer.parseInt(bf.readLine());

            for(int j=2; j<num+1;j++){
                zero.add(one.get(one.size() - 1));
                one.add(zero.get(zero.size() - 2) + one.get(one.size() - 1));
            }

            System.out.println(zero.get(num) + " "+ one.get(num));
        }


    }
}
