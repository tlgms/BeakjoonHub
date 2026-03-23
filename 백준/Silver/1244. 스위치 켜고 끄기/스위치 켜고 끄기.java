import java.io.*;
import java.util.*;

public class Main {
    private static void toggle(int[] a, int i) {
        a[i] = 1 - a[i];
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] sw = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) sw[i] = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            int idx = num - 1;

            if (gender == 1) {
                for (int j = num; j <= n; j += num) {
                    toggle(sw, j - 1);
                }
            } else {
                toggle(sw, idx);

                int k = 1;
                while (idx - k >= 0 && idx + k < n && sw[idx - k] == sw[idx + k]) {
                    toggle(sw, idx - k);
                    toggle(sw, idx + k);
                    k++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(sw[i]).append(' ');
            if ((i + 1) % 20 == 0) sb.append('\n');
        }
        System.out.print(sb.toString());
    }
}