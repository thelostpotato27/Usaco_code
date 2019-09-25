/*
ID: thelost2
LANG: JAVA
PROG: ride
*/
import java.io.*;
import java.util.*;

class ride {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("ride.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("ride.out"));

        char[] comet = br.readLine().toCharArray();
        char[] group = br.readLine().toCharArray();

        int[] intcomet = new int[comet.length];
        int[] intgroup = new int[group.length];

        for (int i = 0; i < comet.length; i++){
            intcomet[i] = comet[i];
        }
        for (int i = 0; i < group.length; i++){
            intgroup[i] = group[i];
        }

       

        int sum1 = 1;
        for (int i = 0; i < intcomet.length ; i++){
            sum1 = sum1 * (intcomet[i] - 64);
        }

        int sum2 = 1;
        for (int i = 0; i < intgroup.length ; i++){
            sum2 = sum2 * (intgroup[i] - 64);
        }

        if (sum1 % 47 == sum2 % 47){
            pw.print("GO");
        } else {
            pw.print("STAY");
        }
        pw.close();
    }
}