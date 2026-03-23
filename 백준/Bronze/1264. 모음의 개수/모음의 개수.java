import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();

            if (line.equals("#")) {
                break;
            }

            int vowelCount = 0;

            String lowerCaseLine = line.toLowerCase();

            for (int i = 0; i < lowerCaseLine.length(); i++) {
                char ch = lowerCaseLine.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                }
            }

            System.out.println(vowelCount);
        }
    }
}