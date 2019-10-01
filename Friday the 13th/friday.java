
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

        int[][] days = new int[7][2];

        for (int f = 0; f < 7; f++) { //trying to use a double array to convert leftoverdays into days of the week
            
        }

        HashMap<Integer, Integer> months = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        months.put(january, 31);
        months.put(february, 28);
        months.put(march, 31);
        months.put(april, 30);
        months.put(may, 31);
        months.put(june, 30);
        months.put(july, 31);
        months.put(august, 31);
        months.put(september, 30);
        months.put(october, 31);
        months.put(november, 30);
        months.put(december, 31);

        int start = 1;
        int daysinmonth = 0;
        int leftover_days = 0;
        for (int i = 0; i < N; i++) {
            int year = 1900 + i;
            for (String m : months.keyset) {
                if (m == february) {
                    if (year % 400 == 0) {
                        daysinmonth = 29;
                        continue;
                    }
                    if (year % 100 != 0 && year % 4 == 0) {
                        daysinmonth = 29;
                        continue;
                    }
                }
                if (m != february){
                    daysinmonth = months.get(m);
                }
            }
            if (start == 7){
                friday13_count += 1;
            }
            leftover_days = ((daysinmonth + start) % 7) + 1;
        }
        
        pw.close();
    }
}