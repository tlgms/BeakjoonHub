import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (A[i] < X) {
                numbers.add(A[i]);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            bw.write(
                    String.valueOf(numbers.get(i))
            );

            if (i != (numbers.size() - 1)) {
                bw.write(" ");
            }
        }

        bw.flush();
        bw.close();
    }
}