import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();

        int[] cnt = new int[10];
        for (int i = 0; i < n.length(); i++) {
            int num = n.charAt(i) - '0';
            cnt[num]++;
        }

        int sixNine = cnt[6] + cnt[9];
        cnt[6] = (sixNine + 1) / 2;
        cnt[9] = 0;

        int answer = 0;

        for (int i = 0; i < 10; i++) {
            answer = Math.max(answer, cnt[i]);
        }

        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
    }
}