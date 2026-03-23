import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            Long value = Long.parseLong(br.readLine());
            if (value != 0) {
                pq.offer(value);
            } else {
                Long p = pq.poll();
                bw.write(String.valueOf(
                        p == null ? 0 : p
                ));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}