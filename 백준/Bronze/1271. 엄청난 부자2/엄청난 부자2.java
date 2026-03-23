import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // "n m" 한 줄 입력

        BigInteger n = new BigInteger(st.nextToken());
        BigInteger m = new BigInteger(st.nextToken());

        BigInteger[] qr = n.divideAndRemainder(m);

        StringBuilder sb = new StringBuilder();
        sb.append(qr[0]).append('\n').append(qr[1]);
        System.out.print(sb.toString());
    }
}
