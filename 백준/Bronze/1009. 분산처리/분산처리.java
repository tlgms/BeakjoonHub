import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int base = a % 10;

            int result = 1;

            if (base == 0) {
                result = 10;
            } else if (base == 1 || base == 5 || base == 6) {
                result = base;
            } else if (base == 4 || base == 9) {
                int exp = b % 2;
                if (exp == 0) {
                    result = (base * base) % 10;
                } else {
                    result = base;
                }
            } else {
                int exp = b % 4;
                if (exp == 0) {
                    result = (int) Math.pow(base, 4) % 10;
                } else {
                    result = (int) Math.pow(base, exp) % 10;
                }
            }

            sb.append(result).append("\n");
        }
        
        System.out.print(sb.toString());
    }
}