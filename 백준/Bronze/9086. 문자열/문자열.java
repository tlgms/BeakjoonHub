import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            char[] word = br.readLine().toCharArray();

            bw.write(String.valueOf(
                    word.length >= 1 ? String.valueOf(word[0]) + String.valueOf(word[word.length - 1]) : String.valueOf(word[0]) + String.valueOf(word[0])
            ));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}