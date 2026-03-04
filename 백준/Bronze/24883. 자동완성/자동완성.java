import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        char word = br.readLine().charAt(0);

        bw.write(String.valueOf(
                (word == 'n' || word == 'N') ? "Naver D2" : "Naver Whale"
        ));

        bw.flush();
        bw.close();
    }
}