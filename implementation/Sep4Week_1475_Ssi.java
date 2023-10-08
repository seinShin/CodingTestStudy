package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;

public class Sep4Week_1475_Ssi {
    static String n;
    static String[] nList;
    static int total;
    static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = bf.readLine();


        for (int i=0; i<10; i++){
            map.put(String.valueOf(i), 0);
        }

        total=0;
        nList = n.split("");

        for(String a : nList){
            if(Integer.parseInt(a) == 9 | Integer.parseInt(a) == 6){
                if(map.get("6") > map.get("9")){
                    map.put("9" ,map.get("9")+1);
                }else{
                    map.put("6",map.get("6")+1);
                }
            }else{
                map.put(a, map.get(a)+1);
            }
        }

        total = Collections.max(map.values());
        System.out.print(total);
    }
}
