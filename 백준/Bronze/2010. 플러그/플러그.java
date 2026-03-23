import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(br.readLine().trim());
        }

        long result = sum - (N - 1);
        System.out.print(result);
    }
}
