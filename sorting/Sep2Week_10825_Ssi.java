package sorting;

import java.util.*;
import java.io.*;

public class Sep2Week_10825_Ssi {

    static String[][] arr ;
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        n = Integer.parseInt(bf.readLine());

        arr = new String[n][4];

        // 2차원 배열 세팅
        for(int i=0; i < n; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=0; j< 4; j++){
                arr[i][j] = st.nextToken();
            }
        }

        // 정렬
        Arrays.sort(arr, new Comparator<String[]>(){
            @Override
            public int compare(String[] o1, String[] o2){
                if(o2[1].equals(o1[1])){
                    if(o2[2].equals(o1[2])){
                        if(o2[3].equals(o1[3])){
                            return o1[0].compareTo(o2[0]);
                        }
                        return Integer.parseInt(o2[3]) - Integer.parseInt(o1[3]);
                    }
                    return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
                }
                return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);
            }
        });

        for(int i=0; i < n; i++){
            System.out.println(arr[i][0]);
        }

    }
}
