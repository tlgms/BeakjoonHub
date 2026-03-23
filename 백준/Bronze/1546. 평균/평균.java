import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double maxScore = 0;
        double sum = 0;
        
        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(st.nextToken());
            if (score > maxScore) {
                maxScore = score;
            }
            sum += score;
        }
        
        double newAverage = (sum / maxScore * 100) / N;

        System.out.println(newAverage);
    }
}