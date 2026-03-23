import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String binaryA = st.nextToken();
        String binaryB = st.nextToken();

        BigInteger numA = new BigInteger(binaryA, 2);
        BigInteger numB = new BigInteger(binaryB, 2);

        BigInteger sum = numA.add(numB);
        
        System.out.println(sum.toString(2));
    }
}