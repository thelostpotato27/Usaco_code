
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

        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day = 0;
        for (int y = 1900; y < 1900 + N; y++) {
            for (int m = 1; m<=12; m++) {
                
                days[day]++;

                int daysinmonth = 0;
                // find out why the code output is slightly off. I think it's because of the
                // leap years,
                // that's the only thing I can think of because of how small the error is.


                if (m == 2) {
                    if (y % 400 == 0) {
                        daysinmonth = 29;
                    } else if ((y % 100 != 0) && (y % 4 == 0)) {
                        daysinmonth = 29;
                    } else {
                        daysinmonth = 28;
                    }
                } else {
                    daysinmonth = months[m];
                }
                
                


                day = ((daysinmonth + day) % 7) ;
            }
        }
        
        pw.print(days[5] + " ");
        pw.print(days[6] + " ");

        for (int k = 0; k < 5; k++) {
            pw.print(days[k] + " ");
        }
        pw.close();
    }

}