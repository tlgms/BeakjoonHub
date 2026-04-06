import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st;
//
//        st = new StringTokenizer(br.readLine());

        String firstStation = br.readLine();
        String secondStation = br.readLine();

        bw.write(
                (firstStation.equals(secondStation)) ? "0" : "1550"
        );

        bw.flush();
        bw.close();
    }
}