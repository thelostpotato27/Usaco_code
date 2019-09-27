/*
ID: thelost2
LANG: JAVA
PROG: gift 1
*/
import java.io.*;
import java.util.*;

class gift{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("gift.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("gift.out"));

        List<Integer> people = new ArrayList<>();
        int num = Integer.parseInt(br.readLine());

        int[] group = new int[num];

        String[] kids = new String[num];

        for (int i = 0; i < num; i++) {
            kids[i] = br.readLine().toString();
        }

        for (int i = 0; i < num; i++) {
            group[i] = br.readLine().toString();
            
            run();
        }


        pw.print(Arrays.toString(kids));
        pw.close();

    }
    public static void run() {
        
        for (int i = 0; i < max; i++) {
            
        }
    }
}