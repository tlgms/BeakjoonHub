import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            BigInteger fackA = BigInteger.ONE;
            BigInteger fackB = BigInteger.ONE;
            BigInteger fackAB = BigInteger.ONE;

            fackA = factorial(a);
            fackB = factorial(b);
            fackAB = factorial(b - a);

            BigInteger bigRes = fackB.divide(fackA.multiply(fackAB));

            int res = bigRes.intValue();

            System.out.println(res);
        }
        sc.close();
    }
}