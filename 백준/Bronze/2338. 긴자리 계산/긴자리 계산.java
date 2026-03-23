import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        
        BigInteger sum = A.add(B);
        BigInteger difference = A.subtract(B);
        BigInteger product = A.multiply(B);

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);

        sc.close();
    }
}