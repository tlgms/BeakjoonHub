import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int fucks[] = new int[5];

        for (int i = 0; i < 5; i++) {
            fucks[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 5; i++) {
            fucks[i] = fucks[i] * fucks[i];
        }
        
        int fuck = 0;
        
        for (int i = 0; i < 5; i++) {
            fuck += fucks[i];
        }

        bw.write(String.valueOf(fuck % 10));
        
        bw.flush();
        bw.close();
    }
}