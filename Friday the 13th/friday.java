
/*
ID: thelost2
LANG: JAVA
PROG: friday
*/
import java.io.*;
import java.util.*;

class friday {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("friday.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("friday.out"));

        int[] days = new int[7]; // days[0] is saturday

        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> months = new HashMap<>();

        months.put("january", 31);
        months.put("february", 28);
        months.put("march", 31);
        months.put("april", 30);
        months.put("may", 31);
        months.put("june", 30);
        months.put("july", 31);
        months.put("august", 31);
        months.put("september", 30);
        months.put("october", 31);
        months.put("november", 30);
        months.put("december", 31);

        int start = 1;
        int daysinmonth = 0;
        for (int i = 0; i < N; i++) {
            int year = 1900 + i;
            for (String m : months.keySet()) {
                if (m == "february") {
                    if (year % 400 == 0) {
                        daysinmonth = 29;
                    } else if (year % 100 != 0 && year % 4 == 0) {
                        daysinmonth = 29;
                    } else {
                        daysinmonth = 28;
                    }
                }

                if (m != "february") {
                    daysinmonth = months.get(m);
                }

                if (start == 7) {
                    days[0] += 1;
                }
                if (start == 6) {
                    days[6] += 1;
                }
                if (start == 5) {
                    days[5] += 1;
                }
                if (start == 4) {
                    days[4] += 1;
                }
                if (start == 3) {
                    days[3] += 1;
                }
                if (start == 2) {
                    days[2] += 1;
                }
                if (start == 1) {
                    days[1] += 1;
                }
                start = ((daysinmonth - (start - 1)) % 7) + 1;
            }
        }

        for (int i = 0; i < 7; i++) {
            pw.print(days[i] + " ");
        }
        pw.close();
    }

}