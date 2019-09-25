import java.io.*;
import java.util.*;

class s1{
    public static void main(String[] args) throws IOException { 
        //the throws IOExeption is important
        
        BufferedReader br = new BufferedReader(new FileReader("inputOutput.in"));
        //lets us read the file

        PrintWriter pw = new PrintWriter(new FileWriter("InputOutput.out"));
        //lets us output this stuff

        int N = Integer.parseInt(br.readLine());

        pw.print(N);

        //for (int i = 0; i < N; i++){
        //    System.out.println(br.readLine());
        //}

        for (int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            //makes the numbers into tokens
            int A = Integer.parseInt(st.nextToken());
            //grabs the first token
            int B = Integer.parseInt(st.nextToken());
            //grabs the second token

            System.out.println(C + " " + B);
        }


        pw.close();
    }
}