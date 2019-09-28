
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

        HashMap<String, Integer> days = new HashMap<>();
        days.put(monday, 1);
        days.put(tuesday, 2);
        days.put(wednesday, 3);
        days.put(thursday, 4);
        days.put(friday, 5);
        days.put(saturday, 6);
        days.put(sunday, 7);

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

        var start = days.get(monday);
        int daysinmonth = 0;
        for (int i = 0; i < N; i++) {
            int year = 1900 + i;
            for(String m : months.keyset){
                if (m == february){
                    if (year % 400 == 0){
                        daysinmonth = 29;
                    }
                    if (year % 100 == 0 && year % 4 == 0){









                        
                    }
                }
            }

        }

        pw.close();
    }
}