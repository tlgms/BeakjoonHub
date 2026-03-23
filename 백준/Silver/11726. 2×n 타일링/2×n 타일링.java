import java.io.*;
import java.util.*;

class Main {
    public static long fib(int n) {
        if (n <= 1) return n;

        long a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            long c = (a + b) % 10007;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfStairs = Integer.parseInt(br.readLine());

        long Cases = fib(numberOfStairs + 1);

        bw.write(String.valueOf(Cases));

        bw.close();
        br.close();
    }
}