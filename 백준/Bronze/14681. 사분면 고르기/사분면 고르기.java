import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        if (x > 0) {
            if (y > 0) {
                bw.write(String.valueOf(1));
            } else if (y < 0) {
                bw.write(String.valueOf(4));
            }
        }
        if (x < 0) {
            if (y < 0) {
                bw.write(String.valueOf(3));
            } else if (y > 0) {
                bw.write(String.valueOf(2));
            }
        }

        bw.flush();
        bw.close();
    }
}