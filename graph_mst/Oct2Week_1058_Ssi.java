package graph_mst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class Oct2Week_1058_Ssi {
    static int n;
    static int max;
    static int[][] nlist;
    static String[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(bf.readLine());

        arr = new String[n][n];
        nlist = new int[n][n];
        for(int i=0; i<n;i++){
            String line = bf.readLine();
            for(int j=0; j<n;j++){
                arr[i][j] = String.valueOf(line.charAt(j));
            }
        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==j) continue;
                    if(arr[i][j].equals("Y") | (arr[i][k].equals("Y") && arr[k][j].equals("Y"))){
                        nlist[i][j] = 1;
                    }
                }
            }
        }

        for(int i=0; i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum += nlist[i][j];
            }

            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
