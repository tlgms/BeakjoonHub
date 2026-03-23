import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean isValidTime(int h, int m, int s) {
        return (h >= 1 && h <= 12) && (m >= 0 && m <= 59) && (s >= 0 && s <= 59);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        
        int part1 = Integer.parseInt(st.nextToken());
        int part2 = Integer.parseInt(st.nextToken());
        int part3 = Integer.parseInt(st.nextToken());
        
        int count = 0;
        
        if (isValidTime(part1, part2, part3)) {
            count++;
        }
        if (isValidTime(part1, part3, part2)) {
            count++;
        }
        if (isValidTime(part2, part1, part3)) {
            count++;
        }
        if (isValidTime(part2, part3, part1)) {
            count++;
        }
        if (isValidTime(part3, part1, part2)) {
            count++;
        }
        if (isValidTime(part3, part2, part1)) {
            count++;
        }
        
        System.out.println(count);
    }
}