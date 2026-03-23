import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static long row(long n) {
        return (n - 1) % 4 + 1;
    }
    private static long col(long n) {
        return (n - 1) / 4 + 1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long dist = Math.abs(row(a) - row(b)) + Math.abs(col(a) - col(b));
        System.out.println(dist);
    }
}
