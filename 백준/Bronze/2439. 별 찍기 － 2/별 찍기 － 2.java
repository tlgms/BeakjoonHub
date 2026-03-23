import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            for (int s = 0; s < N - i; s++) sb.append(' ');
            for (int k = 0; k < i; k++) sb.append('*');
            sb.append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
