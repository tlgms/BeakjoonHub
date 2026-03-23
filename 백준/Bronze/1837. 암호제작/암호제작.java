import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        BigInteger P = new BigInteger(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        long a = 0;
        long b = 0;

        for (int i = 2; i < K; i++) {
            if (P.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                a = i;
                b = P.divide(BigInteger.valueOf(i)).longValue();

//                System.out.println(a + " " + b);
                break;
            }
        }

        if (a == 0 || b == 0) {
            bw.write("GOOD");
        } else if (a < K) {
            bw.write(String.valueOf("BAD " + a));
        } else if (b < K) {
            bw.write(String.valueOf("BAD " + b));
        } else {
            bw.write("GOOD");
        }

        bw.flush();
        bw.close();
    }
}