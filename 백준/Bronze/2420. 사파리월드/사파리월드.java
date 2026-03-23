import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Long N = Long.parseLong(st.nextToken());
        Long M = Long.parseLong(st.nextToken());

        bw.write(String.valueOf(Math.abs(N - M)));
        bw.flush();
        bw.close();
    }
}