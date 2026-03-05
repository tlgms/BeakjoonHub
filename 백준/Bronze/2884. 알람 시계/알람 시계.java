import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int time = Integer.parseInt(st.nextToken());
        int minutes = Integer.parseInt(st.nextToken());

        if ((minutes - 45) < 0) {
            time--;
            minutes += 60;
            minutes -= 45;
        } else {
            minutes -= 45;
        }

        if (time < 0) {
            time = 23;
        }

        bw.write(String.valueOf(time + " " + minutes));

        bw.flush();
        bw.close();
    }
}