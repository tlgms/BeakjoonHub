import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            q.addLast(i);
        }

        while (q.size() > 1) {
            q.pollFirst();
            q.addLast(q.pollFirst());
        }

        bw.write(Integer.toString(q.peekFirst()));
        bw.flush();
    }
}
