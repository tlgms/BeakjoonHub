import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int a = Integer.parseInt(br.readLine());

            if (a == 0) {
                break;
            }

            int b = 0;
            for  (int i = 1; i <= a; i++) {
                b += i;
            }

            bw.write(String.valueOf(b));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}