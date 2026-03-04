import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        String hongjun = br.readLine();

        bw.write(":fan::fan::fan:\n:fan::" + hongjun + "::fan:\n:fan::fan::fan:");

        bw.flush();
        bw.close();
    }
}