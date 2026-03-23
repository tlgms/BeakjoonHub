import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        char[] iaah = br.readLine().toCharArray();
        char[] caah = br.readLine().toCharArray();

        if (iaah.length < caah.length) {
            bw.write("no");
        } else {
            bw.write("go");
        }

        bw.close();
        br.close();
    }
}