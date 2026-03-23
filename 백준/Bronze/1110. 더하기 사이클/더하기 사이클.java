import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        int copy = N;
        int count = 0;

        do {
            int sum = (copy / 10) + (copy % 10);
            copy = (copy % 10) * 10 + (sum % 10);
            count++;
        } while (copy != N);
        System.out.println(count);
    }
}