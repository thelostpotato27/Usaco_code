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

        pw.print(num);
        pw.close();


    }
}