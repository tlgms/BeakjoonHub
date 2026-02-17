import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int a = Integer.parseInt(br.readLine()); a > 0; a--) {
            for (int i = a; i > 0; i--) {
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}