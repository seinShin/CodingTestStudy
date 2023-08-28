package implementation;
import java.util.Scanner;
public class Aug5Week_2439_Ssi {


    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);

           int n = in.nextInt();
           in.close();

           for(int i=1;i <= n ;i++){
               //공백 찍기
               for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
               }

               //별 찍기
               for(int k=0;k<i;k++){
                    System.out.print("*");
               }

               System.out.println();
           }
    }
}
