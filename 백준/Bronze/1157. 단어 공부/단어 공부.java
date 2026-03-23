import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] cnt = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a' <= c && c <= 'z') c = (char) (c - 'a' + 'A');
            cnt[c - 'A']++;
        }

        int max = 0;
        for (int v : cnt) max = Math.max(max, v);

        int maxCount = 0, idx = -1;
        for (int i = 0; i < 26; i++) {
            if (cnt[i] == max) {
                maxCount++;
                idx = i;
            }
        }

        if (maxCount > 1) {
            System.out.print('?');
        } else {
            System.out.print((char) ('A' + idx));
        }
    }
}
