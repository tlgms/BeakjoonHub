import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int n = 0; n < N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            BigInteger a = new BigInteger(st.nextToken());

            bw.write(String.valueOf(
                    a.add(new BigInteger(st.nextToken()))
            ));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}