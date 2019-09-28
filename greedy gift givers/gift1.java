
/*
ID: thelost2
LANG: JAVA
PROG: gift1
*/
import java.io.*;
import java.util.*;

class gift1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("gift1.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("gift1.out"));

        int num = Integer.parseInt(br.readLine());
        String[] kids = new String[num];
        int[] money = new int[num];

        String temp;
        String taker;
        int leftover;
        int divided;

        int[] a = new int[2];

        for (int i = 0; i < num; i++) { // writes all the kids names in this array
            kids[i] = br.readLine().toString();
        }

        for (int i = 0; i < num; i++) {
            temp = br.readLine().toString();

            String lines = br.readLine();
            String[] strs = lines.trim().split("\\s+");
            for (int f = 0; f < strs.length; f++) {
                a[f] = Integer.parseInt(strs[f]);
            }

            for (int m = 0; m < num; m++) {
                if (kids[m].equals(temp)) {
                    money[m] = money[m] - a[0];
                }
            }

            if (a[1] != 0) {
                leftover = a[0] % a[1];
                a[0] -= leftover;
                for (int j = 0; j < num; j++) {
                    if (temp.equals(kids[j])) {
                        money[j] += leftover;
                    }
                }

                divided = a[0] / a[1];
                for (int k = 0; k < a[1]; k++) {
                    taker = br.readLine().toString();
                    for (int l = 0; l < num; l++) {
                        if (taker.equals(kids[l])) {
                            money[l] += divided;
                        }
                    }
                }
            } else {
                for (int n = 0; n < a[1]; n++) {
                    br.readLine();
                }
            }

        }

        for (int i = 0; i < num; i++) {
            pw.println(kids[i] + " " + money[i]);
        }
        pw.close();
    }
}