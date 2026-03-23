import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine().trim());

        int cnt = 0;
        for (int stick = 64; X > 0; stick >>= 1) {
            if (stick <= X) {
            X -= stick;
            cnt++;
            }
        }
        System.out.println(cnt);
    }
}