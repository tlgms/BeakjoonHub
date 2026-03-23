import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a < min) min = a;
            if (a > max) max = a;
        }

        int ans = min * max;
        System.out.println(ans);

        sc.close();
    }
}