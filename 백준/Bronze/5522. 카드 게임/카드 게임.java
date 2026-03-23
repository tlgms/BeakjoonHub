import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        int point = 0;
        for (int i = 0; i < 5; i++) {
            point += Integer.parseInt(br.readLine());
        }
        
        bw.write(String.valueOf(
                point
        ));

        bw.flush();
        bw.close();
    }
}